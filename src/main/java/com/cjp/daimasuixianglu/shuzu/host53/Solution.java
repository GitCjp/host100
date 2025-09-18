package com.cjp.daimasuixianglu.shuzu.host53;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}