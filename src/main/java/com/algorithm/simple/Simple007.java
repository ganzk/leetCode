package com.algorithm.simple;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Simple007 {

    public static void main(String[] args) {
        Simple007 simple =  new Simple007();
        int reverse = simple.reverse(1534236469);
        System.out.println(reverse);

    }

    /**
     * 解法一
     */
    public int reverse(int x){

        String flag = "";
        StringBuilder num = new StringBuilder();

        if(x == 0){
            return 0;
        }

        char[] chars = null;
        if(x < 0){
            chars = String.valueOf(x).substring(1).toCharArray();
            flag = "-";
        }else{
            chars = String.valueOf(x).toCharArray();
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            num.append(chars[i]);
        }
        Long integer1 = 0L;
        integer1 = Long.valueOf(flag + num.toString());
        if(integer1 > Math.pow(2, 31) - 1 || integer1 < Math.pow(-2, 31)){
            return 0;
        }
        return integer1.intValue();
    }


}
