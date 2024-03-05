package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/">1437. Check If All 1's Are at Least Length K Places Away</a>
 */
public class CheckIfAllOnesAreAtLeastLengthKPlacesAway {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public boolean kLengthApart(int[] nums, int k) {
        var startIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && startIdx == -1) {
                startIdx = i;
            } else if (nums[i] == 1 && startIdx != i) {
                if (i - startIdx - 1 < k) {
                    return false;
                }
                startIdx = i;
            }
        }

        return true;
    }
}
