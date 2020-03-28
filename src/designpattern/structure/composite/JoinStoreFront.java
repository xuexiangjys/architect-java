package designpattern.structure.composite;


/**
 * 加盟店面
 *
 * @author xuexiang
 * @since 2020/3/28 9:44 PM
 */
public class JoinStoreFront extends StoreFront {

    public JoinStoreFront(String storeName, int id) {
        super(storeName, id);
    }

    @Override
    public void add(StoreFront storeFront) {

    }

    @Override
    public void remove(StoreFront storeFront) {

    }

    @Override
    public void consume(int id, int money) {
        System.out.println("在" + getStoreName() + "消费了" + money + "元");
    }

}
