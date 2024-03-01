package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/number-of-employees-who-met-the-target/">2798. Number of Employees Who Met the Target</a>
 */
public class NumberOfEmployeesWhoMetTheTarget {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        var result = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                result++;
            }
        }
        return result;
    }
}
