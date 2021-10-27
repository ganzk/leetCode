package com.algorithm.simple;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例 1：
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 *
 * 示例 2：
 * 输入：s = "", t = "y"
 * 输出："y"
 *
 * 示例 3：
 * 输入：s = "a", t = "aa"
 * 输出："a"
 *
 * 示例 4：
 * 输入：s = "ae", t = "aea"
 * 输出："a"
 *  
 *
 * 提示：
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小写字母
 *
 * @author Gan
 * @date 2020-12-18
 * @description 第389题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Simple389 {

    public static void main(String[] args) {
        Simple389 simple000 = new Simple389();

        String s = "ae";
        String t = "aea";

        char theDifference = simple000.findTheDifference(s, t);

        System.out.println("\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu79c0");

        System.out.println(theDifference);
    }

    /**
     * java 相减
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {

        if(s == ""){
            return t.toCharArray()[0];
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int nums = 0;
        int numt = 0;
        for (int i = 0; i < chars1.length; i++) {
            if(i < chars.length){
                nums = nums + chars[i];
            }
            numt = numt + chars1[i];
        }

        return (char) (numt - nums);
    }

    /**
     * 异或运算
     */

}
