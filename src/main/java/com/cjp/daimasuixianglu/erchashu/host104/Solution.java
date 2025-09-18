package com.cjp.daimasuixianglu.erchashu.host104;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = maxDepth(root.right);
        int left = maxDepth(root.left);
        return Math.max(right, left) + 1;
    }
}