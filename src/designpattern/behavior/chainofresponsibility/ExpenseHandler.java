package designpattern.behavior.chainofresponsibility;

/**
 * 报销单审核处理者
 *
 * @author xuexiang
 * @since 2020/3/28 11:19 PM
 */
public interface ExpenseHandler {

    /**
     * 审核报销单
     *
     * @param name
     * @param totalPrice
     * @return
     */
    boolean checkExpenseAccount(String name, int totalPrice);
}
