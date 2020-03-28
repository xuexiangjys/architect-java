package designpattern.structure.proxy.Static;

import designpattern.structure.proxy.IProxy;

/**
 * 静态代理
 *
 * @author xuexiang
 * @since 2020/3/28 7:07 PM
 */
public class StaticProxy implements IProxy {

	private IProxy mIProxy;

	public StaticProxy(int district) {
		mIProxy = IProxy.getProxy(district);
	}

	@Override
	public String myName() {
		return mIProxy.myName();
	}

	@Override
	public void doSell() {
		mIProxy.doSell();
	}

	@Override
	public void doProduce() {
		mIProxy.doProduce();
	}


}
