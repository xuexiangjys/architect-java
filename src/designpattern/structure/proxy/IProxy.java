package designpattern.structure.proxy;

import designpattern.structure.proxy.Static.BeijingProxy;
import designpattern.structure.proxy.Static.NanjingProxy;

/**
 * 代理接口
 *
 * @author xuexiang
 * @since 2020/3/28 7:04 PM
 */
public interface IProxy {
	/**
	 * 标志南京
	 */
	int NJ = 1;
	/**
	 * 标志北京
	 */
	int BJ = 2;

	String myName();

	void doSell();

	void doProduce();


	static IProxy getProxy(int district) {
		switch (district) {
			case NJ:
				return new NanjingProxy();
			case BJ:
				return new BeijingProxy();
			default:
				return new NanjingProxy();
		}
	}
}
