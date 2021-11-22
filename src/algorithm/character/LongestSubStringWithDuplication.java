package algorithm.character;

import java.util.HashSet;

/**
 * 最长重复子串【动态规划】
 *
 * 给出一个字符串 S，考虑其所有重复子串（S 的连续子串，出现两次或多次，可能会有重叠）。
 * 返回任何具有最长可能长度的重复子串。（如果 S 不含重复子串，那么答案为 ""。）
 *
 * 方法： 二分查找 + Rabin-Karp 字符串编码
 * https://leetcode-cn.com/problems/longest-duplicate-substring/solution/zui-chang-zhong-fu-zi-chuan-by-leetcode/
 *
 * @author xuexiang
 * @since 2021/11/21 3:46 下午
 */
public class LongestSubStringWithDuplication {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestDupSubstring("asdabcdwefabcddde"));
    }

    static class Solution {

        /**
         * 求最长重复子串
         *
         * @param input 输入
         * @return 最长重复子串
         */
        public String longestDupSubstring(String input) {
            int n = input.length();
            // convert string to array of integers
            // to implement constant time slice
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) nums[i] = (int) input.charAt(i) - (int) 'a';
            // base value for the rolling hash function
            int a = 26;
            // modulus value for the rolling hash function to avoid overflow
            long modulus = (long) Math.pow(2, 32);

            // binary search, L = repeating string length
            int left = 1, right = n;
            int L;
            while (left != right) {
                L = left + (right - left) / 2;
                if (search(L, a, modulus, n, nums) != -1) left = L + 1;
                else right = L;
            }

            int start = search(left - 1, a, modulus, n, nums);
            return start != -1 ? input.substring(start, start + left - 1) : "";
        }

        private int search(int L, int a, long modulus, int n, int[] nums) {
            // compute the hash of string S[:L]
            long h = 0;
            for (int i = 0; i < L; ++i) h = (h * a + nums[i]) % modulus;

            // already seen hashes of strings of length L
            HashSet<Long> seen = new HashSet<>();
            seen.add(h);
            // const value to be used often : a**L % modulus
            long aL = 1;
            for (int i = 1; i <= L; ++i) aL = (aL * a) % modulus;

            for (int start = 1; start < n - L + 1; ++start) {
                // compute rolling hash in O(1) time
                h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
                h = (h + nums[start + L - 1]) % modulus;
                if (seen.contains(h)) return start;
                seen.add(h);
            }
            return -1;
        }
    }
}
