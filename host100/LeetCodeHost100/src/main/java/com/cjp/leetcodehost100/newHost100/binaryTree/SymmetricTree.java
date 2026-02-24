package com.cjp.leetcodehost100.newHost100.binaryTree;

/**
 * 101. 对称二叉树 (Symmetric Tree)
 * 
 * 题目描述：
 * 给你一个二叉树的根节点 root ，检查它是否轴对称。
 * 
 * 示例：
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 */
public class SymmetricTree {
    
    // TODO: 实现解决方案
    public boolean isSymmetric(TreeNode root) {
        // 待实现
        return false;
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