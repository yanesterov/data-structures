package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/find-indices-with-index-and-value-difference-i">2903. Find Indices With Index and Value Difference I</a>
 */
public class FindIndicesWithIndexAndValueDifference {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     */
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0, j = 0; j < nums.length; i++, j++) {
            do {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    return new int[]{i, j};
                }
                j++;
            } while (j < nums.length);
            j = i;
        }

        return new int[]{-1, -1};
    }
}
