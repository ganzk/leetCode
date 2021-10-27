package com.algs4.sort;

public class Quick {

    // 快速排序
    public static void main(String[] arg) {
//        StdRandom.shuffle(a); // 消除对输入的依赖
        int[] a = {3,2,5,1,8,7,10,9};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi); // 切分（请见“快速排序的切分”）
        sort(a, lo, j-1); // 将左半部分a[lo .. j-1]排序
        sort(a, j+1, hi); // 将右半部分a[j+1 .. hi]排序
    }

    // 将数组切分为a[lo..i-1], a[i], a[i+1..hi]
    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1; // 左右扫描指针
        int v = a[lo]; // 切分元素
        while (true) { // 扫描左右，检查扫描是否结束并交换元素

            // 从前往后找大于基准的
            while (a[++i] < v) {
                if (i == hi) {
                    break;
                }
            }
            // 从后往前 找小于基准的
            while (v < a[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j); // 将v = a[j]放入正确的位置
        return j; // a[lo..j-1] <= a[j] <= a[j+1..hi] 达成
    }

    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


}
