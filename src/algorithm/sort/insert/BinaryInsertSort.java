package algorithm.sort.insert;

import algorithm.sort.ISort;
import utils.SortUtils;

/**
 * 二分法插入排序（按二分法找到合适位置插入）
 * <p>
 * 二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数。
 */
public class BinaryInsertSort implements ISort {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int low = 0;
            int high = i - 1;
            int mid = 0;
            while (low <= high) {  //直到low > high,没有可比较的项后，才能算找到插入的位置。
                mid = (low + high) / 2;
                if (temp < array[mid]) { //插入的值比中值小，high就要往mid的低位移，及mid - 1
                    high = mid - 1;
                } else {
                    low = mid + 1;  //比中值大，low要右移一位
                }
            }
            //以下是找到插入值之后，从低位开始依次向后移动一位，并在低位插入。
            if (low != i) { //low != i, 证明当前有比 比较值大的数，需要插入到最低位。
                System.arraycopy(array, low, array, low + 1, i - low);
                array[low] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
        SortUtils.sort(new BinaryInsertSort(), a);
    }

}
