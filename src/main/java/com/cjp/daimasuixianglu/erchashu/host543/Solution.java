package com.cjp.daimasuixianglu.erchashu.host543;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int ans = -1;

    public int diameterOfBinaryTree(TreeNode root) {

        calculation(root);
        return ans;
    }

    private int calculation(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = diameterOfBinaryTree(root.left) + 1;
        int right = diameterOfBinaryTree(root.right) + 1;
        ans = Math.max(ans, left + right);
        return Math.max(left, right);
    }
}