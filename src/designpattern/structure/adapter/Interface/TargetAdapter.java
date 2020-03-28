package designpattern.structure.adapter.Interface;

/**
 * 抽象类对ITarget接口进行适配
 *
 * @author xuexiang
 * @since 2020/3/28 6:43 PM
 */
public abstract class TargetAdapter implements ITarget {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    protected void printMethodInfo(String methodName) {
        System.out.println("this is " + methodName);
    }
}
