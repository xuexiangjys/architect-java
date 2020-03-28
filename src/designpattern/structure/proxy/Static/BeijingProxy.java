package designpattern.structure.proxy.Static;


import designpattern.structure.proxy.IProxy;

/**
 * 北京的代理
 *
 * @author xuexiang
 * @since 2020/3/28 7:03 PM
 */
public class BeijingProxy implements IProxy {

    @Override
    public String myName() {
        return "我说北京的代理商";
    }

    @Override
    public void doSell() {
        System.out.println(myName() + ", 我开始卖北京的特产！");
    }

    @Override
    public void doProduce() {
        System.out.println(myName() + ", 我开始生产北京的特产！");
    }

}
