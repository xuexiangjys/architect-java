package designpattern.structure.bridge;

/**
 * 打印机实现接口
 *
 * @author xuexiang
 * @since 2020/3/28 9:16 PM
 */
public interface IPrinter {
    int USB = 1;
    int WIFI = 2;
    int BT = 3;

    /**
     * 打印
     */
    void print();

    /**
     * 连接打印机
     */
    void connect();

    /**
     * 关闭打印机
     */
    void close();


}
