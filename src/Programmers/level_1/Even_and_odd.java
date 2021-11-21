package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12937

public class Even_and_odd {
    public static void main(String[] args) {
        int n = 3;

        solution(n);
    }

    private static String solution(int n) {
        if(n % 2 == 0) return "Even";
        else return "Odd";
    }
}
