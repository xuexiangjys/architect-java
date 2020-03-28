package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Sender;
import designpattern.creation.abstractfactory.product.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
