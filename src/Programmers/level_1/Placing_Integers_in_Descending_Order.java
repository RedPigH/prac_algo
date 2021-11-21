package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Collections;

public class Placing_Integers_in_Descending_Order {
    public static void main(String[] args) {
        long n = 118372;
        
        solution(n);
    }

    private static long solution(long n) {
        long answer = 0;

        StringBuilder sb = new StringBuilder(Long.toString(n));
        String[] temp = sb.toString().split("");

        Arrays.sort(temp, Collections.reverseOrder());

        answer = Long.parseLong(String.join("",temp));

        return answer;
    }
}
