package com.algs4.sort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 初级排序
 * // 简单排序
 *
 */
public class PrimarySort {

    public static void sort(int[] a) {
        /* 请见算法2.1、算法2.2、算法2.3、算法2.4、算法2.5或算法2.7*/
//        for (int i = 0; i < a.length; i++) {
//            a[i] = StdRandom.uniform();
//        }
//        Quick.sort(a);
        // 希尔排序
        sortShell(a);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
    private static void show(int[] a) {
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
    public static boolean isSorted(int[] a) {
        // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    public static void main(String[] args) {
        // 从标准输入读取字符串，将它们排序并输出
//        String[] a = null;
//        int[] a = {4,12,14,9,11,8,19,1,6,2,10,7,15,5,13,3};
        int[] a = {6,9,8,1,5,10,7,3,4,2};

        sort(a);
        assert isSorted(a);
        show(a);
    }
    //2.1 选择排序


    //2.2 插入排序

    // 2.3
    // 希尔排序
    // int[] a = {6,9,8,1,5,10,7,3,4,2};
    // 保证选中的数组有序  比如是4 那么 0 4 8的位置是有序的 搜对应的值 就是 4 5 6，原先是 6 5 4
    // 将a[]按升序排列
    public static void sortShell(int[] a) {
        int N = a.length;
        // 递增序列
        int h = 1;
        // 1, 4, 13, 40, 121, 364, 1093, ...
        while (h < N/3) h = 3*h + 1;
        // 将数组变为h有序
        while (h >= 1) {
            // 插入排序   将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]... 之中
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && (a[j] < a[j-h]); j -= h)
                    // 交换数据
                    exch(a, j, j-h);
            }
            h = h/3;
        }
    }


    // ===========================练习==============================
    // 2.1.3  倒叙
    // 2.1.4  倒叙



}
