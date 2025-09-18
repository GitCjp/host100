package com.cjp.daimasuixianglu.shuzu.host977;

import static java.lang.Math.pow;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int last = result.length -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            if(pow(nums[left],2) > pow(nums[right],2)){
                result[last] = (int) pow(nums[left],2);
                last--;
                left++;
            }else{
                result[last] = (int) pow(nums[right],2);
                last--;
                right--;
            }
        }
        return result;
    }
}