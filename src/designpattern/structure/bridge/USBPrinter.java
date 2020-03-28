package designpattern.structure.bridge;

/**
 * USB打印机
 *
 * @author xuexiang
 * @since 2020/3/28 9:31 PM
 */
public class USBPrinter extends AbstractPrinter {

    @Override
    public String getPrinterName() {
        return "我是USB打印机";
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
