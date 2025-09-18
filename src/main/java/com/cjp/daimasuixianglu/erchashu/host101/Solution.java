package com.cjp.daimasuixianglu.erchashu.host101;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean a = compare(root.left, root.right);
        return a;
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }

        if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean a = compare(right.left,left.right);
        boolean b = compare(right.right,left.left);
        return a && b;
    }
}
