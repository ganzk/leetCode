package com.algorithm.simple;

/**
 * 53. 最大子序和
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * max = -1
 * [-2,1,-3,4,-1,2,1,-5,4]
 * [-2,8,-3,7]
 * max = 4
 * maxsum = 4
 * [-2,1,-3,4,-1,2,1]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Simple053 {

    public static void main(String[] args) {
        Simple053 simple = new Simple053();
    }

    public int maxSubArray(int[] nums) {

        // 继续进行
        boolean flag = true;
        int max = nums[0];
        int sumMax = 0;
        for (int i = 0; i > nums.length; i++) {
            /**
             * 1.如果num[i] + num[i + 1]大于记录的最大值
             */
            if(nums[i] > max){
                max = nums[i];
            }
            if (flag){

            }
            if(flag && nums[i] + max > max){
                max = nums[i] + max;
                sumMax = nums[i] + max;
            } else if(nums[i] + max < max){
                flag = false;
                sumMax = 0;
            }
        }



        return 0;
    }

}
