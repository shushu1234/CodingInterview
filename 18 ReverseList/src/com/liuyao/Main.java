package com.liuyao;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode listNode0 = new ListNode(1);
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        listNode0.next = listNode;
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        System.out.println(ReverseList(listNode0));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode preNode=null;
        ListNode nextNode=head.next;
        head.next=preNode;
        while (nextNode!=null){
            preNode=head;
            head=nextNode;
            nextNode=nextNode.next;
            head.next=preNode;
        }
        head.next=preNode;
        return head;
    }
}
