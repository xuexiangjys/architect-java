package designpattern.creation.factory;

/**
 * 工厂模式是我们最常用的实例化对象模式了，是用工厂方法代替new操作的一种模式。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924434
 *
 * @author xuexiang
 * @since 2020/3/28 11:49 PM
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
