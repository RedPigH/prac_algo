package Programmers.Weekly_Challenge;

/*
위클리 챌린지 > 5주차_모음사전
https://programmers.co.kr/learn/courses/30/lessons/84512

제한 사항
- word의 길이는 1 이상 5 이하입니다.
- word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.
*/

public class Vowel_Dictionary {
    public static void main(String[] args) {
        String word = "AAAAE";

        Solution(word);
    }

    private static int Solution(String word) {
        int answer = 1, order = 781;  // 781 : 첫자리 변경될때 순서 차이
        String dic = "AEIOU";
        for(int i = 0; i < word.length(); i++){
            if(i != 0) {
                order = order / 5;
                answer += (order * dic.indexOf(word.charAt(i)));
            }else answer += (order * dic.indexOf(word.charAt(i)));
        }

        System.out.println(answer);

        return answer;
    }
}
