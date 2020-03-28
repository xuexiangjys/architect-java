package designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 区域总店
 *
 * @author xuexiang
 * @since 2020/3/28 9:44 PM
 */
public class HeadStoreFront extends StoreFront {

    private List<StoreFront> mList = new ArrayList<>();

    public HeadStoreFront(String storeName, int id) {
        super(storeName, id);
    }

    @Override
    public void add(StoreFront storeFront) {
        mList.add(storeFront);
    }

    @Override
    public void remove(StoreFront storeFront) {
        mList.remove(storeFront);
    }

    @Override
    public void consume(int id, int money) {
        for (StoreFront storeFront : mList) {
            if (storeFront.getID() == id) {
                storeFront.consume(id, money);
            }
        }
    }


}
