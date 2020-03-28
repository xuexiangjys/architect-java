package designpattern.behavior.strategy;

/**
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数。
 * <p>
 * 本质：接口提供具体需要实现的方法或者功能，抽象类提供辅助通用的方法（可有可无）。接口作为向外提供的策略或者算法功能，起主要作用。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 10:13 PM
 */
public class StrategyTest {

    public static void main(String[] args) {
        int a = 19, b = 36;
        Calculator calculator = new Calculator();
        System.out.println("计算结果:" + calculator.calculate(a, b));

        calculator.setCalculateStrategy(new SubtractStrategy());
        System.out.println("计算结果:" + calculator.calculate(a, b));

    }
}
