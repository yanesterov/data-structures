package com.dev.learn.dsa.array.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/time-needed-to-buy-tickets">2073. Time Needed to Buy Tickets</a>
 */
public class TimeNeededToBuyTickets {

    /**
     * Time complexity:
     * Space complexity:
     */
    // выход из очереди: tickets[0] - 1 == 0
    // движение очереди: tickets[0] - 1 > 0; смещение элементов влево на 1
    // отслеживание движения нужных билетов: ?
    // корневые случаи: [], ?
    // hint 1: один проход - декремент всех != 0 билетов на 1, инкремент времени на количество людей в очереди(!=0 билетов)
    public int timeRequiredToBuy(int[] tickets, int k) {

        var time = 0;
        var allTicketsBought = false;

        while (!allTicketsBought) {
            for(var i = 0; i < tickets.length; i++){

            }
        }

        return time;
    }
}
