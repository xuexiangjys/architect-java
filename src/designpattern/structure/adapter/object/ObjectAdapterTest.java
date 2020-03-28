package designpattern.structure.adapter.object;


import designpattern.structure.adapter.IAdapter;
import designpattern.structure.adapter.Target;

/**
 * 适配器模式中的对象适配
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 5:45 PM
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {

        Target target = new Target();
        IAdapter adapter = new ObjectAdapter(target);
        adapter.oldMethod();
        adapter.newMethod();

        //另一个适配器
        adapter = new ObjectAdapter1(target);
        adapter.newMethod();
    }
}
