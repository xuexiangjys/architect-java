package designpattern.structure.decorator;


/**
 * 装饰器
 *
 * @author xuexiang
 * @since 2020/3/28 6:57 PM
 */
public class Decorator implements ITarget {

    private ITarget mTarget;

    public Decorator(ITarget target) {
        super();
        mTarget = target;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        mTarget.method();
        System.out.println("after decorator!");
    }
}
