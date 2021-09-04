package Programmers.Kit.Stack_Queue;

/*
코딩테스트 고득점 Kit > 스택/큐 > 주식 가격
https://programmers.co.kr/learn/courses/30/lessons/42584

제한 사항
- prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
- prices의 길이는 2 이상 100,000 이하입니다.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Stock_Price {
    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};

        Solution(prices);
    }

    private static int[] Solution(int[] prices) {
        int[] result = {};
        try {
            if (prices.length < 2 || prices.length > 100000) {  // prices의 길이는 2 이상 100,000 이하입니다.
                throw new RestrictionsException("The length of prices is 2 or more and 100,000 or less.");
            }

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < 1 || prices[i] > 10000) { // prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
                    throw new RestrictionsException("Each price in prices is a natural number between 1 and 10,000.");
                }
            }

            result = new int[prices.length];

            for (int i = 0; i < prices.length - 1; i++) {
                int sec = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    sec++;
                    if (prices[i] > prices[j]) break;
                }
                result[i] = sec;
            }
            return result;

        } catch (RestrictionsException e) {
            e.printStackTrace();
        }
        return result;
    }

    static class RestrictionsException extends Exception {
        RestrictionsException() {
            super();
        }

        RestrictionsException(String msg) {
            super(msg);
        }
    }
}
