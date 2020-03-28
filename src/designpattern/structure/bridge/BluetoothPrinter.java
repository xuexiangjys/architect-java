package designpattern.structure.bridge;

/**
 * 蓝牙打印机实现类
 *
 * @author xuexiang
 * @since 2020/3/28 9:22 PM
 */
public class BluetoothPrinter extends AbstractPrinter {

    @Override
    public String getPrinterName() {
        return "我是蓝牙打印机";
    }

    @Override
    public void doConnect() {
        System.out.println(getPrinterName() + ", 我正在连接...");
    }

    @Override
    public void doPrint() {
        System.out.println(getPrinterName() + ", 我正在打印...");
    }
}
