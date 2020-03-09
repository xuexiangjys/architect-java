package algorithm.doublepointer;


/**
 *
 * https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E5%8F%8C%E6%8C%87%E9%92%88.md#2-%E4%B8%A4%E6%95%B0%E5%B9%B3%E6%96%B9%E5%92%8C
 *
 * 判断一个非负整数是否为两个整数的平方和。
 * <p>
 * Input: 5
 * Output: true
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * @author xuexiang
 * @since 2020/3/9 5:43 PM
 */
public class TwoSquareSum {


    public static void main(String[] args) {
        System.out.println(twoSquareSum(5));
    }

    /**
     * 判断一个非负整数是否为两个整数的平方和。
     *
     * @param target
     * @return
     */
    private static boolean twoSquareSum(int target) {
        if (target < 0) {
            return false;
        }

        int low = 0, high = (int) Math.sqrt(target);
        int sum;
        while (low < high) {
            sum = low * low + high * high;
            if (sum == target) {
                return true;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }
}
