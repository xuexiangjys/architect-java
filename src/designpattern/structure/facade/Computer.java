package designpattern.structure.facade;

/**
 * 将组件组合起来，对外形成一个整体
 *
 * @author xuexiang
 * @since 2020/3/28 9:10 PM
 */
public class Computer implements IComponent {

    private IComponent cpu;
    private IComponent memory;
    private IComponent disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    @Override
    public void startup() {
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    @Override
    public void shutdown() {
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
