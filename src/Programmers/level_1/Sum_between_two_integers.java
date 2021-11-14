package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12912

public class Sum_between_two_integers {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        solution(a, b);
    }

    private static long solution(int a, int b) {
        long result = 0;

        if (a == b) return a;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            result += i;
        }
        return result;
    }
}
