package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/77884

/*
*   약수 개수 구하는 logic : 해당 정수의 제곱근으로 나누어 나머지로 판별
*   나머지 0 : 약수의 갯수는 홀수
*   나머지 1 : 약수의 갯수는 짝수
*/

public class Number_and_addition_of_factors {
    public static void main(String[] args) {
        int left = 13;
        int right = 14;

        solution(left,right);
    }

    private static int solution(int left, int right) {
        int result = 0;

        for(int i = left; i <= right; i++){
            if(i % Math.sqrt(i) == 0) result -= i;
            else result += i;
        }

        return result;
    }
}
