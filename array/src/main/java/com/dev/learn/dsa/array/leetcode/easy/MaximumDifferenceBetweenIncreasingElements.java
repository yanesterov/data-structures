package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/maximum-difference-between-increasing-elements/">2016. Maximum Difference Between Increasing Elements</a>
 */
public class MaximumDifferenceBetweenIncreasingElements {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int maximumDifference(int[] nums) {
        int diff = -1;

        for (int i = 1, min = nums[0]; i < nums.length; ++i) {
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }

        return diff;
    }
}
