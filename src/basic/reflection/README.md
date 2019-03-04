# Java反射

> 说到Java中的反射使用，大家肯定不陌生，但是在真正使用的时候却犯了难。因为不经常使用的关系，当真正需要使用反射的时候却经常忘记该怎么写了，真的是非常尴尬...

为此，我特地分类整理了一些常用的反射使用方法，以方便大家使用。

## 反射设置属性

### 反射设置某个对象的成员属性

```
/**
 * 反射设置某个对象的成员属性
 *
 * @param owner     对象
 * @param fieldName 属性名
 * @param value     属性值
 * @return
 * @throws Exception
 */
public static void setField(Object owner, String fieldName, Object value)
        throws Exception {
    Class<?> ownerClass = owner.getClass();
    Field field = ownerClass.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(owner, value);
}
```

### 反射设置某个类的静态属性

```
/**
 * 反射设置某个类的静态属性
 *
 * @param className 类名
 * @param fieldName 属性名
 * @param value     属性值
 * @return
 * @throws Exception
 */
public static void setStaticField(String className, String fieldName, Object value)
        throws Exception {
    Class<?> ownerClass = Class.forName(className);
    Field field = ownerClass.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(null, value);
}

/**
 * 反射设置某个类的静态属性
 *
 * @param clazz     类
 * @param fieldName 属性名
 * @param value     属性值
 * @return
 * @throws Exception
 */
public static void setStaticField(Class<?> clazz, String fieldName, Object value)
        throws Exception {
    Field field = clazz.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(null, value);
}
```

---

## 反射获取属性

### 反射获取某个对象的成员属性

```
/**
 * 反射获取某个对象的成员属性
 *
 * @param owner     对象
 * @param fieldName 属性名
 * @return
 * @throws Exception
 */
public static Object getField(Object owner, String fieldName)
        throws Exception {
    Class<?> ownerClass = owner.getClass();
    Field field = ownerClass.getDeclaredField(fieldName);
    field.setAccessible(true);
    return field.get(owner);
}
```

### 反射获取某个类的静态属性

```
/**
 * 反射获取某个类的静态属性
 *
 * @param className 类名
 * @param fieldName 属性名
 * @return
 * @throws Exception
 */
public static Object getStaticField(String className, String fieldName)
        throws Exception {
    Class<?> ownerClass = Class.forName(className);
    Field field = ownerClass.getDeclaredField(fieldName);
    field.setAccessible(true);
    return field.get(ownerClass);
}

/**
 * 反射获取某个类的静态属性
 *
 * @param clazz     类
 * @param fieldName 属性名
 * @return
 * @throws Exception
 */
public static Object getStaticField(Class<?> clazz, String fieldName)
        throws Exception {
    Field field = clazz.getDeclaredField(fieldName);
    field.setAccessible(true);
    return field.get(clazz);
}
```

---

## 反射执行方法

### 注意点

* 对于我们封装的方法来说，当方法的参数类型是int、boolean、short等基础类型时，使用`getClass()`方法获取到的类型将是Integer、Boolean、Short等包装类，在调用getDeclaredMethod获取方法对象的时候就会抛异常NoSuchMethodException;

* 如果调用的方法属于该对象的父类,那getDeclaredMethod就会抛异常NoSuchMethodException;

### 获取参数的类集合方法

```
/**
 * 获取参数的类集合
 *
 * @param args
 * @return
 */
private static Class<?>[] getClasses(Object... args) {
    Class<?>[] argsClass;
    if (args != null && args.length > 0) {
        argsClass = new Class[args.length];
        for (int i = 0, j = args.length; i < j; i++) {
            argsClass[i] = args[i].getClass();
        }
    } else {
        argsClass = new Class[0];
    }
    return argsClass;
}
```

### 反射执行某对象的成员方法

```
/**
 * 反射执行某对象的成员方法
 *
 * @param owner      对象
 * @param methodName 方法名
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeMethod(Object owner, String methodName,
                                  Object... args) throws Exception {
    Class<?> ownerClass = owner.getClass();
    Class<?>[] argsClass = getClasses(args);
    Method method = ownerClass.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(owner, args);
}

/**
 * 反射执行某对象的成员方法（对于参数是基础类型的方法，反射时用getClass获取的是包装类型，会出错）
 *
 * @param owner      对象
 * @param methodName 方法名
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeMethod(Object owner, String methodName,
                                  Class<?>[] argsClass, Object... args) throws Exception {
    Class<?> ownerClass = owner.getClass();
    Method method = ownerClass.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(owner, args);
}
```


### 反射执行某个类的静态方法

```
/**
 * 反射执行某个类的静态方法
 *
 * @param className  类名
 * @param methodName 方法名
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeStaticMethod(String className,
                                        String methodName, Object... args) throws Exception {
    Class<?> ownerClass = Class.forName(className);
    Class<?>[] argsClass = getClasses(args);
    Method method = ownerClass.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(null, args);
}

/**
 * 反射执行某个类的静态方法
 *
 * @param clazz      类
 * @param methodName 方法名
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeStaticMethod(Class<?> clazz,
                                        String methodName, Object... args) throws Exception {
    Class<?>[] argsClass = getClasses(args);
    Method method = clazz.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(null, args);
}

/**
 * 反射执行某个类的静态方法（对于参数是基础类型的方法，反射时用getClass获取的是包装类型，会出错）
 *
 * @param className  类名
 * @param methodName 方法名
 * @param argsClass  参数类型的集合
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeStaticMethod(String className,
                                        String methodName, Class<?>[] argsClass, Object... args) throws Exception {
    Class<?> ownerClass = Class.forName(className);
    Method method = ownerClass.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(null, args);
}

/**
 * 反射执行某个类的静态方法（对于参数是基础类型的方法，反射时用getClass获取的是包装类型，会出错）
 *
 * @param clazz      类
 * @param methodName 方法名
 * @param argsClass  参数类型的集合
 * @param args       参数集合
 * @return
 * @throws Exception
 */
public static Object invokeStaticMethod(Class<?> clazz,
                                        String methodName, Class<?>[] argsClass, Object... args) throws Exception {
    Method method = clazz.getDeclaredMethod(methodName, argsClass);
    method.setAccessible(true);
    return method.invoke(null, args);
}
```

---

## 反射构建实例

```
/**
 * 反射构建实例
 *
 * @param className 类名
 * @param args      构造函数的参数集合
 * @return
 * @throws Exception
 */
public static Object newInstance(String className, Object... args)
        throws Exception {
    Class<?> newOneClass = Class.forName(className);
    Class<?>[] argsClass = getClasses(args);
    Constructor<?> cons = newOneClass.getDeclaredConstructor(argsClass);
    cons.setAccessible(true);
    return cons.newInstance(args);
}

/**
 * 反射构建实例
 *
 * @param clazz 类
 * @param args  构造函数的参数集合
 * @return
 * @throws Exception
 */
public static <T> T newInstance(Class<T> clazz, Object... args)
        throws Exception {
    Class<?>[] argsClass = getClasses(args);
    Constructor<?> cons = clazz.getDeclaredConstructor(argsClass);
    cons.setAccessible(true);
    return (T) cons.newInstance(args);
}

/**
 * 反射构建实例（对于参数是基础类型的方法，反射时用getClass获取的是包装类型，会出错）
 *
 * @param className 类名
 * @param argsClass 参数类型的集合
 * @param args      构造函数的参数集合
 * @return
 * @throws Exception
 */
public static Object newInstance(String className, Class<?>[] argsClass, Object... args)
        throws Exception {
    Class<?> newOneClass = Class.forName(className);
    Constructor<?> cons = newOneClass.getDeclaredConstructor(argsClass);
    cons.setAccessible(true);
    return cons.newInstance(args);
}

/**
 * 反射构建实例（对于参数是基础类型的方法，反射时用getClass获取的是包装类型，会出错）
 *
 * @param clazz     类
 * @param argsClass 参数类型的集合
 * @param args      构造函数的参数集合
 * @return
 * @throws Exception
 */
public static <T> T newInstance(Class<T> clazz, Class<?>[] argsClass, Object... args)
        throws Exception {
    Constructor<?> cons = clazz.getDeclaredConstructor(argsClass);
    cons.setAccessible(true);
    return (T) cons.newInstance(args);
}
```

---

## 测试

### 测试所需的类

```
/**
 * 学生类
 *
 * @author xuexiang
 * @since 2019/3/4 下午8:36
 */
public class Student {

    /**
     * 用于测试反射获取静态属性
     */
    private static long TotalNumber = 28;

    public int ID;

    /**
     * 用于测试反射获取成员属性
     */
    private String Name;

    private int Age = 20;

    private int Sex;

    private int Score;

    private Student() {

    }

    /**
     * 用于测试反射构建实例
     */
    private Student(int ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public Student(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        Age = age;
    }

    public Student(int ID, String name, int age, int sex, int score) {
        this.ID = ID;
        Name = name;
        Age = age;
        Sex = sex;
        Score = score;
    }

    /**
     * 用于测试反射调用成员方法
     * @return
     */
    private String getName(Integer param) {
        return Name;
    }

    /**
     * 用于测试反射调用成员方法
     * @return
     */
    private Student setName(String name) {
        Name = name;
        return this;
    }

    /**
     * 用于测试反射调用静态方法
     * @return
     */
    private static long incrementTotalNumber(int number) {
        return TotalNumber + number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Sex=" + Sex +
                ", Score=" + Score +
                "}, TotalNumber=" + TotalNumber;
    }
}

/**
 * 继承了Student，用于测试"如果调用的方法属于该对象的父类,那getDeclaredMethod就会抛异常NoSuchMethodException"的问题
 *
 * @author xuexiang
 * @since 2019/3/4 下午10:12
 */
public class GoodStudent extends Student {

    private int AchievementCount = 3;


    public GoodStudent(int ID, String name, int age, int sex, int score) {
        super(ID, name, age, sex, score);
    }

    public GoodStudent(Student student) {
        super(student.ID + 1, "xxxx", 22);
    }

    public int getAchievementCount() {
        return AchievementCount;
    }

    public GoodStudent setAchievementCount(int achievementCount) {
        AchievementCount = achievementCount;
        return this;
    }
}
```


### 测试方法

```
/**
 * 测试
 *
 * @param args
 */
public static void main(String[] args) {
    Student student = new Student(123, "xxxxxx", 25, 0, 100);
    System.out.println(student);

    System.out.println("--------测试反射属性设置------------");
    //反射设置某个对象的成员属性
    try {
        ReflectionUtils.setField(student, "Name", "xuexiang");
    } catch (Exception e) {
        e.printStackTrace();
    }
    //反射设置某个对象的静态属性
    try {
        ReflectionUtils.setStaticField(Student.class, "TotalNumber", 1111);
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("--------测试反射属性获取------------");
    //反射获取某个对象的成员属性
    try {
        System.out.println("Name:" + ReflectionUtils.getField(student, "Name"));
    } catch (Exception e) {
        e.printStackTrace();
    }
    //反射获取某个对象的静态属性
    try {
        System.out.println("TotalNumber:" + ReflectionUtils.getStaticField(Student.class, "TotalNumber"));
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("--------测试反射方法执行------------");
    //反射执行某对象的成员方法
    try {
        System.out.println("getName():" + ReflectionUtils.invokeMethod(student, "getName", 23));
    } catch (Exception e) {
        e.printStackTrace();
    }

//        //反射执行某对象父类的成员方法（将会出错）
//        try {
//            GoodStudent goodStudent = new GoodStudent(student);
//            System.out.println("getName():" + ReflectionUtils.invokeMethod(goodStudent, "getName", 23));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    //反射执行某个类的静态方法
    try {
        //对于参数是基础类型的方法，反射时用getClass获取的是包装类型，所以需要传入参数的类数组
        System.out.println("incrementTotalNumber():" + ReflectionUtils.invokeStaticMethod(Student.class, "incrementTotalNumber", new Class[]{int.class}, 2));
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("--------测试反射构建实例------------");
    //反射构建实例
    try {
        Student student1 = ReflectionUtils.newInstance(Student.class, new Class[]{int.class, String.class}, 22334455, "xuexiangjys");
        System.out.println(student1);
    } catch (Exception e) {
        e.printStackTrace();
    }

//        //反射父类的构造方法构建实例（将会出错）
//        try {
//            GoodStudent student2 = ReflectionUtils.newInstance(GoodStudent.class, new Class[]{int.class, String.class}, 22334455, "xuexiangjys");
//            System.out.println(student2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

}
```




