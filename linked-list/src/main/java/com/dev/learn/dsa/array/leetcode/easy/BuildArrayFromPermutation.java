package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/build-array-from-permutation/">1920. Build Array from Permutation</a>
 */
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        var ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
