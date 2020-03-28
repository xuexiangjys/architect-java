package designpattern.behavior.chainofresponsibility;

/**
 * 责任链模式： 在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。
 * <p>
 * 责任链类似工厂里生产加工产品的流水线。对于每一个处理环节，只需要尽到自己的职责和知道其下一个环节是什么。整个请求并不知道具体的处理人是谁，也不知道请求何时处理结束。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 11:29 PM
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        //设置责任链
        AbstractExpenseHandler primaryExpenseHandler = new PrimaryExpenseHandler();
        AbstractExpenseHandler secondaryExpenseHandler = new SecondaryExpenseHandler();
        primaryExpenseHandler.setNextExpenseHandler(secondaryExpenseHandler);

        boolean result1 = primaryExpenseHandler.checkExpenseAccount("", 100);
        System.out.println("最终审核结果" + result1);
        System.out.println("==================================");

        boolean result2 = primaryExpenseHandler.checkExpenseAccount("薛翔7月份的报销", 300);
        System.out.println("最终审核结果" + result2);
        System.out.println("==================================");

        boolean result3 = primaryExpenseHandler.checkExpenseAccount("薛翔8月份的报销", 105);
        System.out.println("最终审核结果" + result3);
        System.out.println("==================================");

    }
}
