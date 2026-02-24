package com.cjp.leetcodehost100.newHost100.binaryTree;

/**
 * 98. 验证二叉搜索树 (Validate Binary Search Tree)
 * 
 * 题目描述：
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * 有效 二叉搜索树定义如下：
 * - 节点的左子树只包含 小于 当前节点的数。
 * - 节点的右子树只包含 大于 当前节点的数。
 * - 所有左子树和右子树自身必须也是二叉搜索树。
 * 
 * 示例：
 * 输入：root = [2,1,3]
 * 输出：true
 * 
 * 输入：root = [5,1,4,null,null,3,6]
 * 输出：false
 * 解释：根节点的值是 5 ，但是其右子节点的值是 4 。
 */
public class ValidateBinarySearchTree {
    
    // TODO: 实现解决方案
    public boolean isValidBST(TreeNode root) {
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