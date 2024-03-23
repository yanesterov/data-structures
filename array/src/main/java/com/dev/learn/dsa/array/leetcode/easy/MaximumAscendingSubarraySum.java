package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/maximum-ascending-subarray-sum/">1800. Maximum Ascending Subarray Sum</a>
 */
public class MaximumAscendingSubarraySum {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int maxAscendingSum(int[] nums) {
        var sum = 0;
        var tmpSum = nums[0];

        if (nums.length == 1) {
            return tmpSum;
        }

        for (var i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                tmpSum += nums[i];
            } else {
                sum = Math.max(sum, tmpSum);
                tmpSum = nums[i];
            }
        }
        sum = Math.max(sum, tmpSum);

        return sum;
    }
}
