package designpattern.creation.singleton;

/**
 * 懒汉式单例模式(存在线程安全问题)
 *
 * @author xuexiang
 * @since 2020/3/28 4:18 PM
 */
public class LazyManSingleton {

    private static LazyManSingleton sInstance;

    /**
     * 私有构造方法，防止被实例化
     */
    private LazyManSingleton() {

    }

    public static LazyManSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LazyManSingleton();
        }
        return sInstance;
    }

}
