package com.liuyao;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 * 和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode treeNode= new Solution().reConstructBinaryTree(pre,in);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class Solution {

        public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
            return root;
        }

        //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
        private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
            if (startPre > endPre || startIn > endIn)
                return null;
//            当前树的根节点是前序遍历的第一个节点
            TreeNode root = new TreeNode(pre[startPre]);
//            遍历中序遍历的数组
            for (int i = startIn; i <= endIn; i++)
//                找到和根节点相同的节点
                if (in[i] == pre[startPre]) {
//                    中序左边的就是左子树，左子树在前序中的位置，开始为根节点的下一个，结束为根节点的后i个再减去起始位；在中序中为位置为开始位，到根节点的前一个
                    root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
//                    中序右边的就是右子树，右子树在前序中的位置，开始为，当前上面左子树结束的下一个，到最后；在中序中为位置为根节点的下一个到结束
                    root.right = reConstructBinaryTree(pre, startPre + i - startIn  + 1, endPre, in, i + 1, endIn);
                    break;
                }

            return root;
        }
    }
}
