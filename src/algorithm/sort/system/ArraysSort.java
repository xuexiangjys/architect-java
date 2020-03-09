package algorithm.sort.system;


import algorithm.sort.ISort;
import utils.SortUtils;

import java.util.Arrays;

/**
 * 直接使用Arrays.sort()进行排序
 *
 * @author xuexiang
 * @since 2020/3/9 6:44 PM
 */
public class ArraysSort implements ISort {

    @Override
    public int[] sort(int[] array) {
        //默认也是一种快速排序
        Arrays.sort(array);
        return array;
    }


    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        SortUtils.sort(new ArraysSort(), a);
    }
}
