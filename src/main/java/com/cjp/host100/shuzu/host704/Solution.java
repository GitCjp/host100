package com.cjp.host100.shuzu.host704;

class Solution {
    public int search(int[] nums, int target) {
        int lenght = nums.length;
        int left = 0;
        int right =lenght -1;
        while (left <= right){
            int mid = (right + left) /2;
            int middle = nums[mid];
            if(middle > target){
                right = mid - 1;
            }else if(middle < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}