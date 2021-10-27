package com.algorithm.simple;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，
 * 并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author Gan
 * @date 2020-11-17
 * @description 第一题
 * @url https://leetcode-cn.com/problems/two-sum
 */
@SuppressWarnings("all")
public class Simple002 {

    public static void main(String[] args) {

        Simple002 simple002 = new Simple002();
        ListNode listNode1 = new ListNode(9,new ListNode(2));
        ListNode listNode2 = new ListNode(9,new ListNode(9));
        ListNode listNode = simple002.addTwoNumbers01(listNode1, listNode2);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    /**
     * 解法一
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers01(ListNode l1, ListNode l2) {

        if(l1 == null || l2 == null){
            return null;
        }
        int bit = 0;
        ListNode listNode = new ListNode();
        ListNode listNodetrue = listNode;
        while(true){
            if(l1 == null){
                if(l2.val + bit >= 10){
                    listNode.val = l2.val + bit - 10;
                    bit = 1;
                } else {
                    listNode.val = l2.val + bit;
                    bit = 0;
                }
                l2 = l2.next;
            } else if(l2 == null){
                if(l1.val + bit >= 10){
                    listNode.val = l1.val + bit - 10;
                    bit = 1;
                } else {
                    listNode.val = l1.val + bit;
                    bit = 0;
                }
                l1 = l1.next;
            } else{
                if(l1.val + l2.val + bit >= 10){
                    listNode.val = l1.val + l2.val + bit - 10;
                    bit = 1;
                } else {
                    listNode.val = l1.val + l2.val + bit;
                    bit = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            }

            if(l1 == null && l2 == null){
                if(bit != 0){
                    listNode.next = new ListNode();
                    listNode.next.val = bit;
                    bit = 0;
                }
                return listNodetrue;
            }
            listNode.next = new ListNode();
            listNode = listNode.next;

        }
    }

    /**
     * 简化一下addTwoNumbers01  leetCode竟然超内存
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers02(ListNode l1, ListNode l2) {

        if(l1 == null || l2 == null){
            return null;
        }
        int bit = 0;
        ListNode listNode = new ListNode();
        ListNode listNodetrue = listNode;
        while(true){
            if(l1 == null){
                listNode.val = (l2.val + bit)%10;
                bit = (l2.val + bit)/10;
                l2 = l2.next;
            } else if(l2 == null){
                listNode.val = (l1.val + bit) % 10;
                bit = (l1.val + bit)/10;
                l1 = l1.next;
            } else{
                listNode.val = (l1.val + l2.val + bit)%10;
                bit = (l1.val + l2.val + bit)/10;
                l1 = l1.next;
                l2 = l2.next;
            }

            if(l1 == null && l2 == null){
                if(bit != 0){
                    listNode.next = new ListNode();
                    listNode.next.val = bit;
                    bit = 0;
                }
                return listNodetrue;
            }
            listNode.next = new ListNode();
            listNode = listNode.next;

        }
    }



    /**
     * 内部类
     */

    
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
