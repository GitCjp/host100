package com.cjp.leetcodehost100.newHost100.binaryTree;

import java.util.List;

/**
 * 102. 二叉树的层序遍历 (Binary Tree Level Order Traversal)
 * 
 * 题目描述：
 * 给你二叉树的根节点 root ，返回其节点值的层序遍历。（即逐层地，从左到右访问所有节点）。
 * 
 * 示例：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[9,20],[15,7]]
 * 
 * 输入：root = [1]
 * 输出：[[1]]
 * 
 * 输入：root = []
 * 输出：[]
 */
public class BinaryTreeLevelOrderTraversal {
    
    // TODO: 实现解决方案
    public List<List<Integer>> levelOrder(TreeNode root) {
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