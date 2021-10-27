package com.dahua.tree.traversal;

/**
 * 中序排序
 */
public class InorderTraversal {

    /**
     * 中序遍历
     * @param treeNode
     */
    public static void traversal(TreeNode treeNode){

        if(treeNode.leftNode != null){
            traversal(treeNode.leftNode);
        }
        System.out.print(treeNode.value  + " ");
        if(treeNode.rightNode != null) {
            traversal(treeNode.rightNode);
        }

    }

}
