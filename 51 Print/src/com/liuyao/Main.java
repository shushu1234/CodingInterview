package com.liuyao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，
 * 其他行以此类推。

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
        TreeNode treeNode6 = new TreeNode(5);

        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;
        System.out.println(new Main().Print(treeNode0));
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        if (pRoot==null){
            return ret;
        }
        ArrayList<Integer> list=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(null); //每行都是从null开始的
        queue.add(pRoot);
        boolean leftToRight=true;  //标记

        while (queue.size()!=1){
            TreeNode node=queue.removeFirst();
            if (node==null){  //到新的一行开始 null 数值，数值
                Iterator<TreeNode> iter=null;
                if (leftToRight){
                    iter=queue.iterator();  //正向迭代
                }else {
                    iter=queue.descendingIterator();  //反向迭代
                }
                leftToRight=!leftToRight;
                while (iter.hasNext()){
                    TreeNode node1=iter.next();
                    list.add(node1.val);
                }
                ret.add(new ArrayList<Integer>(list)); //重新申请一个ArrayList对象
                list.clear();//清空list
                queue.addLast(null); //添加新的间隔符
                continue;
            }

            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
        return ret;
    }
}
