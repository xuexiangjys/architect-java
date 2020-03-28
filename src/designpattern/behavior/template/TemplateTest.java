package designpattern.behavior.template;

/**
 * 模板模式: 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。TemplateMethod使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p>
 * 在抽象模板类里面，对于子类模板共用的方法定义为实方法，作为模板的主干（主流程方法）；对于每个子类模板需要自己实现的不同方法则定义为抽象方法。
 * <p>
 * 模板方法使用于业务场景相对复杂且稳定的情况
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 10:54 PM
 */
public class TemplateTest {

    public static void main(String[] args) {
        Activity activity = new UserActivity();

        System.out.println("======hidden=======");

        activity.hidden();

        System.out.println("======show=======");

        activity.show();

        System.out.println("======close=======");

        activity.close();
    }
}
