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
     *
     * 有些话从来不及
     * 一直都放在心底
     * 想要叫你看仔细
     * 但错身而过的你
     * 已经离去
     * 慢慢清晰
     * 原来思念 你是加了糖的消息
     * 我用铅笔 画得很仔细
     * 素描那年天气
     * 蝉鸣的夏季
     * 我想遇见你
     * 那童年的希望是一台时光机
     * 我可以一路开心到底 都不换气
     * 戴竹蜻蜓 穿过那森林
     * 打开了任意门找到你 一起旅行
     * 那童年的希望是一台时光机
     * 你我翻滚过的榻榻米 味道熟悉
     * 所有回忆 在小叮当口袋里
     * 一起荡秋千的默契
     */


}
