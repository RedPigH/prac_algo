package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12947

public class Hasshad {
    public static void main(String[] args) {
        int x = 13;

        solution(x);
    }

    private static boolean solution(int x) {
        boolean result = true;
        int temp_x = x;
        int temp = 0;

        for(int i = Integer.toString(x).length() - 1; i >= 0; i--){
            temp += temp_x / Math.pow(10,i);
            temp_x = (int) (temp_x % Math.pow(10,i));
        }

        if(x % temp != 0) result = false;

        return result;
    }

}
