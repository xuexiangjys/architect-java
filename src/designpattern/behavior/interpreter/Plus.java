package designpattern.behavior.interpreter;

/**
 * 加法解释器
 *
 * @author xuexiang
 * @since 2020/3/29 12:45 AM
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
