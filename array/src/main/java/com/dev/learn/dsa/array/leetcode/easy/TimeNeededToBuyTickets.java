package com.dev.learn.dsa.array.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/time-needed-to-buy-tickets">2073. Time Needed to Buy Tickets</a>
 */
public class TimeNeededToBuyTickets {

    /**
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     */
    // hint 1: один проход - декремент всех != 0 билетов на 1, инкремент времени на количество людей в очереди(!=0 билетов)
    public int timeRequiredToBuy(int[] tickets, int k) {
        var time = 0;

        while (tickets[k] != 0) {
            for (var i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }
                if (tickets[k] == 0) {
                    break;
                }
            }
        }

        return time;
    }
}
