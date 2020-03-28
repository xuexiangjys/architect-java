package designpattern.behavior.interpreter;

/**
 * 解释器实现接口
 *
 * @author xuexiang
 * @since 2020/3/29 12:45 AM
 */
public interface Expression {
    /**
     * 解释
     *
     * @param context
     * @return
     */
    int interpret(Context context);
}
