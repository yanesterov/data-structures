package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/build-array-from-permutation/">1920. Build Array from Permutation</a>
 */
public class BuildArrayFromPermutation {

    /**
     * Time complexity: O(N)
     * Space complexity: O(N)
     */
    public int[] buildArray(int[] nums) {
        var ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int[] buildArrayRecursively(int[] nums) {
        buildArrayRecursively(nums, 0);
        return nums;
    }

    private void buildArrayRecursively(int[] nums, int start) {
        if (start < nums.length) {
            int temp = nums[start];
            int result = nums[temp];
            buildArrayRecursively(nums, start + 1);
            nums[start] = result;
        }
    }
}
