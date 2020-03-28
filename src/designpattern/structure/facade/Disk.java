package designpattern.structure.facade;

public class Disk implements IComponent {

    @Override
    public void startup() {
        System.out.println("disk startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("disk shutdown!");
    }
}
