package com.liuyao;

/**
 * 给定一个二叉树和其中的一个结点，
 * 请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */

/**
 * 1. 如果该节点有右子节点，那么沿着他的右子节点找左子节点
 * 2. 如果给节点没有右子节点，那么沿着他的父节点找，如果该父节点是某个节点的左子节点，那么该父节点就是下一个点
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;  //指向父节点的指针

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right!=null){
            pNode=pNode.right;
            while (pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
//        沿着他的父节点找
        while (pNode.next!=null){
//            当前的节点的是某个节点的左子节点,那么输出
            if (pNode.next.left==pNode){
                return pNode.next;
            }
            pNode=pNode.next;
        }
        return null;
    }

}
