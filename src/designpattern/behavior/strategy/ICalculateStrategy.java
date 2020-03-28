package designpattern.behavior.strategy;

/**
 * 计算策略
 *
 * @author xuexiang
 * @since 2020/3/28 10:20 PM
 */
public interface ICalculateStrategy {

    /**
     * 计算
     * @param num1
     * @param num2
     * @return
     */
    int calculate(int num1, int num2);

}
