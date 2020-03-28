package designpattern.structure.decorator;


/**
 * 目标装饰对象
 *
 * @author xuexiang
 * @since 2020/3/28 6:58 PM
 */
public class Target implements ITarget {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
