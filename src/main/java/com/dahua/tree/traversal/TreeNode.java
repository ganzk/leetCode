package com.dahua.tree.traversal;

public class TreeNode {

    // 左结点
    TreeNode leftNode;
    // 右结点
    TreeNode rightNode;
    // 数据
    String value;

    // 构造函数
    public TreeNode() {
    }

    public TreeNode(TreeNode leftNode, TreeNode rightNode, String value) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }
}
