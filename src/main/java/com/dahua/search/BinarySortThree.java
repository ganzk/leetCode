package com.dahua.search;

/**
 * 二叉排序树
 */
public class BinarySortThree {

    /**
     * 构建二叉树
     * @param a
     * @return
     */
    public static BinarySortNode getTree(int[] a){

        BinarySortNode binarySortNode = new BinarySortNode();
        binarySortNode.data = a[0];

        for (int i = 1; i < a.length; i++) {
            BinarySortNode node = new BinarySortNode();
            node.data = a[i];
            boolean flag = true;
            BinarySortNode temp = binarySortNode;
            while(flag){
                if(a[i] > temp.data){
                    if(temp.rightNode == null) {
                        temp.rightNode = node;
                        flag = false;
                    }
                    else temp = temp.rightNode;
                }
                if(a[i] < temp.data){
                    if(temp.leftNode == null) {
                        temp.leftNode = node;
                        flag = false;
                    }
                    else temp = temp.leftNode;
                }
            }
        }
        return binarySortNode;
    }

    // 中序遍历
    public static void traversal(BinarySortNode treeNode){
        if(treeNode.leftNode != null){
            traversal(treeNode.leftNode);
        }
        System.out.print(treeNode.data  + " ");
        if(treeNode.rightNode != null) {
            traversal(treeNode.rightNode);
        }

    }

    // 查找  递归 相当于get
    public static void search(BinarySortNode treeNode,int i){

        BinarySortNode tmp = treeNode;
        if(tmp.data == i){
            System.out.println("查找成功");
        }else if(tmp.data > i){
            search(tmp.leftNode,i);
        }else if(tmp.data < i){
            search(tmp.rightNode,i);
        }

    }

    // 二叉树插入  相当于put
    public static void insertBST(BinarySortNode treeNode,int i){

        BinarySortNode temp = treeNode;
        boolean flag = true;
        while(flag){
            BinarySortNode binarySortNode = new BinarySortNode();
            if (temp.data == i) {
                System.out.println("已有数据");
                flag =false;
            }
            if(temp.data > i){
                if(temp.leftNode != null){
                    temp = temp.leftNode;
                }else {
                    binarySortNode.data = i;
                    temp.leftNode = binarySortNode;
                    flag = false;
                }
            }
            if(temp.data < i){
                if(temp.rightNode != null){
                    temp = temp.rightNode;
                }else {
                    binarySortNode.data = i;
                    temp.rightNode = binarySortNode;
                    flag = false;
                }
            }
        }
        // 中序遍历
        traversal(treeNode);
    }

    // 删除
    public static BinarySortNode delNodeBST(BinarySortNode treeNode,int i){
        BinarySortNode tmp = treeNode;

        if(tmp.data == i){
            if(tmp.leftNode == null){
                return tmp.rightNode;
            } else if(tmp.rightNode == null){
                return tmp.leftNode;
            } else {
                // 找到左子树的最右结点，让这个结点作为新的根节点（还有一种是找右子树的最左结点）
                tmp = treeNode.leftNode;
                while(tmp.rightNode != null){
                    tmp = tmp.rightNode;
                }
                // 创建新的根结点
                BinarySortNode binarySortNode = new BinarySortNode();
                binarySortNode.data = tmp.data;
                binarySortNode.leftNode = treeNode.leftNode;
                binarySortNode.rightNode = treeNode.rightNode;
                // 删除原先的左子树的最右结点
                delNodeBST(binarySortNode.leftNode,tmp.data);
                return binarySortNode;
            }
        }else if(tmp.data > i && tmp.leftNode != null){
            BinarySortNode binarySortNode = delNodeBST(tmp.leftNode, i);
            tmp.leftNode = binarySortNode;
        }else if(tmp.data < i && tmp.rightNode != null){
            BinarySortNode binarySortNode = delNodeBST(tmp.rightNode,i);
            tmp.rightNode = binarySortNode;
        }
        return treeNode;
    }

}
