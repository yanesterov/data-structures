package com.dev.learn.dsa.array.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/summary-ranges/">228. Summary Ranges</a>
 */
public class SummaryRanges {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(N)
     */
    public List<String> summaryRanges(int[] nums) {
        var ranges = new ArrayList<String>();

        for (int i = 0; i < nums.length; i++) {
            var start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ranges.add("" + start + "->" + nums[i]);
            } else {
                ranges.add("" + start);
            }
        }

        return ranges;
    }

}
