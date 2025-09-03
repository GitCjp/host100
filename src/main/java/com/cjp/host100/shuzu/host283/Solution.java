package com.cjp.host100.shuzu.host283;

class Solution {
    public void moveZeroes(int[] nums) {
        int right = 0,left = 0;
        int length = nums.length;
        while (right < length){
            if(nums[right] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
class Solution2{
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // 指向当前已处理的非零元素的末尾
        int left = 0;

        // 第一次遍历：将所有非零元素移到左侧
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        // 第二次遍历：将剩余位置填充为 0
        for (int i = left; i < n; i++) {
            nums[i] = 0;
        }
    }
}