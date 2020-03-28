package designpattern.structure.bridge;

/**
 * WIFI打印机
 *
 * @author xuexiang
 * @since 2020/3/28 9:32 PM
 */
public class WiFiPrinter extends AbstractPrinter {

    @Override
    public String getPrinterName() {
        return "我是WiFi打印机";
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
