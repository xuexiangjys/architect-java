package designpattern.behavior.visit;

/**
 * 访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 * <p>
 * 访问者模式的主要缺点是增加新的数据结构很困难，因此它适用于数据结构相对稳定的系统，能够将数据结构和算法解耦。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/29 12:32 AM
 */
public class VisitorTest {

    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        report.showReport(new CEOVisitor());
        report.showReport(new CTOVisitor());
    }
}
