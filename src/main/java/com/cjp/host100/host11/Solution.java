package com.cjp.host100.host11;

class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int ans = 0;

        while (left < right) {
            int ares = Math.min(height[right], height[left]) * (right - left);
            ans  = Math.max(ans,ares);
            if (height[left] < height[right]) {
                left++;
            } else
                right--;
        }

        return ans;
    }
}
