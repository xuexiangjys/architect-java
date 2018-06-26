package algorithm.sort.insert;

import algorithm.sort.ISort;
import utils.SortUtils;

/**
 * 直接插入排序（从后向前找到合适位置后插入）<br>
 *
 * 基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
 */
public class DirectInsertSort implements ISort {

    @Override
    public int[] sort(int[] array) {
        // 直接插入排序
        for (int i = 1; i < array.length; i++) { //从后往前比
            // 待插入元素（比较元素,后面的）
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                // 将大于temp的往后移动一位
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else { //后面的比前面的大，就直接退出比较（找到比自己小的为止）
                    break;
                }
            }
            array[j + 1] = temp; //为什么要 j + 1呢，是因为之前j--了
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

        SortUtils.sort(new DirectInsertSort(), a);

    }




}
