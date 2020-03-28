package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.MailSender;
import designpattern.creation.abstractfactory.product.Sender;

/**
 * 生产发送邮件的工厂
 *
 * @author xuexiang
 * @since 2020/3/28 3:43 PM
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce(){
		return new MailSender();
	}
}
