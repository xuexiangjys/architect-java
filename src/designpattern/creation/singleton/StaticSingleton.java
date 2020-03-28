package designpattern.creation.singleton;

/**
 * 静态内部类实现的单例模式，
 *
 * @author xuexiang
 * @since 2020/3/28 4:06 PM
 */
public final class StaticSingleton {

    /**
     * 私有构造方法，防止被实例化
     */
    private StaticSingleton() {
    }

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static StaticSingleton sInstance = new StaticSingleton();
    }

    /**
     * @return 获取实例
     */
    public static StaticSingleton getInstance() {
        return SingletonFactory.sInstance;
    }

    /**
     * @return 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }
}
