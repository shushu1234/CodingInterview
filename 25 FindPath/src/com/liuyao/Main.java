package com.liuyao;

/**
 * 输入一颗二叉树和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

import java.util.ArrayList;

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
    private  ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
    private  ArrayList<Integer> list=new ArrayList<Integer>();
    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        //最后返回了
        if (root==null){
            return listAll;
        }
        //将节点添加到list
        list.add(root.val);
//        利用相减的方法
        target-=root.val;
//        如果当前的target为0并且左右子树都空的话，添加
        if (target==0 && root.left==null && root.right==null){
//            new构造一个新的ArrayList
            listAll.add(new ArrayList<Integer>(list));
        }
//        左右子树递归
        FindPath(root.left,target);
        FindPath(root.right,target);
//        回退
        list.remove(list.size()-1);
        return listAll;

    }


}
