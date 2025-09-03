package com.cjp.host100.host128;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        //使用set去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        //最长序列
        int longStreak = 0;
        for (Integer num : set) {
            //如果该元素的上一个数不存在
            if(!set.contains(num -1)){
                int currentNum = num;
                int currentStreak = 1;
                //判断该元素下一个数
                while (set.contains(currentNum +1)){
                    currentStreak++;
                    currentNum++;
                }
                longStreak = Math.max(longStreak,currentStreak);
            }
        }
        return longStreak;
    }
}