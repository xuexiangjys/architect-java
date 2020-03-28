package designpattern.behavior.observer.subject;

import designpattern.behavior.observer.observer.Observer;

/**
 * 被观察者
 *
 * @author xuexiang
 * @since 2020/3/28 11:02 PM
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void register(Observer observer);

    /**
     * 注销观察者
     *
     * @param observer
     */
    void unregister(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     *
     */
    void operation();
}
