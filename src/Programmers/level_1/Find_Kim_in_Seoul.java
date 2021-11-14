package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12919

import java.util.Arrays;

public class Find_Kim_in_Seoul {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        solution(seoul);
    }

    private static String solution(String[] seoul) {
        String result = "";

        int n = Arrays.asList(seoul).indexOf("Kim");

        result = "김서방은 " + n + "에 있다";

        return result;

    }
}
