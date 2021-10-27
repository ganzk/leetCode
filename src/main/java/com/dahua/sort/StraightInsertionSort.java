package com.dahua.sort;

/**
 * 直接插入排序
 */
public class StraightInsertionSort {

    public void sort(int[] a){

        for (int i = 1; i <a.length; i++) {
            int temp = a[i];
            if(a[i] < a[i -1]){
                for (int j = i - 1; j >= 0; j--) {
                    if(a[j] > temp){
                        a[j + 1] = a[j];
                        a[j] = temp;
                    }else{
                        break;
                    }
                }
            }
        }
    }


}
