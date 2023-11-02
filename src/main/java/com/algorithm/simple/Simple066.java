package com.algorithm.simple;

/**
 *
 * 66. 加一
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 * 示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 *
 * 提示：
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 *
 * @author Gan
 * @date 2023-11-2
 * @description 第66题
 * @url
 */
public class Simple066 {

    public static void main(String[] args) {
        Simple066 simple = new Simple066();
        int[] a1 = {9,9,9,9};
        int[] ints = simple.plusOne(a1);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ",");
        }
    }

    public int[] plusOne(int[] digits) {

        int temp = digits.length - 1;

        while(temp >= 0){
            if(digits[temp] + 1 <= 9){
                digits[temp] = digits[temp] + 1;
                return digits;
            } else {
                digits[temp] = 0;
                temp --;
            }
        }

        int[] a = new int[digits.length + 1];
        a[0] = 1;

        return a;
    }


}
