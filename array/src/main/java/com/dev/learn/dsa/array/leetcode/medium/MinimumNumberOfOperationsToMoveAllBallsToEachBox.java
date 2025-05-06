package com.dev.learn.dsa.array.leetcode.medium;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box">1769. Minimum Number of Operations to Move All Balls to Each Box</a>
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(N)
     */
    public int[] minOperations(String boxes) {
        var answer = new int[boxes.length()];
        var flledBoxesIndicies = new ArrayList<Integer>();

        for (var i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                flledBoxesIndicies.add(i);
            }
        }

        for (var i = 0; i < answer.length; i++) {
            for (var idx : flledBoxesIndicies) {
                answer[i] += Math.abs(i - idx);
            }
        }

        return answer;
    }
}
