package algorithm.sort;

import utils.SortUtils;

/**
 * 归并排序 简介:将两个（或两个以上）有序表合并成一个新的有序表
 *
 * 基本原理：先把数组左右左右拆开到最小单位，然后依次左右进行比较进行合并。
 *
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列 时间复杂度为O(nlogn) 稳定排序方式
 */
public class MergeSort implements ISort {
    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    public static int[] sort(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 拆左边
            sort(array, low, mid);
            // 拆右边
            sort(array, mid + 1, high);
            // 左右归并
            merge(array, low, mid, high);
        }
        return array;
    }

    /**
     * 合并数组
     * @param array
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) { //左右不能超出边界，左右依次比较大小
            if (array[i] < array[j]) {  //左边小，就把左边的放到新数组中，并且左指针向右移一位
                temp[k++] = array[i++];
            } else {                    //右边小，就把右边的放到新数组中，并且右指针向右移一位
                temp[k++] = array[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = array[j++];
        }

        // 把排好序的新数组中的数覆盖array数组
        System.arraycopy(temp, 0, array, low, temp.length);
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        SortUtils.sort(new MergeSort(), a);
    }
}
