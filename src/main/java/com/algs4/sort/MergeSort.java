package com.algs4.sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * 归并
 */
public class MergeSort {

    private static int[] aux; // 归并所需的辅助数组

    public static void sort(int[] a) {
        // 一次性分配空间
        aux = new int[a.length];
        MergeSort.sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int begen, int end){

        // 如果大于2 就拆成两个数组
        if(begen < end){
            int k =(begen + end) / 2;
            sort(a, begen, k);
            sort(a, k + 1, end);

            // 归并
            MergeSort.merge(a,begen,k,end);
        }
    }

    // 将a[lo..mid] 和 a[mid+1..hi] 归并
    public static void merge(int[] a, int lo, int mid, int hi) {

        for (int i = lo; i <= hi; i++) aux[i] = a[i];
        int k = mid + 1;
        int l = lo;
        for (int i = lo; i <= hi; i++) {
            // a[]
            // aux[]  aux至始至终没有更改里面的数据，更改的都是a[]里面的数据，
            // aux的作用就是提供一个容器，来存放之前的数据，l和k是两个浮标，只比较l,k的位置是否合法，
            // 如果合法就比较aux[l],aux[k]的大小，小的去更新a[]数组的值
            // 这里是判断l,k的合法性
            if(l > mid) {
                a[i] = aux[k];
                k ++;
            }
            else if( k > hi) {
                a[i] = aux[l];
                l ++;
            }
            // 这里比较a[j],a[k]的大小
            // a[] {1,2,3}
            //        l     k
            // aux[] {5,4,3,2,1}
            else if(aux[l] > aux[k]){
                a[i] = aux[k];
                k ++;
            }
            else{  // (aux[l] < aux[k])
                a[i] = aux[l];
                l ++;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{4,12,14,9,11,8,19,1,6,2,10,7,15,5,13,3};
//        int[] a = new int[]{4,3,2,1};
//        int[] a = new int[]{3,2};
        MergeSort.sort(a);
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }


}
