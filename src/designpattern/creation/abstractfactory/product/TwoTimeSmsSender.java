package designpattern.creation.abstractfactory.product;

public class TwoTimeSmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("send TwoTime!");
		System.out.println("send TwoTime!");
	}

}
