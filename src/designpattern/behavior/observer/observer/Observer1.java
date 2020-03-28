package designpattern.behavior.observer.observer;

/**
 * 观察者1
 *
 * @author xuexiang
 * @since 2020/3/28 11:05 PM
 */
public class Observer1 implements Observer {
	@Override
	public void onChanged() {
		System.out.println("observer1 has received!");
	}
}
