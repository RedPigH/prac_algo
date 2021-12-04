package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12948

public class Hide_Cell_Phone_Number {
    public static void main(String[] args) {
        String phone_number = "01033334444";

        solution(phone_number);
    }

    private static String solution(String phone_number) {
        StringBuilder result = new StringBuilder(phone_number);

        for(int i = 0; i < result.length() -4; i++){
            result.setCharAt(i,'*');
        }

        return result.toString();
    }
}
