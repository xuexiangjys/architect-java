package designpattern.behavior.iterator;

/**
 * 迭代器模式:提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * <p>
 * 一般来说，迭代器模式是与集合共生共死的，关系非常密切，所以大多数语言在实现容器的时候都给提供了迭代器，并且这些语言提供的容器和迭代器在绝大多数情况下就可以满足我们的需要，所以迭代器模式我们使用的场景还是比较少的。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/28 11:07 PM
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection<String> collection = new StringCollection();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
