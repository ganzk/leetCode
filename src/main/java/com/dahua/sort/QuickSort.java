package com.dahua.sort;

/**
 * 快速排序
 */
public class QuickSort {

    // 快速排序
    private void sort(int[] a, int lo, int hi){
        if(hi <= lo){
            return;
        }

        int begion = lo;
        // 需要找到
        int h = a[lo];
        int i = lo + 1;
        int j = hi;
        while(true){
            // 从后往前找  找到小于h的值
            int temp;
            while(true){
                if(i > j){
                    break;
                }
                if(a[j] < h){
                    // 找到了j
                    temp = a[j];
                    a[j] = a[lo];
                    a[lo] = temp;
                    lo = j;
                    j --;
                    break;
                }
                j --;
            }

            // 从前往后找  找到大于h的值
            while(true){
                if(i >= j){
                    break;
                }
                if(a[i] > h){
                    // 找到了i
                    temp = a[i];
                    a[i] = a[lo];
                    a[lo] = temp;
                    lo = i;
                    break;
                }
                i ++;
            }

            if(j <= i){
               break;
            }
        }
//        System.out.println();
        this.sort(a,i,hi);
        this.sort(a,begion,lo - 1);


    }
    // 快速排序
    public void sort(int[] a){
        sort(a,0,a.length-1);
    }


}
