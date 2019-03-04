package basic.reflection;

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
