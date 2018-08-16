package algorithm.sort.exchange;

import algorithm.sort.ISort;
import utils.SortUtils;

/**
 * 快速排序
 * <p>
 * 选择一个基准元素，通常选择第一个元素或者最后一个元素。然后依次与其比较，把比基准元素小的放左边，大的放右边，分成两个部分。
 * <p>
 * 然后再在这两个部分中继续再各选一个基准元素进行比较。
 *
 * @author xuexiang
 * @since 2018/8/17 上午12:25
 */
public class QuickSort implements ISort {

    @Override
    public int[] sort(int[] array) {
        if (array.length > 0) {
            quickSort(array, 0, array.length - 1);
        }
        return array;
    }

    /**
     * 快速排序方法
     * @param array
     * @param low
     * @param high
     */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) { // 如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(array, low, high);
            quickSort(array, 0, middle - 1);
            quickSort(array, middle + 1, high);
        }
    }

    /**
     * 进行一次快速排序，返回选择基准元素排序后的索引
     * @param array
     * @param low
     * @param high
     * @return
     */
    private static int getMiddle(int[] array, int low, int high) {
        int temp = array[low];// 基准元素
        while (low < high) {
            // 先从高位开始找，直到找到比基准元素小的元素位置，然后交换位置
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];

            // 然后从低位开始找，直到找到比基准元素大的元素位置，然后交换位置
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp; //最终找到基准元素的位置
        return low; //返回索引
    }


    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};

        SortUtils.sort(new QuickSort(), a);

    }


}
