package designpattern.structure.adapter.Interface;

public class Target1 extends TargetAdapter {

    @Override
    public void method1() {
        super.method1();
        printMethodInfo("Target1-method1");
    }
}
