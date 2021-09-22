package Programmers.Weekly_Challenge;

/*
위클리 챌린지 > 1주차_부족한 금액 계산하기
https://programmers.co.kr/learn/courses/30/lessons/82612

제한 사항
- 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
- 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
- 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
*/

public class Calculate_the_shortfall {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        Solution(price, money, count);

    }

    private static long Solution(int price, int money, int count) {
        long result = -1;
        long temp = 0;

        try {
            if (price < 1 || price > 2500) {
                throw new RestrictionsException("price : 1 ≤ price ≤ 2,500");
            }
            if (money < 1 || money > 1000000000) {
                throw new RestrictionsException("money : 1 ≤ money ≤ 1,000,000,000");
            }
            if (count < 1 || count > 2500) {
                throw new RestrictionsException("count : 1 ≤ count ≤ 2,500");
            }

            for (int i = 1; i <= count; i++) {
                temp += i;
            }

            if ((temp * price) > money) result = temp * price - money;
            else result = 0;

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
