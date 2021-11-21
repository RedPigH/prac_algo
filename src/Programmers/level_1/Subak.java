package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12922

public class Subak {
    public static void main(String[] args) {
        int n = 4;

        Solution(n);
    }

    private static String Solution(int n) {
        String answer = "";

        for (int i = 0; i < n / 2; i++) {
            answer += "수박";
        }
        if (n % 2 == 1) answer += "수";

        return answer;
    }
}
