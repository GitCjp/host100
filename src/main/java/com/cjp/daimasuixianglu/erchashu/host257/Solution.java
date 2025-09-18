package com.cjp.daimasuixianglu.erchashu.host257;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();//存放结果
        List<Integer> path = new ArrayList<>();//存放每一个路径

        traversal(root, list, path);
        return list;
    }

    public void traversal(TreeNode root, List<String> list, List<Integer> path) {
        //前序遍历
        //中
        path.add(root.val);
        //遇到子节点
        if(root.left ==null&& root.right==null){
            //处理结果
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < path.size()-1; i++) {
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()-1));
            list.add(stringBuilder.toString());
            return;

        }
        //左
        if(root.left!=null){
            traversal(root.left,list,path);//递归
            path.remove(path.size()-1);//回溯
        }
        //右
        if(root.right!= null){
            traversal(root.right,list,path);//递归
            path.remove(path.size()-1);//回溯
        }
    }
}