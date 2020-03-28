package designpattern.behavior.mediator;


/**
 * 中介者实现接口
 *
 * @author xuexiang
 * @since 2020/3/29 12:37 AM
 */
public interface Mediator {
    /**
     * 创建中介
     */
    void createMediator();

    /**
     * 中介协调的工作
     */
    void workAll();
}
