package com.liuyao;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(5);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        System.out.println(FindFirstCommonNode3(listNode0,listNode4).val);
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null){
            return null;
        }
        ListNode temp1=pHead1;
        ListNode temp2=pHead2;

        int count1=0;
        int count2=0;
        while (temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while (temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        if (count1 > count2){
            for (int i=0;i<count1-count2;i++)
                pHead1=pHead1.next;
        }else {
            for (int i=0;i<count2-count1;i++)
                pHead2=pHead2.next;
        }
        while (pHead1!=null && pHead2!=null){
            if (pHead1.val==pHead2.val){
                return pHead1;
            }else {
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
        }
        return null;
    }

    public static ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2){
        if (pHead1==null||pHead2==null){
            return null;
        }
        Stack<ListNode> temp1=new Stack<ListNode>();
        Stack<ListNode> temp2=new Stack<ListNode>();
        while (pHead1!=null){
            temp1.push(pHead1);
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            temp2.push(pHead2);
            pHead2=pHead2.next;
        }
        ListNode node=null;
        while (!temp1.isEmpty() || !temp2.isEmpty()){
            if (temp1.peek().val==temp2.peek().val){
                node=temp1.pop();
                temp2.pop();
            }else {
                temp1.pop();
                temp2.pop();
                break;
            }
        }
        return node;
    }

    public static ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2){
        ListNode temp1=pHead1;
        ListNode temp2=pHead2;
        while (temp1!=temp2){
            temp1=(temp1==null?pHead2:temp1.next);
            temp2=(temp2==null?pHead1:temp2.next);
        }
        return temp1;
    }
}
