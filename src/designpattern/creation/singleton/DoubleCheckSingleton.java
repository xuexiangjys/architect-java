package designpattern.creation.singleton;

/**
 * 双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。（推荐使用这种单例模式写法）
 *
 * @author xuexiang
 * @since 2020/3/28 4:22 PM
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton sInstance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckSingleton();
                }
            }
        }
        return sInstance;
    }

}
