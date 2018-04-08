package com.liuyao;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
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

        System.out.println(FindKthToTail2(listNode0,8).val);
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        int len=0;
        ListNode temp=head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
//        System.out.println(len);
        if (len-k<0){
            return null;
        }
        for (int i=1;i<=(len-k);i++){
            head=head.next;
            if (head==null){
                return null;
            }
        }
        return head;
    }

    public static ListNode FindKthToTail2(ListNode head,int k){
        if(head==null||k<=0){
            return null;
        }
        ListNode temp1=head,temp2=head;
        while (temp2!=null && k-->0){
            temp2=temp2.next;
        }
        if (temp2==null && k!=0){
            return null;
        }
        while (temp2!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
