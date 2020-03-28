package designpattern.structure.composite;

/**
 * 组合模式： 将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。掌握组合模式的重点是要理解清楚 “部分/整体” 还有 ”单个对象“ 与 "组合对象"的含义。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 9:44 PM
 */
public class CompositeTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        StoreFront headFront = new HeadStoreFront("武汉周黑鸭", 1);
        StoreFront NjStoreFront = new JoinStoreFront("南京周黑鸭", 2);
        headFront.add(NjStoreFront);
        headFront.add(new JoinStoreFront("上海周黑鸭", 3));
        headFront.add(new JoinStoreFront("北京周黑鸭", 4));

        headFront.consume(3, 200);
        headFront.consume(2, 300);
        NjStoreFront.consume(400);
    }

}
