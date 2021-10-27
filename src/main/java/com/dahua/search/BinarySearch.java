package com.dahua.search;

/**
 * 二分法
 */
public class BinarySearch {

    /**
     * 迭代
     * 不要看到二分法就递归
     * 复杂度为O(logn)
     */
    public static void search(int[] a, int index){

        int high = a.length - 1;

        int low = 0;

        while(high >= low){

            // 折半
//            int k = (high + low) / 2;

            // 插值   不再是 不再是中间分 是二分法的优化
            int k =low+ (high-low)*(index-a[low])/(a[high]-a[low]);

            if(index > a[k]){
                low = k + 1;
            } else if(index < a[k]){
                high = k - 1;
            } else {
                System.out.println(k);
                break;
            }

        }

    }

    /**
     * 递归
     */


}
