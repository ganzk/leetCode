package com.algorithm.hard;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 *
 *
 * 提示：
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * @author Gan
 * @date 2023-08-18
 * @description 第004题
 * @url https://leetcode-cn.com/problems/two-sum
 */
public class Hard004 {
    public static void main(String[] args) {
        Hard004 hard = new Hard004();
        int[] a = {1};
        int[] b = {2};
        double test = hard.test(a, b);
        System.out.println(test);
    }

    /**
     * 普通解法 这个复杂度是O(m+n)
     * @param m
     * @param n
     * @return
     */
    public double test(int[] m, int[] n){

        int[] a = new int[(m.length + n.length)/2 + 1];

        int i = 0;
        int j = 0;
        for (; i + j < (m.length + n.length)/2 + 1; ) {
            if(i < m.length && j < n.length){
                if(m[i] > n[j]){
                    a[i + j] = n[j];
                    j ++;
                } else {
                    a[i + j] = m[i];
                    i ++;
                }
            }else if(i >= m.length && j < n.length){
                a[i + j] = n[j];
                j ++;
            } else if (i < m.length && j >= n.length){
                a[i + j] = m[i];
                i ++;
            }
        }

        if((m.length + n.length)%2 == 0){
            return (double)(a[a.length-1] + a[a.length-2]) / 2;
        }else{
            return (double)a[a.length-1];
        }
    }


    /**
     * 题目要求是O(log(m+n)),所以使用二分法
     * 思路： 我们的目的是要找到中间的数字，对于其他的数字我们不关系，比如一共7个数字，那么我们要找第4个数字
     *
     * 7 3
     *
     * 5 6 7 8 9 13
     * 1 2 3 4 10 11 12 15
     * 1 2 3 4 5 6 7 8 9 10 11 12 13 15     7.5     14 14/2 = 7   找第7小的数字    7/2 = 3  为什么要中位数的位置然后除以2 因为是两个数组，理想状况下应该是两个组织的各一半合起来就是整个数组的自办，所以小的就是一定不是一半的地方
     *
     * 数组A 数组B A和B合起来是数组C
     * 中位数是在整个数组的也就是C数组的中间位置，
     * 中位数把整个数组分成两半，如果是奇数个那么就是中位数自己，
     * 如果是偶数个，那么两半数组各有一个，而且是两半数组中的最大值和最小值
     *
     * 理想情况下A数组的一半加上B数组的一半就是C数组的一半，按照上面计算中位数是在7的位置，所以理想情况下A和B至少要出三个数字，
     * 所以A[3]和B[3],那个小，哪一个一定不会是中位数
     *
     * ||
     * 5 6 7 8 9 13
     * 4 10 11 12 15       1 2 3 这里去除3个数 还剩 4个数 然后4/2=2
     *
     *
     *
     *
     * @param m
     * @param n
     * @return
     */
    public double test2(int[] m, int[] n){

        int len = m.length + n.length;
        int tem = len/2/2;
        while(tem > 1){

        }

        return 0;
    }

}
