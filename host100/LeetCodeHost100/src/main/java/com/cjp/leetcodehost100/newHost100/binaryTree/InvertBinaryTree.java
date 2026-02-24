package com.cjp.leetcodehost100.newHost100.binaryTree;

/**
 * 226. 翻转二叉树 (Invert Binary Tree)
 * 
 * 题目描述：
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * 
 * 示例：
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * 
 * 输入：root = [2,1,3]
 * 输出：[2,3,1]
 * 
 * 输入：root = []
 * 输出：[]
 */
public class InvertBinaryTree {
    
    // TODO: 实现解决方案
    public TreeNode invertTree(TreeNode root) {
        // 待实现
        return null;
    }
    
    /**
     * 二叉树节点定义
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}