package com.liuyao;

public class Main {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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

        ListNode listNode7 = deleteDuplication(listNode);
        while (listNode7 != null) {
            System.out.print(listNode7.val + " ");
            listNode7 = listNode7.next;
        }
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode first=new ListNode(0);
        first.next=pHead;
        ListNode temp=first;
        ListNode head=pHead;
        if (pHead==null){
            return null;
        }else {
            while (head!=null&&head.next!=null){
                if (head.val==head.next.val){
                    int p=head.val;
                    while (head != null && head.val==p){
                        head=head.next;
                    }
                    temp.next=head;
                }else {
                    temp=head;
                    head=head.next;
                }
            }
            return first.next;
        }

    }
}
