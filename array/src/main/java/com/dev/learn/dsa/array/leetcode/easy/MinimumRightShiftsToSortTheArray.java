package com.dev.learn.dsa.array.leetcode.easy;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/">2855. Minimum Right Shifts to Sort the Array</a>
 */
public class MinimumRightShiftsToSortTheArray {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int minimumRightShifts(List<Integer> nums) {
        var index = 0;
        var count = 0;
        for (var i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                index = i;
                count++;
            }
        }
        if (count > 1) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        return nums.get(nums.size() - 1) > nums.get(0) ? -1 : nums.size() - index;
    }
}
