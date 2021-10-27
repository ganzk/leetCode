package com.dahua.sort;

/**
 * 简单选择排序
 */
public class SimpleSelectionSort {

    // 简单选择排序
    public void sort(int[] a){
        boolean flag = false;
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[min] > a[j]) {
                    min = j;
                    flag = true;
                }
            }
            // 交换
            if(flag){
                swap(a,i,min);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
