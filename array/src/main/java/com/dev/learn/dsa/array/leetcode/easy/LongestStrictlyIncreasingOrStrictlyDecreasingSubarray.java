package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray">3105. Longest Strictly Increasing or Strictly Decreasing Subarray</a>
 */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    /**
     * Time complexity:
     * Space complexity:
     */
    // strictly increasing nums[i] < nums[i+1]
    // strictly decreasing nums[i] > nums[i+1]
    // algo: using two pointers(i, j=i+1), exit condition j == nums.length - 1, while increasing/decreasing condition true increase pointers and tmpLength, else increase pointers, length=max(tmpLength, length)
    // Input: nums = [1,4,3,3,2] Output: 2
    public int longestMonotonicSubarray(int[] nums) {
        var length = 1;
        var tmpLength = 1;

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] > nums[j]) {
                tmpLength++;
            } else {
                length = Math.max(tmpLength, length);
                tmpLength = 1;
            }
        }

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] < nums[j]) {
                tmpLength++;
            } else {
                length = Math.max(tmpLength, length);
                tmpLength = 1;
            }
        }

        return length;
    }
}
