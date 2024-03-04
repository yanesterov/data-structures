package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/">1752. Check if Array Is Sorted and Rotated</a>
 */
public class CheckIfArrayIsSortedAndRotated {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public boolean check(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }
}
