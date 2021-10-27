package com.dahua.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    //简单的冒泡排序  每一个位置都与其他位置进行比较，
    public void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) swap(a,i,j);
            }
        }
    }

    // 一般的冒泡排序
    public void sort1(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j + 1]) swap(a,j,j+1);
            }
        }
    }

    // 优化的简单排序
    public void sort2(int[] a){
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            flag = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    swap(a,j,j+1);
                    flag = false;
                }
            }
            if(flag){
                System.out.println("后面的不用排序");
                return;
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
