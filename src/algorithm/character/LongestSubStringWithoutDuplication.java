package algorithm.character;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长不含重复字符的子字符串【动态规划】
 * 方法：双指针 + 哈希表
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * 题目：
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * 例子：
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * @author xuexiang
 * @since 2021/11/21 3:46 下午
 */
public class LongestSubStringWithoutDuplication {

    public static void main(String[] args) {
        System.out.println(longestSubStringWithoutDuplication("abcabcbb"));
    }

    public static int longestSubStringWithoutDuplication(String input) {
        Map<Character, Integer> dic = new HashMap<>();
        int left = -1, res = 0;
        for (int i = 0; i < input.length(); i++) {
            if (dic.containsKey(input.charAt(i))) {
                // 更新左指针left
                left = Math.max(left, dic.get(input.charAt(i)));
            }
            // 哈希表记录
            dic.put(input.charAt(i), i);
            // 更新结果
            res = Math.max(res, i - left);
        }
        return res;
    }

}
