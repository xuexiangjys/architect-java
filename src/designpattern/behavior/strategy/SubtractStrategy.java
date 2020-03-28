package designpattern.behavior.strategy;

/**
 * 减法策略
 *
 * @author xuexiang
 * @since 2020/3/28 10:24 PM
 */
public class SubtractStrategy implements ICalculateStrategy {

    @Override
    public int calculate(int num1, int num2) {
        System.out.println("正在执行减法策略...");
        return num1 - num2;
    }
}
