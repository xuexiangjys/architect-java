package designpattern.behavior.command;

/**
 * 一般来说，行为请求者与行为实现者通常是一种紧耦合的关系。行为请求者通过直接持有行为实现者，调用行为实现者的实现方法来实现请求。但是一旦行为实现者发生变化，行为请求者也不可避免地需要进行相应的修改。
 * <p>
 * 命令模式就是通过在行为请求者与行为实现者中间引入中介者（命令），将行为请求者的行为动作抽象为对象（命令），行为请求者不直接操作行为实现者，而是通过操作命令间接操作行为实现者，从而实现二者之间的松耦合。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 11:36 PM
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand cmd = new Command(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
