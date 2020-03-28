package designpattern.behavior.visit;

/**
 * CTO只考核工程师
 *
 * @author xuexiang
 * @since 2020/3/29 12:31 AM
 */
public class CTOVisitor implements Visitor {

	@Override
	public void visit(Stuff stuff) {
		if (stuff instanceof Engineer) {
			System.out.println("CTO正在考评工程师:" + stuff.name + ", 代码行数：" + ((Engineer) stuff).getCodeLines());
			if (((Engineer) stuff).getCodeLines() > 50000) {
				stuff.kpi = 100;
			} else {
				stuff.kpi = 0;
			}
			System.out.println("绩效考评结果：" + stuff.kpi);
		}
	}

}
