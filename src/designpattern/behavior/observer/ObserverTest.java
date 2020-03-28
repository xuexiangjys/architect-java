package designpattern.behavior.observer;

import designpattern.behavior.observer.observer.Observer1;
import designpattern.behavior.observer.observer.Observer2;
import designpattern.behavior.observer.subject.MySubject;
import designpattern.behavior.observer.subject.Subject;

/**
 * 观察者模式： 一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
 * <p>
 * ISubject是被观察者/被订阅者/事件产生者/作者，IObserver是观察者/订阅者/事件消费者/读者。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 11:02 PM
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.register(new Observer1());
        sub.register(new Observer2());

        sub.operation();
    }

}
