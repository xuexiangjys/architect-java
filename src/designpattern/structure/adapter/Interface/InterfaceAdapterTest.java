package designpattern.structure.adapter.Interface;

/**
 * 适配器模式中的接口适配，通过定义一个抽象类来实现目标接口的方法（空方法），再继承这个抽象类，要实现哪个方法，就重写哪个方法。
 * <p>
 * 解决接口定义方法过多，有些接口方法不需要实现的问题
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 6:48 PM
 */
public class InterfaceAdapterTest {


    public static void main(String[] args) {

        ITarget target1 = new Target1();
        target1.method1();
        target1.method2();

        ITarget target2 = new Target2();
        target2.method1();
        target2.method2();
    }

}
