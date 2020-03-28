package designpattern.structure.adapter;

public interface IAdapter {

	/**
	 * 原类中已有的方法
	 */
	void oldMethod();

	/**
	 * 类新增需要适配的方法
	 */
	void newMethod();
}
