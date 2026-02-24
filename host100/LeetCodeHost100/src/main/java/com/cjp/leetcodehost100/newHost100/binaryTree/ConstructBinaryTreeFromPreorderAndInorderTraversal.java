package com.cjp.leetcodehost100.newHost100.binaryTree;

/**
 * 105. 从前序与中序遍历序列构造二叉树 (Construct Binary Tree from Preorder and Inorder Traversal)
 * 
 * 题目描述：
 * 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 * 
 * 示例：
 * 输入：preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * 输出：[3,9,20,null,null,15,7]
 * 
 * 输入：preorder = [-1], inorder = [-1]
 * 输出：[-1]
 * 
 * 提示：
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder 和 inorder 均无重复元素
 * inorder 均出现在 preorder
 * preorder 保证 是二叉树的前序遍历序列
 * inorder 保证 是二叉树的中序遍历序列
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    
    // TODO: 实现解决方案
    public TreeNode buildTree(int[] preorder, int[] inorder) {
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