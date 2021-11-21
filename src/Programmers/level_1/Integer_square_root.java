package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12934

public class Integer_square_root {
    public static void main(String[] args) {
        long n = 121;
        
        solution(n);

    }

    private static long solution(long n) {
        long result = 0;

        Double temp = Math.sqrt(n);

        if(temp == temp.intValue()){
            result = (long) Math.pow(temp+1,2);
        }else result = -1;

        return result;
    }
}
