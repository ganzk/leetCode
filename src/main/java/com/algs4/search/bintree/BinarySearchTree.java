package com.algs4.search.bintree;

/**
 * 二叉查找树
 */
public class BinarySearchTree {

    // 二叉查找树的根结点
    private Node root;

    private class Node {
        // 键
        private Integer key;
        // 值
        private String val;
        // 指向子树的链接
        private Node left, right;
        // 以该结点为根的子树中的结点总数
        private int N;
        public Node(Integer key, String val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public String get(Integer key){
        // 请见算法3.3（续1）
        Node temp = root;
        while (temp != null){
            if(temp.key == key){
                return root.val;
            }
            if(root.key < key){
                temp = temp.left;
            }else {
                temp = temp.right;
            }
        }
        return null;
    };

    public void put(Integer key, String val){

        root = put(root,key,val);
        // 请见算法3.3（续1）
        // 迭代和递归的区别
        // 1.迭代不能获取上一次循环的结果；递归则可以，递归执行完下一步，会返回上一步
        // 2.迭代可以转换为递归，但递归不一定能转换为迭代。
        // 将递归算法转换为非递归算法有两种方法，
        // 一种是直接求值（迭代），不需要回溯；另一种是不能直接求值，需要回溯。
        // 前者使用一些变量保存中间结果，称为直接转换法，后者使用栈保存中间结果，称为间接转换法。
//        Node temp = root;
//        while(true){
//
//            if(temp.key == key){
//                temp.key = key;
//                return;
//            }
//            if(temp.key < key){
//                if(temp.left == null){
//                    // 这里获取N 队医上一次循环  就更改不了
//                    temp.left = new Node(key,val,0);
//                }
//            }
//
//        }
    }

    private Node put(Node x, Integer key, String val){

        if (x == null) return new Node(key,val,1);
        if (x.key == key) x.val = val;
        else if(x.key > key) x.left = put(x.left,key,val);
        else x.right = put(x.right,key,val);

        x.N = size(x.left) + size(x.right);

        return x;
    }



    // max()、min()、floor()、ceiling()方法请见算法3.3（续2）
    // select()、rank()方法请见算法3.3（续3）
    // delete()、deleteMin()、deleteMax()方法请见算法3.3（续4）
    // keys()方法请见算法3.3（续5）


}
