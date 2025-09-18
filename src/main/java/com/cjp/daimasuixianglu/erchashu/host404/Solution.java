package com.cjp.daimasuixianglu.erchashu.host404;

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
    public int sumOfLeftLeaves(TreeNode root) {
        int result = sumLeft(root);
        return result;
    }

    private int sumLeft(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int mid = 0;
        int left = sumLeft(root.left);
        int right = sumLeft(root.right);
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            mid = root.left.val;
        }
        int sum = mid + left + right;
        return sum;
    }
}