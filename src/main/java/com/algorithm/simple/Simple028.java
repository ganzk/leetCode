package com.algorithm.simple;

/**
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。
 * 这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Simple028 {

    public static void main(String[] args) {
        Simple028 simple = new Simple028();
        String haystack = "mississippi";
        String needle = "issip";
        int i = simple.strStr(haystack, needle);
        System.out.println(i);
    }


    /**
     * 双指针
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {

        if(haystack == null || needle == null){
            return 0;
        }

        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();

        int flag = 0;
        int j = 0;

        for (int i = 0; i <= chars.length; i++) {
            if(flag == chars1.length){
                return i - flag;
            }
            if(j == chars1.length || i == chars.length){
                return -1;
            }
            if(chars[i] == chars1[j]){
                flag ++;
                j ++;
            }else{
                i = i - flag;
                flag = 0;
                j = 0;
            }
        }
        return -1;
    }


    /**
     * KMP算法
     * D.E. Knuth、J.H.Morris和V.R. Pratt其中Knuth和Pratt共同研究，Mor-ris独立研究）
     * 发表一个模式匹配算法，可以大大避免重复遍历的情况，
     * 我们把它称之为克努特—莫里斯—普拉特算法，简称KMP算法。
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack, String needle){

        return 0;
    }


}
