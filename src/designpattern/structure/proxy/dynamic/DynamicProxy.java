package designpattern.structure.proxy.dynamic;

import designpattern.structure.proxy.IProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，当我们需要代理的接口数量过多，且不需要对方法进行具体的处理的话，就可以使用动态代理。
 *
 * @author xuexiang
 * @since 2020/3/28 7:13 PM
 */
public class DynamicProxy implements InvocationHandler {

    public static IProxy create(int district) {
        return new DynamicProxy(district).createProxy();
    }

    private IProxy mIProxy;

    private DynamicProxy(int district) {
        mIProxy = IProxy.getProxy(district);
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("我是动态代理, 正在代理【" + method.getName() + "】方法！");
        return method.invoke(mIProxy, args);
    }

    /**
     * 获取代理
     */
    private IProxy createProxy() {
        return (IProxy) Proxy.newProxyInstance(mIProxy.getClass().getClassLoader(), mIProxy.getClass().getInterfaces(), this);
    }

}
