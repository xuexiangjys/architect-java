package designpattern.behavior.mediator;

/**
 * 抽象用户
 *
 * @author xuexiang
 * @since 2020/3/29 12:38 AM
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
