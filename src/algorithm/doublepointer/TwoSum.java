package algorithm.doublepointer;


import java.util.Arrays;

/**
 * https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E5%8F%8C%E6%8C%87%E9%92%88.md#1-%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84-two-sum
 * <p>
 * 双指针思想
 *
 * <p>
 * <p>
 * 在有序数组中找出两个数，使它们的和为 target。
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: [2, 7]
 *
 * @author xuexiang
 * @since 2020/3/9 5:09 PM
 */
public class TwoSum {


    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};

        int[] result = twoSum(numbers, 9);

        if (result != null) {
            System.out.println(Arrays.toString(result));
        }
    }


    /**
     * 在有序数组中找出两个数，使它们的和为 target。
     *
     * @param numbers 有序数组
     * @param target  目标值
     * @return
     */
    private static int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{numbers[low], numbers[high]};
            } else if (sum < target) { //小的话，低位升高
                low++;
            } else {  //大的话，高位降
                high--;
            }
        }
        return null;
    }

}
