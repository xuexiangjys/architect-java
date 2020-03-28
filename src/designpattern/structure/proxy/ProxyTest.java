package designpattern.structure.proxy;

import designpattern.structure.proxy.Static.StaticProxy;
import designpattern.structure.proxy.dynamic.DynamicProxy;

/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。
 * <p>
 * 代理模式侧重于 "让擅长的人做擅长的事情" ，侧重于对代理访问对象进行控制。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 7:20 PM
 */
public class ProxyTest {

    public static void main(String[] args) {

        System.out.println("============静态代理=================");

        IProxy proxy = new StaticProxy(IProxy.BJ);
        proxy.doProduce();
        proxy.doSell();

        System.out.println("============动态代理=================");

        IProxy proxy1 = DynamicProxy.create(IProxy.NJ);
        proxy1.doProduce();
        proxy1.doSell();

    }

}
