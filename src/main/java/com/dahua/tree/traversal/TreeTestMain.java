package com.dahua.tree.traversal;

public class TreeTestMain {

    // 前序 中序 后序 其实说的试双亲结点的位置
    // 如果是 前序 双亲结点第一个访问，中结点->左结点->右结点
    // 如果是 中序 双亲结点在中间访问，左结点->中结点->右结点
    // 如果是 后序 双亲结点在最后访问，左结点->右结点->中结点
    public static void main(String[] args) {
        TreeNode treeNode = creatTreeNode();
        System.out.println("遍历顺序：");

        /* ==============前序遍历=============== */
        // A B D G H C E I F
        System.out.println("前序遍历：");
        PreorderTraversal.traversal(treeNode);

        /* ==============中序遍历=============== */
        // G D H B A E I C F
        System.out.println();
        System.out.println("中序遍历：");
        InorderTraversal.traversal(treeNode);

        /* ==============后序遍历=============== */
        // G H D B I E F C A
        System.out.println();
        System.out.println("后序遍历：");
        PostorderTraversal.traversal(treeNode);

        /* ==============层序遍历=============== */
        System.out.println();
        System.out.println("层序遍历：");

    }

    // 构建树
    public static TreeNode creatTreeNode(){

        TreeNode treeNodeI = new TreeNode(null,null,"I");
        TreeNode treeNodeH = new TreeNode(null,null,"H");
        TreeNode treeNodeG = new TreeNode(null,null,"G");
        TreeNode treeNodeF = new TreeNode(null,null,"F");
        TreeNode treeNodeE = new TreeNode(null,treeNodeI,"E");
        TreeNode treeNodeD = new TreeNode(treeNodeG,treeNodeH,"D");
        TreeNode treeNodeC = new TreeNode(treeNodeE,treeNodeF,"C");
        TreeNode treeNodeB = new TreeNode(treeNodeD,null,"B");
        TreeNode treeNodeA = new TreeNode(treeNodeB,treeNodeC,"A");

        return treeNodeA;
    }


}
