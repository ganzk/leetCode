package com.algs4.search.redBlack;

/**
 * 红黑树
 */
public class RedBlackTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    /**
     * 插入
     */


    /**
     * 左旋
     */
    private Node rotateLeft(Node h){

        Node node = h.right;
        // h变成红结点,node变为原先h的节点颜色，
        // 但是h有可能原先就是红的的，所以可能会产生，两个连续的红结点，一般会在插入的时候产生
        node.color = h.color;
        h.color = true;
        // 将原先红结点的左结点，放到h的右结点  将h变为红结点的左结点
        h.right = node.left;
        node.left = h;
        // 原先的节点数也就是新节点的节点数  h的节点数，是左右结点的节点数加上自己
        node.N = h.N;
        h.N = 1 + h.left.N + h.right.N;
        return node;
    }

    /**
     * 右旋
     */
    private Node rotateRight(Node h){

        Node node = h.left;
        // h变成红结点,原先红结点变为黑节点
        node.color = h.color;
        h.color = true;
        // 将原先红结点的左结点，放到h的右结点  将h变为红结点的左结点
        h.left = node.right;
        node.right = h;
        // 原先的节点数也就是新节点的节点数  h的节点数，是左右结点的节点数加上自己
        node.N = h.N;
        h.N = 1 + h.left.N + h.right.N;
        return node;
    }

    /**
     * 红黑树结点
     */
    private class Node{

        Integer key;
        String val;
        Node left,right;
        int N;
        // 区别颜色
        boolean color;

        public Node(Integer key, String val, int n, boolean color) {
            this.key = key;
            this.val = val;
            N = n;
            this.color = color;
        }

    }

    private boolean isRed(Node x){
        if (x == null) return false;
        return x.color;
    }

}
