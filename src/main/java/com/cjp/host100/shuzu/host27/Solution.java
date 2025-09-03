package com.cjp.host100.shuzu.host27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int show = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val){
                nums[show] = nums[fast];
                show++;
            }
        }
        return show;
    }
}