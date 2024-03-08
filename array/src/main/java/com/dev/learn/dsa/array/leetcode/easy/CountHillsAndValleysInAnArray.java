package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/count-hills-and-valleys-in-an-array/">2210. Count Hills and Valleys in an Array</a>
 */
public class CountHillsAndValleysInAnArray {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     */
    public int countHillValley(int[] nums) {
        var count = 0;
        var arrayLength = nums.length - 1;

        for (int i = 1; i < arrayLength; i++) {
            var leftNeighbor = findLeftClosestNonEqualNeighbor(nums, 0, i);
            var rightNeighbor = findRightClosestNonEqualNeighbor(nums, i, arrayLength);
            var item = nums[i];

            if (item != nums[i + 1] && (isHill(leftNeighbor, nums[i], rightNeighbor) || isValley(leftNeighbor, nums[i], rightNeighbor))) {
                count++;
            }
        }

        return count;
    }

    private boolean isHill(int leftNeighbor, int item, int rightNeighbor) {
        return leftNeighbor != -1 && rightNeighbor != -1 && leftNeighbor < item && item > rightNeighbor;
    }

    private boolean isValley(int leftNeighbor, int item, int rightNeighbor) {
        return leftNeighbor != -1 && rightNeighbor != -1 && leftNeighbor > item && item < rightNeighbor;
    }

    public int findLeftClosestNonEqualNeighbor(int[] nums, int startIdx, int endIdx) {
        var result = -1;
        var item = nums[endIdx];

        while (startIdx <= endIdx) {
            if (nums[endIdx] != item) {
                result = nums[endIdx];
                break;
            }
            endIdx--;
        }

        return result;
    }

    public int findRightClosestNonEqualNeighbor(int[] nums, int startIdx, int endIdx) {
        var result = -1;
        var item = nums[startIdx];

        while (startIdx <= endIdx) {
            if (nums[startIdx] != item) {
                result = nums[startIdx];
                break;
            }
            startIdx++;
        }

        return result;
    }
}
