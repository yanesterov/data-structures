package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/smallest-index-with-equal-value/">2057. Smallest Index With Equal Value</a>
 */
public class SmallestIndexWithEqualValue {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int smallestEqual(int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
