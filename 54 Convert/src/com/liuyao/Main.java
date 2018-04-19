package com.liuyao;

import java.util.Stack;

/**
 *输入一棵二叉搜索树，
 * 将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode treeNode0 = new TreeNode(10);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(14);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(8);
        TreeNode treeNode5 = new TreeNode(12);
        TreeNode treeNode6 = new TreeNode(16);

        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        System.out.println(new Main().Convert(treeNode0));
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode Convert2(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode p=pRootOfTree;
        TreeNode pre=null;
        boolean isFirst=true;
        while (p!=null || !stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            if (isFirst){
                pRootOfTree=p;
                pre=pRootOfTree;
                isFirst=false;
            }else {
                pre.right=p;
                p.left=pre;
                pre=p;
            }
            p=p.right;
        }
        return pRootOfTree;
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return null;
        }
        if (pRootOfTree.left==null && pRootOfTree.right==null){
            return pRootOfTree;
        }


        //1. 将左子树构造成双链表，并返回链表头结点
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode p=left;
//        定位左子树双链表最后一个节点
        while (p!=null&&p.right!=null){
            p=p.right;
        }
//        如果左子树链表不为空的话，将root追加到左子树链表中
        if (left!=null){
            p.right=pRootOfTree;
            pRootOfTree.left=p;
        }


        TreeNode right=Convert(pRootOfTree.right);
        if (right!=null){
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }

        return left!=null?left:pRootOfTree;
    }
}
