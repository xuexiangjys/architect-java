package designpattern.structure.facade;


public class Memory implements IComponent {

    @Override
    public void startup() {
        System.out.println("memory startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("memory shutdown!");
    }
}
