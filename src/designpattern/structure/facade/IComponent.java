package designpattern.structure.facade;

/**
 * 组件
 *
 * @author xuexiang
 * @since 2020/3/28 9:08 PM
 */
public interface IComponent {

    /**
     * 启动
     */
    void startup();

    /**
     * 关闭
     */
    void shutdown();
}
