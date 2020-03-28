package designpattern.structure.bridge;

/**
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 9:15 PM
 */
public class BridgeTest {

    public static void main(String[] args) {

        PrinterManager manager = new PrinterManager(IPrinter.USB);
        manager.print();

        System.out.println("============================");

        manager.updatePrinter(IPrinter.WIFI);
        manager.print();
    }
}
