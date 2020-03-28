package designpattern.structure.adapter.clazz;

import designpattern.structure.adapter.IAdapter;
import designpattern.structure.adapter.Target;

/**
 * 使用类的适配进行适配
 *
 * @author xuexiang
 * @since 2020/3/28 5:50 PM
 */
public class AdaptedTarget extends Target implements IAdapter {

    @Override
    public void newMethod() {
        System.out.println("this is the method which needs to be adapted!");
    }

}
