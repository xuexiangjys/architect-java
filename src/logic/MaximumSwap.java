package logic;

/**
 * 最大值交换
 * <p>
 * 核心思想：将给到的数字进行拆分，并从低位找到一个最大的数将其交换至高位。
 *
 * @author xuexiang
 * @since 2021/11/9 11:35 上午
 */
public class MaximumSwap {

    public static void main(String[] args) {
        int a = 23445;
        int result = maximumSwap2(a);
        System.out.println(result);
    }

    /**
     * 暴力交换算法
     *
     * @param num 输入值
     * @return 结果
     */
    public static int maximumSwap1(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        // 获取每个数字
        char[] charArray = s.toCharArray();
        int max = num;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                // 交换
                swap(charArray, i, j);
                // 比较大小
                max = Math.max(max, Integer.parseInt(new String(charArray)));
                // 还原
                swap(charArray, i, j);
            }
        }
        return max;
    }

    /**
     * 贪心算法
     *
     * @param num 输入值
     * @return 结果
     */
    public static int maximumSwap2(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        char[] charArray = s.toCharArray();

        // 记录每个数字出现的最后一次出现的下标【0～9】
        int[] last = new int[10];
        for (int i = 0; i < len; i++) {
            // charArray[i] - '0'代表当前数字的值
            last[charArray[i] - '0'] = i;
        }

        // 从左向右(高位）扫描，找到当前位置右边的最大的数字并交换
        for (int i = 0; i < len - 1; i++) {
            // 找最大，所以倒着找，从数字9开始
            for (int j = 9; j > charArray[i] - '0'; j--) { // 需要保证数字比原先的数字要大才行
                if (last[j] > i) { // 因为需要从低位(右边）往前进行交换，也就是下标必须比当前的下标要大
                    swap(charArray, i, last[j]);
                    // 只允许交换一次，因此直接返回
                    return Integer.parseInt(new String(charArray));
                }
            }
        }
        return num;
    }

    /**
     * 交换数字
     *
     * @param charArray 数组
     * @param index1    交换1的索引
     * @param index2    交换2的索引
     */
    private static void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
    }

}
