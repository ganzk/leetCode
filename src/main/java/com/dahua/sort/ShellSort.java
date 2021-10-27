package com.dahua.sort;

/**
 * 希尔排序
 */
public class ShellSort {

    public void sort(int[] a){

        // 增量
        int gap = a.length;

        while(gap >= 1){
            gap = gap/2;

            for (int k = 0; k < gap; k++) {
                // 插入排序
                for (int i = 0; i < a.length -1; i+=gap) {
                    if(a[i] > a[i +gap]){
                        int temp = a[i + 1];
                        for (int j = i; j >= 0; j--) {
                            if(a[j] > a[j+1]){
                                a[j + 1]=a[j];
                                a[j] = temp;
                            }else{
                                break;
                            }
                        }
                    }


                }
            }

//            System.out.println();
        }

    }

    public void sort1(int[] array){

        int gap = array.length;
        while (true) {
            gap /= 2;   //增量每次减半
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < array.length; j += gap) {//这个循环里其实就是一个插入排序
                    int k = j - gap;
                    while (k >= 0 && array[k] > array[k+gap]) {
                        int temp = array[k];
                        array[k] = array[k+gap];
                        array[k + gap] = temp;
                        k -= gap;
                    }
                }
            }
            if (gap == 1)
                break;
        }


    }

}
