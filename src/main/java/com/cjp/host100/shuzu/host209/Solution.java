package com.cjp.host100.shuzu.host209;


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int start = 0;//头指针
        int end = 0;//尾指针
        int sum = 0;
        int result = Integer.MAX_VALUE;
        //尾指针往后遍历，直到sum的和大于等于target，
        for (end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                result = Math.min((end - start + 1), result);
                sum = sum - nums[start];
                start++;//头指针移动后众和也要减去
            }
        }
        return result== Integer.MAX_VALUE?0:result;
    }
}
