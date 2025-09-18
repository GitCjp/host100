package com.cjp.daimasuixianglu.haxibiao.host18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] >= 0) {
                break;
            }
            //i的去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //i后面的j
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] > target && nums[i] + nums[j] >= 0) {
                    break;
                }
                if ( j > i + 1&&nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
//                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    }
                    list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    //对left和right去重（必须有一个元素在去重）
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;

                }
            }
        }
        return list;
    }
}
class Solution2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);  // 排序数组
        List<List<Integer>> result = new ArrayList<>();  // 结果集
        for (int k = 0; k < nums.length; k++) {
            // 剪枝处理
            if (nums[k] > target && nums[k] >= 0) {
                break;    // 此处的break可以等价于return result;
            }
            // 对nums[k]去重
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            for (int i = k + 1; i < nums.length; i++) {
                // 第二级剪枝
                if (nums[k] + nums[i] > target && nums[k] + nums[i] >= 0) {
                    break;    // 注意是break到上一级for循环，如果直接return result;会有遗漏
                }
                // 对nums[i]去重
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (right > left) {
                    long sum = (long) nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        // 对nums[left]和nums[right]去重
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}