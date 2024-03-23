package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-distance-to-the-target-element/">1848. Minimum Distance to the Target Element</a>
 */
public class MinimumDistanceToTheTargetElement {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int getMinDistance(int[] nums, int target, int start) {
        var minDistance = nums.length;

        for (int i = start; i >= 0; i--) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance, Math.abs(i - start));
            }
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance, Math.abs(i - start));
            }
        }

        return minDistance;
    }
}
