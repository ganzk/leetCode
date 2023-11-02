package com.algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 0005 最长回文数
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 *
 * 示例 1:
 *      输入：s = "babad"
 *      输出："bab"
 *      解释："aba" 同样是符合题意的答案。
 *
 * 示例 2:
 *      输入：s = "cbbd"
 *      输出："bb"
 *
 * 提示：
 *      1 <= s.length <= 1000
 *      s 仅由数字和英文字母组成
 *
 *
 */
public class Medium005 {

    public static void main(String[] args) {

        String s = "";

        System.out.println(longestPalindrome(s));

    }

    public static String longestPalindrome(String s) {

        if(s.length() == 1){
            return s;
        }

        return null;
    }

    /**
     * 动态规划
     * 最优子结构、状态转移方程、边界、重叠子问题。
     *
     */


}
