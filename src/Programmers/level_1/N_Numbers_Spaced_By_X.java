package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12954

public class N_Numbers_Spaced_By_X {
    public static void main(String[] args) {

        long x = 2;
        int n = 5;

        solution(x,n);

    }

    private static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = x * (i + 1);
        }

        return answer;
    }
}
