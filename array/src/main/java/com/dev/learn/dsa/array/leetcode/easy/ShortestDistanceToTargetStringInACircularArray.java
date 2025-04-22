package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array">2515. Shortest Distance to Target String in a Circular Array</a>
 */
public class ShortestDistanceToTargetStringInACircularArray {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int closestTarget(String[] words, String target, int startIndex) {
        var n = words.length;

        for (var i = 0; i < n; ++i) {
            if (words[(startIndex + i + n) % n].equals(target)) {
                return i;
            }
            if (words[(startIndex - i + n) % n].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}
