package designpattern.structure.facade;

public class CPU implements IComponent {

    @Override
    public void startup() {
        System.out.println("cpu startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}
