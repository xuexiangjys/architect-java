package algorithm.sort;


import java.util.Arrays;

/**
 * 荷兰国旗问题
 * <p>
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * <p>
 * 思路：0，1，2进行排序，只要是0就放到最左边，是2的话就放到最右边，1的话不用管。
 *
 * @author xuexiang
 * @since 2020/3/9 11:51 PM
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0, 1, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }


    /**
     * 颜色排序
     *
     * @param nums
     */
    private static void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++); //放到最左边
            } else if (nums[one] == 2) {
                swap(nums, --two, one);  //放到最右边
            } else {
                ++one;
            }
        }
    }

    /**
     * 交换数
     *
     * @param nums
     * @param i
     * @param j
     */
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
