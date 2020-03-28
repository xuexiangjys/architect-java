package designpattern.behavior.command;

/**
 * 命令的下方者
 *
 * @author xuexiang
 * @since 2020/3/28 11:39 PM
 */
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        System.out.println("司令下方命令...");
        command.execute();
    }
}
