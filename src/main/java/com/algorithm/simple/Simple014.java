package com.algorithm.simple;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * @author Gan
 * @date 2020-12-17
 * @description 第十四题
 * @url https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Simple014 {

    public static void main(String[] args) {

        Simple014 simple014 = new Simple014();

        String[] strs = new String[]{"flower","flower","flower","flower"};

        String s = simple014.longestCommonPrefix(strs);

        System.out.println(s);

    }

    /**
     * 1.全部拿出来比
     * 2.双层for
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0 ){
            return "";
        }
        if( strs.length == 1){
            return strs[0];
        }

        char[] chars = strs[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                String strings = strs[j];
                char[] chars2 = strings.toCharArray();
                if(chars2.length < i + 1){
                    return strings;
                }
                if(chars[i] != chars2[i]){
                    if(i == 0){
                        return "";
                    }
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    /**
     * 1.横向扫描
     * 用 LCP(S1…Sn) 表示字符串S1…Sn的最长公共前缀
     * 可以得到以下结论：
     * LCP(S1…Sn)=LCP(LCP(LCP(S1,S2),S3),…Sn)
     * 所以第一种方法，就是与后面的字符串找到最长的公共前缀
     *
     * 其实跟上一种产不多
     */
    public String longestCommonPrefix1(String[] strs){

        if(strs == null && strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        for (int i = 0; i < strs.length -1; i++) {
            String strings = strs[i];
            String string =  strs[i +1];
            for (int j = 0; j <strings.length(); j++) {
                char[] chars = strings.toCharArray();
                char[] chars1 = string.toCharArray();
                // 比较每一位
                if(chars1.length < j){

                }else if(chars[j] != chars1[j]){

                }
            }
        }
        return "";
    }

    /**
     * 分治法
     * 用 LCP(S1…Sn) 表示字符串S1…Sn的最长公共前缀
     * 可以得到以下结论：
     * LCP(S1…Sn)=LCP(LCP(S1…Sk),LCP(Sk+1…Sn))
     *
     */


}
