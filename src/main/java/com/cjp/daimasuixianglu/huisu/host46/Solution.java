package com.cjp.daimasuixianglu.huisu.host46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        backtraversal(len, 1);
    }

    private void backtraversal(int len, int i) {

    }

}