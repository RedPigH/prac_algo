package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12918

public class String_handling_basics {
    public static void main(String[] args) {
        String s = "a234";

        solution(s);
    }

    private static boolean solution(String s) {
        boolean result = true;

        if(!(s.length() == 4 || s.length() == 6)) return false;

        try{
            Integer.parseInt(s);
        }catch (Exception e){
            result = false;
        }
        return result;
    }
}
