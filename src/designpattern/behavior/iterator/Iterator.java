package designpattern.behavior.iterator;

/**
 * 迭代器
 *
 * @author xuexiang
 * @since 2020/3/28 11:11 PM
 */
public interface Iterator<T> {
    /**
     * @return 前移
     */
    T previous();

    /**
     * @return 后移
     */
    T next();

    /**
     * @return 是否有下一个元素
     */
    boolean hasNext();

    /**
     * @return 移动到第一个元素
     */
    T first();
}
