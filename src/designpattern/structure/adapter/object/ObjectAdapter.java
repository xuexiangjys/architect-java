package designpattern.structure.adapter.object;

import designpattern.structure.adapter.IAdapter;
import designpattern.structure.adapter.Target;

/**
 * 对象适配
 *
 * @author xuexiang
 * @since 2020/3/28 5:33 PM
 */
public class ObjectAdapter implements IAdapter {

    private Target source;

    public ObjectAdapter(Target source) {
        super();
        this.source = source;
    }

    @Override
    public void oldMethod() {
        source.oldMethod();
    }

    @Override
    public void newMethod() {
        System.out.println("this is the method which needs to be adapted!");
    }
}
