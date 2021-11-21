package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12940

public class Greatest_Common_Factor_and_Least_Common_Multiple {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;

        solution(n,m);
    }

    private static int[] solution(int n, int m) {
        int[] result = new int[2];

        int g = gcd(Math.max(n,m), Math.min(n,m));

        result[0] = g;
        result[1] = (n * m) / g;

        return result;
    }

    private static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b,a%b);
    }
}
