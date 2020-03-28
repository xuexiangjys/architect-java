package designpattern.structure.bridge;

/**
 * 打印机管理类
 *
 * @author xuexiang
 * @since 2020/3/28 9:24 PM
 */
public class PrinterManager extends AbstractPrinterManager {

    public PrinterManager(int type) {
        super(type);
    }

    @Override
    protected AbstractPrinter initPrinter(int type) {
        switch (type) {
            case IPrinter.USB:
                return new USBPrinter();
            case IPrinter.BT:
                return new BluetoothPrinter();
            case IPrinter.WIFI:
                return new WiFiPrinter();
            default:
                return new USBPrinter();
        }
    }

}
