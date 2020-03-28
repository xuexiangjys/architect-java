package designpattern.creation.abstractfactory;

import designpattern.creation.abstractfactory.factory.Provider;
import designpattern.creation.abstractfactory.factory.SendTwoTimeSmsFactory;
import designpattern.creation.abstractfactory.product.Sender;

/**
 * 抽象工厂模式，工厂是抽象的，产品是抽象的。
 * <p>
 * 剥离工厂与产品之前的耦合，便于扩展
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924434
 *
 * @author xuexiang
 * @since 2020/3/28 3:48 PM
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendTwoTimeSmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
