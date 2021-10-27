package com.dahua.search;

public class SearchTest {

    public static void main(String[] args) {

        int[] a = {0,1,16,24,35,47,59,62,73,88,99};
        int[] a1 = {2,1,3};
        // 二分查找
//        BinarySearch.search(a,62);

        // 二叉树
        // 构造二叉树
        System.out.println("==============构造数据==============");
        int[] data = {47,37,35,99,62,51,73,88,58,93};
//        int[] data = {2,1,3};
        BinarySortNode tree = BinarySortThree.getTree(data);
        // 中序遍历
        System.out.println("==============遍历数据==============");
        BinarySortThree.traversal(tree);
        System.out.println();
        // 查找二叉树
        System.out.println("==============查找数据==============");
        BinarySortThree.search(tree,37);
        // 二叉树插入
        System.out.println("==============插入数据==============");
        BinarySortThree.insertBST(tree,33);
        // 删除二叉树结点
        System.out.println("");
        System.out.println("==============删除数据==============");
        BinarySortNode binarySortNode = BinarySortThree.delNodeBST(tree, 62);
        BinarySortThree.traversal(binarySortNode);
        System.out.println();

    }

}
