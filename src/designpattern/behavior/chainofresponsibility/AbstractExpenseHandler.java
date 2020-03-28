package designpattern.behavior.chainofresponsibility;

/**
 * 抽象的报销单审核处理者
 *
 * @author xuexiang
 * @since 2020/3/28 11:19 PM
 */
public abstract class AbstractExpenseHandler implements ExpenseHandler {

    /**
     * 下一级报销单审核人
     */
    private ExpenseHandler mNextExpenseHandler;

    public ExpenseHandler getNextExpenseHandler() {
        return mNextExpenseHandler;
    }

    public void setNextExpenseHandler(ExpenseHandler nextExpenseHandler) {
        mNextExpenseHandler = nextExpenseHandler;
    }

}
