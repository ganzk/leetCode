package com.dahua.search;

/**
 * 二叉排序树
 */
public class BinarySortNode {

    // 结点数据 关键字 key
    public int data;

    // 数据

    // 左结点
    public BinarySortNode leftNode;

    // 右结点
    public BinarySortNode rightNode;

    public BinarySortNode() {
    }

    public BinarySortNode(int data, BinarySortNode leftNode, BinarySortNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
