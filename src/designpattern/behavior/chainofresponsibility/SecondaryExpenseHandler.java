package designpattern.behavior.chainofresponsibility;

/**
 * 二级报销单审核人【审核报销单的金额】
 *
 * @author xuexiang
 * @since 2020/3/28 11:26 PM
 */
public class SecondaryExpenseHandler extends AbstractExpenseHandler implements ExpenseHandler {

    @Override
    public boolean checkExpenseAccount(String name, int totalPrice) {
        String log = "二级审核人正在审核报销单的金额：" + totalPrice + ", 审核结果：";
        if (totalPrice > 0 && totalPrice < 200) {
            System.out.println(log + "通过");
            return getNextExpenseHandler() == null || getNextExpenseHandler().checkExpenseAccount(name, totalPrice);
        } else {
            System.out.println(log + "不通过");
            return false;
        }
    }


}
