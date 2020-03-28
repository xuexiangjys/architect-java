package designpattern.behavior.interpreter;

/**
 * 减法解释器
 *
 * @author xuexiang
 * @since 2020/3/29 12:46 AM
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
