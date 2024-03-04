package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">1450. Number of Students Doing Homework at a Given Time</a>
 */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        var count = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }

        return count;
    }
}
