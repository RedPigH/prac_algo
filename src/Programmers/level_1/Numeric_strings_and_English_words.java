package Programmers.level_1;

import java.util.Arrays;

public class Numeric_strings_and_English_words {
    public static void main(String[] args) {
        String s = "one4seveneight";

        solution(s);
    }

    public static int solution(String s) {
        int answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(String tmp : str){
            if(s.contains(tmp)){
                s = s.replace(tmp, Integer.toString(Arrays.asList(str).indexOf(tmp)));
            }
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}
