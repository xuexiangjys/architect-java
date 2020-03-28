package designpattern.behavior.iterator;

/**
 * 集合
 *
 * @author xuexiang
 * @since 2020/3/28 11:08 PM
 */
public interface Collection<T> {

    /**
     * @return 迭代器
     */
    Iterator<T> iterator();

    /**
     * 获取指定索引上的元素
     *
     * @param index 索引
     * @return
     */
    T get(int index);

    /**
     * @return
     */
    int size();
}
