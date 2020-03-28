package designpattern.creation.singleton;

/**
 * 饿汉式单例模式(效率不高， 浪费内存空间)
 *
 * @author xuexiang
 * @since 2020/3/28 4:14 PM
 */
public final class HungryManSingleton {

    private static final HungryManSingleton sInstance = new HungryManSingleton();

    /**
     * 私有构造方法，防止被实例化
     */
    private HungryManSingleton() {

    }

    public static HungryManSingleton getInstance() {
        return sInstance;
    }
}
