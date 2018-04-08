package com.liuyao;

import com.sun.scenario.effect.Merge;

/**
 * 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode listNode0 = new ListNode(1);
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);

        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        listNode0.next = listNode;
        listNode.next = listNode1;
        listNode1.next = listNode2;

        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        System.out.println(Merge(listNode0,listNode3));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null && list2==null){
            return null;
        }
//        新建一个临时的节点
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while (list1!=null && list2!=null){
            if (list1.val<=list2.val){
                head.next=list1;
                list1=list1.next;
                head=head.next;
            } else if (list1.val>list2.val){
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
        }
//        list1完直接把list2接上就好
        if (list1==null){
            head.next=list2;
        }
        if (list2==null){
            head.next=list1;
        }
        return temp.next;
    }
}
