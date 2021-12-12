package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12917?language=java

import java.util.Arrays;

public class Placing_Strings_in_Descending_Order {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        solution(s);
    }

    private static String solution(String s) {
        String result = "";

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        result = sb.reverse().toString();

        return result;
    }
}
