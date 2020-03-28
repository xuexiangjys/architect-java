package designpattern.behavior.visit;

import java.util.Random;

/**
 * 产品经理
 *
 * @author xuexiang
 * @since 2020/3/29 12:23 AM
 */
public class Manager extends Stuff {
    /**
     * 产品数量
     */
    private int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return 返回产品经理的产品数
     */
    public int getProducts() {
        return products;
    }


}
