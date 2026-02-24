package com.cjp.leetcodehost100.newHost100.binaryTree;

import java.util.List;

/**
 * 199. 二叉树的右视图 (Binary Tree Right Side View)
 * 
 * 题目描述：
 * 给定一个二叉树的根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * 
 * 示例：
 * 输入：[1,2,3,null,5,null,4]
 * 输出：[1,3,4]
 * 
 * 输入：[1,null,3]
 * 输出：[1,3]
 * 
 * 输入：[]
 * 输出：[]
 */
public class BinaryTreeRightSideView {
    
    // TODO: 实现解决方案
    public List<Integer> rightSideView(TreeNode root) {
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