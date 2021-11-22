package algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 滑动窗口的最大值
 * https://github.com/CyC2018/CS-Notes/blob/master/notes/59.%20%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3%E7%9A%84%E6%9C%80%E5%A4%A7%E5%80%BC.md
 * 方法：优先队列
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，那么一共存在 6 个滑动窗口，他们的最大值分别为 {4, 4, 6, 6, 6, 5}。
 *
 * @author xuexiang
 * @since 2021/11/22 8:31 下午
 */
public class MaxInWindows {

    public static void main(String[] args) {
        List<Integer> result = maxInWindows(new int[]{2, 3, 4, 2, 6, 2, 5, 1}, 3);
        System.out.println(result);
    }

    public static List<Integer> maxInWindows(int[] num, int size) {
        List<Integer> ret = new ArrayList<>();
        if (size > num.length || size < 1) {
            return ret;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);  /* 大顶堆 */
        for (int i = 0; i < size; i++) {
            heap.add(num[i]);
        }
        ret.add(heap.peek());
        /* 维护一个大小为 size 的大顶堆 */
        for (int i = 0, j = i + size; j < num.length; i++, j++) {
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }

}
