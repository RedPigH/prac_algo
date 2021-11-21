package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12925

public class Convert_string_to_integer {
    public static void main(String[] args) {

        String s = "-1234";

        solution(s);
    }

    private static int solution(String s) {
        int result = 0;

        result = Integer.parseInt(s);

        return  result;
    }
}
