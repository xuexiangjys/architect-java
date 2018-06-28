package algorithm.sort.select;

import algorithm.sort.ISort;
import utils.SortUtils;

/**
 * 直接选择排序
 * 基本思想：每次选出最小的一个数，放在比较组的最前面（选最小的放前面）
 */
public class DirectSelectSort implements ISort {
    @Override
    public int[] sort(int[] array) {
        // 直接选择排序
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i; // 最小数的索引
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) { // 找出最小的数
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};

        SortUtils.sort(new DirectSelectSort(), a);

    }
}
