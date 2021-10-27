package com.dahua.list;

public class ListTest {

    public static void main(String[] args) {

        int[] array = new int[]{1,23,45,2,7,4};
        // 顺序结构
        test1(array,2,9);

        // 单向链表

        // 静态链表

        // 双向链表

        // 循环链表


    }

    /**
     * 顺序结构
     * @param array  操作数组
     * @param index  插入的位置
     * @param total  插入到数值
     */
    public static void test1(int[] array, int index, int total){

        // 查询
        System.out.println(array[1]);

        // 插入
        int n = 2;
        int[] arrayNew = new int[array.length + 1];
        int j =0;
        for (int i = 0; i < arrayNew.length; i++) {
            if(i == n){
                arrayNew[n] = total;
            }else{
                arrayNew[i] = array[j];
                j ++;
            }
        }
        array = arrayNew;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        // 删除
        for (int i = 0; i < array.length -1; i++) {
            if(i >= n){
                arrayNew[i] = arrayNew[i + 1];
            }
        }
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    /**
     * 单向链表
     * @param array  操作数组
     * @param index  插入的位置
     * @param total  插入到数值
     */
    public static void test2(int[] array, int index, int total){

        // 创建链表
        SinglyList singlyList = new SinglyList();
        for (int i = 0; i < array.length; i++) {

            singlyList.addNest(array[i]);

        }

    }

}
