package com.cjp.daimasuixianglu.erchashu.host102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //队列
        Queue<TreeNode> queue= new LinkedList<>();
        //放入中
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            while (len > 0){
                
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                len --;
            }
            result.add(list);
        }
        return result;
    }
}