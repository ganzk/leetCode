package com.dahua.tree.traversal;

/**
 * 后续遍历
 */
public class PostorderTraversal {

    /**
     * 中序遍历
     * @param treeNode
     */
    public static void traversal(TreeNode treeNode){

        if(treeNode.leftNode != null){
            traversal(treeNode.leftNode);
        }

        if(treeNode.rightNode != null) {
            traversal(treeNode.rightNode);
        }

        System.out.print(treeNode.value  + " ");

    }

}
