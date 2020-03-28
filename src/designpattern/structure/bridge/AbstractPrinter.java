package designpattern.structure.bridge;

/**
 * 抽象打印机
 *
 * @author xuexiang
 * @since 2020/3/28 9:18 PM
 */
public abstract class AbstractPrinter implements IPrinter {

    private boolean mIsConnected;

    public boolean isIsConnected() {
        return mIsConnected;
    }

    public void setIsConnected(boolean isConnected) {
        mIsConnected = isConnected;
    }

    @Override
    public void print() {
        if (mIsConnected) {
            System.out.println("打印机已连接，开始打印！");
            doPrint();
        } else {
            System.out.println("打印机未连接，连接打印机！");
            connect();
        }
    }

    @Override
    public void connect() {
        doConnect();
        mIsConnected = true;
        print();
    }

    @Override
    public void close() {
        System.out.println(getPrinterName() + ", 我正在断开连接...");
    }

    public abstract void doPrint();

    public abstract void doConnect();

    public abstract String getPrinterName();
}
