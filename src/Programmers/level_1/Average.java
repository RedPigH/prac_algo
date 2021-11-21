package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12944

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        solution(arr);
    }

    private static double solution(int[] arr) {
        double result = 0;
        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        result = (double) sum / arr.length;

        return result;
    }
}
