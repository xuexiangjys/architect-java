package designpattern.behavior.strategy;

/**
 * 计算器
 *
 * @author xuexiang
 * @since 2020/3/28 10:29 PM
 */
public class Calculator implements ICalculateStrategy {

    private ICalculateStrategy mStrategy;

    public Calculator() {

    }

    public Calculator(ICalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public Calculator setCalculateStrategy(ICalculateStrategy strategy) {
        mStrategy = strategy;
        return this;
    }

    @Override
    public int calculate(int num1, int num2) {
        if (mStrategy == null) {
            mStrategy = new PlusStrategy();
        }
        return mStrategy.calculate(num1, num2);
    }
}
