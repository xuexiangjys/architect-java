package designpattern.structure.bridge;

/**
 * 抽象打印机管理类
 *
 * @author xuexiang
 * @since 2020/3/28 9:16 PM
 */
public abstract class AbstractPrinterManager implements IPrinter {

    private AbstractPrinter mPrinter;

    public AbstractPrinterManager(int type) {
        mPrinter = initPrinter(type);
    }

    /**
     * 初始化打印机
     *
     * @param type
     * @return
     */
    protected abstract AbstractPrinter initPrinter(int type);

    /**
     * 更换打印机类型
     *
     * @param type
     */
    public void updatePrinter(int type) {
        setPrinter(initPrinter(type));
    }

    public void setPrinter(AbstractPrinter printer) {
        mPrinter = printer;
    }

    @Override
    public void print() {
        if (mPrinter != null) {
            mPrinter.print();
        }
    }

    @Override
    public void connect() {
        if (mPrinter != null) {
            mPrinter.connect();
        }
    }

    @Override
    public void close() {
        if (mPrinter != null) {
            mPrinter.close();
        }
    }

}
