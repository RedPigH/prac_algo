package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/87389

public class Remainder_being_one {
    public static void main(String[] args) {
        int n = 10;

        solution(n);
    }

    private static int solution(int n) {
        int result = 1;

        if(n == 1) return result;

        for(int i = 2; i < n; i++){
            if(n % i == 1){
                result = i;
                break;
            }
        }
        return result;
    }
}
