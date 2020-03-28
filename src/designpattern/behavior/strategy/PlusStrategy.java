package designpattern.behavior.strategy;

/**
 * 加法策略
 *
 * @author xuexiang
 * @since 2020/3/28 10:22 PM
 */
public class PlusStrategy implements ICalculateStrategy {

    @Override
    public int calculate(int num1, int num2) {
        System.out.println("正在执行加法策略...");
        return num1 + num2;
    }
}
