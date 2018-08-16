package algorithm.sort.exchange;

import algorithm.sort.ISort;
import utils.SortUtils;

/**
 * 冒泡排序
 *
 * 基本原理：让较大的数往下沉，较小的往上冒。（每次循环结束，相对最大的数都会被沉到最后面）
 */
public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // 这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
                if (array[j] > array[j + 1]) {  //如果前面的比后面的大，就交互他们的位置（把小的往前提）【最大的数冒泡上去】
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};

        SortUtils.sort(new BubbleSort(), a);

    }
}
