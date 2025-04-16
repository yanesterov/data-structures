package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray">3105. Longest Strictly Increasing or Strictly Decreasing Subarray</a>
 */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    private int length = 1;
    private int tmpLength = 1;

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     * strictly increasing nums[i] < nums[i+1]
     * strictly decreasing nums[i] > nums[i+1]
     * algo: using two pointers(i, j=i+1), exit condition j == nums.length - 1, while increasing/decreasing condition true increase pointers and tmpLength, else increase pointers, length=max(tmpLength, length)
     */
    public int longestMonotonicSubarray(int[] nums) {
        length = 1;
        tmpLength = 1;

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] > nums[j]) {
                tmpLength++;
                if (nums[j] <= nums[getNextIndex(j, nums.length)]) {
                    reinitializeLengths();
                }
            } else if (nums[i] < nums[j]) {
                tmpLength++;
                if (nums[j] >= nums[getNextIndex(j, nums.length)]) {
                    reinitializeLengths();
                }
            }
        }

        reinitializeLengths();
        return length;
    }

    private int getNextIndex(int j, int length) {
        var index = j + 1;
        return index >= length ? length - 1 : index;
    }

    private void reinitializeLengths() {
        length = Math.max(tmpLength, length);
        tmpLength = 1;
    }
}
