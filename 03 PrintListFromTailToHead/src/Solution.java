import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> temp=new Stack<Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        while (listNode!=null){
            temp.push(listNode.val);
            listNode=listNode.next;
        }
        while (!temp.isEmpty()){
            res.add(temp.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode first=new ListNode(0);

        for (int i=0;i<10;i++){
            ListNode listNode=new ListNode(i);
            listNode.next=first;
            first=listNode;
        }
        System.out.println(printListFromTailToHead(first));
    }
}