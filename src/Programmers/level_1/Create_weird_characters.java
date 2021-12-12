package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12930

import java.util.Locale;

public class Create_weird_characters {
    public static void main(String[] args) {
        String s = "TTT WWW YYYYYYY";
        //String s = "Hello";

        solution(s);
    }

    private static String solution(String s) {
        String result = "";

        String[] word = s.split(" ", -1);

        for (int i = 0; i < word.length; i++) {
            String temp = word[i];
            StringBuilder sb = new StringBuilder(temp);
            for (int j = 0; j < temp.length(); j++) {
                if (j % 2 == 0 || j == 0) {
                    sb.setCharAt(j,Character.toUpperCase(temp.charAt(j)));
                }
                else {
                    sb.setCharAt(j,Character.toLowerCase(temp.charAt(j)));
                }
            }
            result += sb;
            if (i != word.length - 1) result += " ";
        }

        return result;
    }
}
