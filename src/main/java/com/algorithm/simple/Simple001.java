package com.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Simple001 {

    public static void main(String[] args) {
        Simple001 simple =  new Simple001();
        int[] sums = new int[]{2, 7, 11, 15};
        int target = 26;

//        int[] ints = simple.twoSum01(sums, target);

//        int[] ints = simple.twoSum02(sums, target);

        int[] ints = simple.twoSum03(sums, target);

        if(ints != null){
            System.out.println(ints[0] + "," + ints[1]);
        }

    }

    /**
     * 解法一
     * 简单粗暴法
     * 缺点：循环套循环 n*n
     */
    public int[] twoSum01(int[] nums, int target){

        for(int i=0; i < nums.length; i ++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    /**
     * 解法二
     * map集合
     */
    public int[] twoSum02(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

    /**
     * 单指针滑动  map方法的解释版
     */
    public int[] twoSum03(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for(int j =0; j < i; j ++){  // 因为hashMap的特性  所以就不用再去找了
                if(nums[i] == nums[j]){
                    return new int[]{j,i};
                }
            }
            nums[i] = target - nums[i];
        }
        return null;
    }



    // 三数之和
    public int[] twoSum04(int[] nums, int target){


        return null;
    }

}
