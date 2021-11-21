package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12932

import java.util.Arrays;

public class Flip_natural_numbers_to_form_an_array {
    public static void main(String[] args) {
        long n = 12345;

        solution(n);
    }

    private static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n));
        String[] temp = sb.reverse().toString().split("");

        return Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
    }
}
