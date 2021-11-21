package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12928

public class Sum_of_factors {
    public static void main(String[] args) {
        int n = 12;

        solution(n);
    }

    private static int solution(int n) {
        int result = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0) result += i;
        }

        return result;
    }
}
