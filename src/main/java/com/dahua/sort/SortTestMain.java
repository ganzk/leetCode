package com.dahua.sort;

public class SortTestMain {

    public static void main(String[] args) {

        int[] a = {9,1,5,8,3,7,4,6,2};
        int[] a1 = {2,1,3,4,5,6,7,8,9};
        int[] a2 = {5,1,1,2,0,0};
        int[] a3 = {-4,0,7,4,9,-5,-1,0,-7,-1};
        // 冒泡排序
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(a);
//        bubbleSort.sort1(a);
//        bubbleSort.sort2(a1);

        // 简单选择排序
//        SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
//        simpleSelectionSort.sort(a);

        // 直接插入排序
//        StraightInsertionSort straightInsertionSort = new StraightInsertionSort();
//        straightInsertionSort.sort(a);

        // 希尔排序
//        ShellSort shellSort = new ShellSort();
//        shellSort.sort1(a);

        // 快速排序
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a2);

        // 遍历
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }

}
