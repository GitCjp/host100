package com.cjp.daimasuixianglu.huisu.host77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> list = new ArrayList<>();

    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        traversal(n, k, 1);
        return list;
    }

    private void traversal(int n, int k, int startIndex) {
        //终止条件
        if (path.size() == k) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            traversal(n, k, i + 1);
            path.removeLast();
        }
    }
}