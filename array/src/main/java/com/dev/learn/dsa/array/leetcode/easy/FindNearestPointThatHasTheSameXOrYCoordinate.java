package com.dev.learn.dsa.array.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate">1779. Find Nearest Point That Has the Same X or Y Coordinate</a>
 */
public class FindNearestPointThatHasTheSameXOrYCoordinate {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public int nearestValidPoint(int x, int y, int[][] points) {
        var smallestIndex = -1;
        var manhattanDistance = 0;
        var smallestManhattanDistance = Integer.MAX_VALUE;

        for (var i = 0; i < points.length; i++) {
            for (var j = 0; j < 2; j++) {
                if (x != points[i][0] && y != points[i][1]) {
                    continue;
                }

                manhattanDistance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);

                if (manhattanDistance >= smallestManhattanDistance) {
                    continue;
                }

                smallestManhattanDistance = manhattanDistance;
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
