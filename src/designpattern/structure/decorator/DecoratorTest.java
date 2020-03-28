package designpattern.structure.decorator;

/**
 * 装饰模式指的是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 * <p>
 * 突出对装饰对象的功能 "增强" 作用。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 6:59 PM
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Target target = new Target();
        target.method();

        ITarget obj = new Decorator(target);
        obj.method();
    }
}
