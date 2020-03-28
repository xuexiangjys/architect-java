package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Sender;
import designpattern.creation.abstractfactory.product.TwoTimeSmsSender;

/**
 * 生产发送两次的Sender工厂
 *
 * @author xuexiang
 * @since 2020/3/28 3:42 PM
 */
public class SendTwoTimeSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new TwoTimeSmsSender();
	}

}
