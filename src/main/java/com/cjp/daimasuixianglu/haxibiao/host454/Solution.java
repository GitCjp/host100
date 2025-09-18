package com.cjp.daimasuixianglu.haxibiao.host454;

import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> AB =  new HashMap<>();
        int count = 0;
        //遍历数组1和数组2把数组1和数组2的值放到Map

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
               int sum = nums1[i] + nums2[j];
                AB.put(sum, AB.getOrDefault(sum,0)+1);
            }
        }

        //遍历数组3和数组4,判断0-（数组3+数组4）
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int CD = -nums3[i] - nums4[j];
                if(AB.containsKey(CD)){
                    count +=AB.getOrDefault(CD,0);
                }
            }
        }
        return count;
    }
}