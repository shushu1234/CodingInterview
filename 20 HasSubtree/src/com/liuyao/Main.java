package com.liuyao;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeNode treeNode0 = new TreeNode(8);
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(9);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);
//        TreeNode treeNode6 = new TreeNode(5);

        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode4.left = treeNode5;
//        treeNode4.right = treeNode6;

        TreeNode treeNode7 = new TreeNode(8);
        TreeNode treeNode8 = new TreeNode(9);
        TreeNode treeNode9 = new TreeNode(2);
        treeNode7.left = treeNode8;
        treeNode7.right = treeNode9;
        System.out.println(HasSubtree(treeNode0, treeNode7));
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
//        当两个树都不空的时候继续查找
        if (root1 != null && root2 != null) {
//            根节点相同，开始遍历孩子节点
            if (root1.val == root2.val) {
                result = DoesTreeHaveTree(root1, root2);
            }
//            前面寻找失败，在大树的左边继续寻找
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
//            在大树的右边继续寻找
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }

    public static   boolean DoesTreeHaveTree(TreeNode root1,TreeNode root2){
//        小树先遍历完，说明全部在大树里面，返回true
        if (root2==null ){
            return true;
        }
//        大树先遍历完，存在节点不在大树里面
        if (root1 ==null ){
            return false;
        }
//        如果两个节点的值不相同，返回false
        if (root1.val!=root2.val){
            return false;
        }
//        继续递归遍历大树左子树与小树左子树  和  大树右子树与小树右子树
        return DoesTreeHaveTree(root1.left,root2.left) && DoesTreeHaveTree(root1.right,root2.right);
    }
}
