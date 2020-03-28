package designpattern.structure.composite;

/**
 * 抽象店面
 *
 * @author xuexiang
 * @since 2020/3/28 9:51 PM
 */
public abstract class StoreFront {

    private String StoreName;

    private int ID;

    public StoreFront(String storeName, int id) {
        StoreName = storeName;
        ID = id;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void consume(int money) {
        consume(ID, money);
    }

    public abstract void add(StoreFront storeFront);

    public abstract void remove(StoreFront storeFront);

    public abstract void consume(int id, int money);


}
