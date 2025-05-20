package com.dev.learn.dsa.array.leetcode.medium;

import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations">2442. Count Number of Distinct Integers After Reverse Operations</a>
 */
public class CountNumberOfDistinctIntegersAfterReverseOperations {

    /**
     * Time complexity: O(N)
     * Space complexity: O(N)
     */
    public int countDistinctIntegers(int[] nums) {
        var uniqueNums = new HashSet<Integer>();

        for (int num : nums) {
            uniqueNums.add(num);
            uniqueNums.add(reverse(num));
        }

        return uniqueNums.size();
    }

    private int reverse(int num) {
        var reversedNum = 0;

        while (num > 0) {
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }

        return reversedNum;
    }
}
