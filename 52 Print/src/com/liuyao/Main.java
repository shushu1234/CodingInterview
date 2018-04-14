package com.liuyao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 从上到下按层打印二叉树，
 * 同一层结点从左至右输出。
 * 每一层输出一行。
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

    public  static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        if (pRoot==null){
            return ret;
        }
        ArrayList<Integer> list=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(null);
        queue.add(pRoot);
        while (queue.size()!=1){
            TreeNode node=queue.removeFirst();
            if (node==null){
                Iterator<TreeNode> iter=queue.iterator();
                while (iter.hasNext()){
                    list.add(iter.next().val);
                }
                ret.add(new ArrayList<>(list));
                queue.add(null);
                list.clear();
                continue;
            }

            if (node.left!=null){
                queue.addLast(node.left);
            }
            if (node.right!=null){
                queue.addLast(node.right);
            }
        }
        return ret;
    }
}
