package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12926

public class Caesar_cipher {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

        solution(s,n);
    }

    private static String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' ') answer += ch;

            if(ch >= 'a' && ch <= 'z'){
                if(ch + n > 'z') answer += (char)(ch + n - 26);
                else answer += (char)(ch + n);
            }else if(ch >= 'A' && ch <= 'Z'){
                if(ch + n > 'Z') answer += (char)(ch + n - 26);
                else answer += (char)(ch + n);
            }
        }

        System.out.println(answer);

        return answer;
    }
}
