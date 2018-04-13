package com.liuyao;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 不知道为什么提交的时候不能给isBalanced添加static属性。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode node=new TreeNode(1);
        System.out.println(new Main().IsBalanced_Solution(node));
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public  boolean isBalanced=true;

    public boolean IsBalanced_Solution(TreeNode root) {
        check(root);
        return isBalanced;
    }

    public int check(TreeNode node){
        if (node==null){
            return 0;
        }
        int left=check(node.left);
        int right=check(node.right);

        if (Math.abs(left-right)>1){
            isBalanced=false;
        }
        return left>right?left+1:right+1;
    }
}
