package com.liuyao;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */

/**
 * 递归实现
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null){
            return true;
        }
        return f(pRoot.left,pRoot.right);
    }

    static boolean f(TreeNode left,TreeNode right){
        if (left==null && right==null){
            return true;
        }
        if (left!=null && right!=null){
            return left.val==right.val && f(left.left,right.right) && f(left.right,right.left);
        }
        return false;
    }
}
