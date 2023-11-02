package com.algorithm.simple;

/**
 * 58. 最后一个单词的长度
 *
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 解释：最后一个单词是“moon”，长度为4。
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 * 解释：最后一个单词是长度为6的“joyboy”。
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅有英文字母和空格 ' ' 组成
 * s 中至少存在一个单词
 *
 * @author Gan
 * @date 2023-11-2
 * @description 第58题
 * @url https://leetcode.cn/problems/length-of-last-word/submissions/
 */
public class Simple058 {

    public static void main(String[] args) {
        Simple058 simple = new Simple058();
//        simple.lengthOfLastWord("luffy is still joyboy");
        int lenght = simple.lengthOfLastWord1("luffy is still joyboy");
        System.out.println(lenght);
    }


    public int lengthOfLastWord(String s) {

        String[] s1 = s.split(String.valueOf(' '));
        System.out.println(s1[s1.length - 1].length());
        return s1[s1.length - 1].length();
    }

    // 从后面开始遍历
    public int lengthOfLastWord1(String s) {

        char[] chars = s.toCharArray();
        int a = chars.length -1;
        for (int i = a; i > 0; i--) {
            if(chars[i] == ' '){
                return chars.length - i - 1;
            }
        }
        return 0;
    }



}
