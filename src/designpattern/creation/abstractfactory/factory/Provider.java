package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Sender;

/**
 * 抽象工厂的生产接口，生产消息发送者Sender
 *
 * @author xuexiang
 * @since 2020/3/28 3:39 PM
 */
public interface Provider {

	Sender produce();
}
