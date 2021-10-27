package com.algorithm.simple;

/**
 * 21.合并两个有序链表
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class Simple021 {

    public static void main(String[] args) {
        Simple021 simple = new Simple021();

        ListNode listNode = simple.getListNode(new int[]{1, 2, 4});
        ListNode listNode1 = simple.getListNode(new int[]{1, 3, 4});
        ListNode node = simple.mergeTwoLists(listNode, listNode1);
        System.out.println(node.toString());
    }


    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null ) return l2;
        if(l2 == null ) return l1;
        ListNode l3 = new ListNode();
        ListNode result = l3;
        while(true){
            if(l1 == null && l2 == null)return result;
            if(l1.val < l2.val){
                l3.val = l1.val;
                l1 = l1.next;
            }else{
                l3.val = l2.val;
                l2 = l2.next;
            }
            if(l1 == null){
                l3.next = l2;
                return result;
            }else if(l2 == null){
                l3.next = l1;
                return result;
            }else{
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }
    }

    /**
     * 递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        return null;
    }

    class ListNode {
        int val;
        com.algorithm.simple.Simple021.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, com.algorithm.simple.Simple021.ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return  val + (next == null? "" : "->" + next);
        }
    }

    public ListNode getListNode(int[] args){
        ListNode node = new ListNode(args[0]);
        ListNode node1 = node;
        for (int i = 1; i < args.length; i++) {
            node.next = new ListNode();
            node = node.next;
            node.val = args[i];
        }
        return node1;
    }

}


