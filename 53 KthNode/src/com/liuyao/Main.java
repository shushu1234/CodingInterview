package com.liuyao;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，
 * 按结点数值大小顺序第三个结点的值为4。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeNode treeNode0 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(8);

        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        System.out.println(KthNode(treeNode0,3).val);
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public   int index=0;
    public static TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot!=null){
            TreeNode node=KthNode(pRoot.left,k);
            if (node != null){
                return node;
            }
            index++;
            if (index==k){
                return pRoot;
            }
            node=KthNode(pRoot.right,k);
            if (node!=null){
                return node;
            }
        }
        return null;
    }

}
