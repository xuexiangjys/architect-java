package designpattern.behavior.command;

/**
 * 命令
 *
 * @author xuexiang
 * @since 2020/3/28 11:36 PM
 */
public class Command implements ICommand {

    private Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令被下发给指定的接收者...");
        receiver.action();
    }
}
