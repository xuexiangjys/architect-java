package designpattern.behavior.chainofresponsibility;


/**
 * 一级报销单审核人【审核报销单名称的长度】
 *
 * @author xuexiang
 * @since 2020/3/28 11:24 PM
 */
public class PrimaryExpenseHandler extends AbstractExpenseHandler implements ExpenseHandler{

	@Override
	public boolean checkExpenseAccount(String name, int totalPrice) {
		String log = "一级审核人正在审核报销单的名称：" + name + ", 审核结果：";
		if (name != null && name.length() > 0 && name.length() < 20) {
			System.out.println(log + "通过");
			return getNextExpenseHandler() == null || getNextExpenseHandler().checkExpenseAccount(name, totalPrice);
		} else {
			System.out.println(log + "不通过");
			return false;
		}
	}

}
