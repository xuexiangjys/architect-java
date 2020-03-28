package designpattern.structure.adapter.clazz;

import designpattern.structure.adapter.IAdapter;
import designpattern.structure.adapter.Target;

/**
 * 适配器模式中的类的适配，通过继承和接口实现：继承原始类的方法，接口来实现新的方法。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 5:52 PM
 */
public class ClassAdapterTest {

    public static void main(String[] args) {

        Target target = new Target();
        target.oldMethod();

        //类的适配
        IAdapter adapter = new AdaptedTarget();
        adapter.oldMethod();
        adapter.newMethod();
    }

}
