package designpattern.structure.proxy.Static;

import designpattern.structure.proxy.IProxy;

/**
 * 南京的代理
 *
 * @author xuexiang
 * @since 2020/3/28 7:07 PM
 */
public class NanjingProxy implements IProxy {

    @Override
    public String myName() {
        return "我说南京的代理商";
    }

    @Override
    public void doSell() {
        System.out.println(myName() + ", 我开始卖南京的特产！");
    }

    @Override
    public void doProduce() {
        System.out.println(myName() + ", 我开始生产南京的特产！");
    }

}
