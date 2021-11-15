package algorithm.doublepointer;


/**
 * https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E5%8F%8C%E6%8C%87%E9%92%88.md#7-%E6%9C%80%E9%95%BF%E5%AD%90%E5%BA%8F%E5%88%97
 * <p>
 * 最长子序列
 * <p>
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
 * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 * <p>
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * Output:
 * "apple"
 *
 * @author xuexiang
 * @since 2020/3/9 6:02 PM
 */
public class LongestSubSequence {

    public static void main(String[] args) {
        String s = "abpcplea";
        String[] d = new String[]{"ale", "apple", "monkey", "plea"};
        System.out.println(findLongestWord(s, d));
    }


    public static String findLongestWord(String s, String[] d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(), l2 = target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) { //比较长度和字典序
                continue;
            }
            if (isSubString(s, target)) {
                longestWord = target;
            }
        }
        return longestWord;
    }

    /**
     * 利用双指针判断子序列
     *
     * @param s
     * @param target 目标
     * @return
     */
    private static boolean isSubString(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }


    /**
     * 通过利用String.indexOf来进行快速查找
     *
     * @param s
     * @param target
     * @return
     */
    private static boolean checkSubString(String s, String target) {
        int star = -1;
        for (char c : target.toCharArray()) {
            int index;
            if ((index = s.indexOf(c, star + 1)) == -1) {
                return false;
            }
            star = index;
        }
        return true;
    }


}
