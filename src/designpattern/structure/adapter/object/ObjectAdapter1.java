package designpattern.structure.adapter.object;

import designpattern.structure.adapter.IAdapter;
import designpattern.structure.adapter.Target;

public class ObjectAdapter1 implements IAdapter {

    private Target source;

    public ObjectAdapter1(Target source) {
        super();
        this.source = source;
    }

    @Override
    public void oldMethod() {
        source.oldMethod();
    }

    @Override
    public void newMethod() {
        System.out.println("This is another adapter to adapt newMethod");
    }
}
