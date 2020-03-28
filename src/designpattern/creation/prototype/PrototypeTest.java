package designpattern.creation.prototype;

import java.io.IOException;

/**
 * 原型模式： 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 * <p>
 * 在JS里面，对象的继承就是使用原型模式实现的（没有extends），ES6之后才引入了extends。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924434
 *
 * @author xuexiang
 * @since 2020/3/28 4:57 PM
 */
public class PrototypeTest {

    public static void main(String[] args) {
        Prototype obj = new Prototype();
        obj.setString("string");
        obj.setObj(new SerializableObject().setData("data"));
        System.out.println(obj);

        System.out.println("===========");
        try {
            Prototype clone = obj.clone();
            clone.setString("clone string");
            clone.setObjData("clone data");
            System.out.println(clone);
            System.out.println(obj);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            Prototype clone = obj.deepClone();
            clone.setString("deepClone string");
            clone.setObjData("deepClone data");
            System.out.println(clone);
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //这里我们可以看到浅拷贝只对基础数据类型起作用
    }

}
