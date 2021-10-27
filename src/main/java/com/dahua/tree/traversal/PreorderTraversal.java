package com.dahua.tree.traversal;

/**
 * 前序遍历
 */
public class PreorderTraversal {

    /**
     * 前序遍历
     * @param treeNode
     */
    public static void traversal(TreeNode treeNode){

        System.out.print(treeNode.value + " ");
        if(treeNode.leftNode != null){
            traversal(treeNode.leftNode);
        }
        if(treeNode.rightNode != null){
            traversal(treeNode.rightNode);
        }

    }

}
