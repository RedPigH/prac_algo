package Programmers.level_2;

//https://programmers.co.kr/learn/courses/30/lessons/12973

import java.util.Stack;

public class Pair_To_Remove {
    public static void main(String[] args) {
        String s = "ddfsdfs";

        solution(s);
    }

    private static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack();
        char[] temp = s.toCharArray();

        for(char c : temp){
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        if(stack.isEmpty()) answer = 1;

        return answer;
    }
}
