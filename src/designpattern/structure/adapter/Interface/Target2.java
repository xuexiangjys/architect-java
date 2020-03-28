package designpattern.structure.adapter.Interface;

public class Target2 extends TargetAdapter {

    @Override
    public void method2() {
        super.method2();
        printMethodInfo("Target2-method2");
    }
}
