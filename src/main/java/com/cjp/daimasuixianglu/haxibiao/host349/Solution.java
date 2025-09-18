package com.cjp.daimasuixianglu.haxibiao.host349;

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0&&nums2.length==0){
            return new int[0];
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums2) {
            if(set.contains(i)){
                set1.add(i);
            }
        }

        return set1.stream().mapToInt(Integer::intValue).toArray();
    }
}
class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0&&nums2.length==0){
            return new int[0];
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums2) {
            if(set.contains(i)){
                set1.add(i);
            }
        }
        // 将set1转为数组
        int[] res = new int[set1.size()];
        int i = 0;
        for (Integer integer : set1) {
            res[i++] = integer;
        }
        return res;
    }
}