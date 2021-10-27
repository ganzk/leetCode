package com.dahua.tree;

public class TreeNode {

    // 左结点
    TreeNode leftNode;
    // 右结点
    TreeNode rightNode;
    // 数据
    int value;

}

/**
 * 双亲表示法
 * 每个节点指标是双亲，根节点没有双亲，为null
 */
class TreeParentNode {

    // 双亲
    TreeParentNode treeParent;

    // 结点数据
    Integer value;

}

// 树结构
class Tree{

    // 根节点
    TreeParentNode headNode;

    // 节点数组
    TreeParentNode[] treeNodes;

}

// ===============================================================


