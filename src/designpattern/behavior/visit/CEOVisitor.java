package designpattern.behavior.visit;

/**
 * CEO只考核产品经理
 *
 * @author xuexiang
 * @since 2020/3/29 12:26 AM
 */
public class CEOVisitor implements Visitor {


	@Override
	public void visit(Stuff stuff) {
		if (stuff instanceof Manager) {
			System.out.println("CEO正在考评产品经理：" + stuff.name + ", 产品经理的产品数量:" + ((Manager) stuff).getProducts());
			if (((Manager) stuff).getProducts() > 3) {
				stuff.kpi = 100;
			} else {
				stuff.kpi = 0;
			}
			System.out.println("绩效考评结果：" + stuff.kpi);
		}
	}

}
