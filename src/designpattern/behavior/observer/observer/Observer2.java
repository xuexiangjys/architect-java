package designpattern.behavior.observer.observer;

/**
 * 观察者2
 *
 * @author xuexiang
 * @since 2020/3/28 11:05 PM
 */
public class Observer2 implements Observer {

	@Override
	public void onChanged() {
		System.out.println("observer2 has received!");
	}

}
