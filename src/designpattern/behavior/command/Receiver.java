package designpattern.behavior.command;

/**
 * 命令的接收者，执行命令的内容
 *
 * @author xuexiang
 * @since 2020/3/28 11:40 PM
 */
public class Receiver {

    public void action() {
        System.out.println("命令接收到，开始执行命令...");
    }
}
