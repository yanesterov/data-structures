package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/count-hills-and-valleys-in-an-array/">2210. Count Hills and Valleys in an Array</a>
 */
public class MonotonicArray {

    /**
     * Time complexity: O()
     * Space complexity: O()
     */
    public boolean isMonotonic(int[] nums) {
        var isMonotonic = true;
        var arrayLength = nums.length;
        Boolean isIncreasingOrder = null;

        if (arrayLength == 1) {
            return isMonotonic;
        }

        for (int i = 0; i <= nums.length - 2; i++) {
            if (isIncreasingOrder == null && nums[i] != nums[i + 1]) {
                isIncreasingOrder = nums[i] <= nums[i + 1];
            }
            if (Boolean.TRUE.equals(isIncreasingOrder) && nums[i] > nums[i + 1]) {
                isMonotonic = false;
                break;
            }
            if (Boolean.FALSE.equals(isIncreasingOrder) && nums[i] < nums[i + 1]) {
                isMonotonic = false;
                break;
            }
        }

        return isMonotonic;
    }
}
