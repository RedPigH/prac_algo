package Programmers.Kit.Sort;

/*
코딩테스트 고득점 Kit > 정렬 > K번째 수
https://programmers.co.kr/learn/courses/30/lessons/42748

제한사항
- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Kth_number {

    public static void main(String[] args) throws IOException {

        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}	; //i = 2, j = 5, k = 3

        Solution(array,commands);
    }

    private static int[] Solution(int[] array, int[][] commands) {
        int[] answer = {};

        try{
            if(array.length > 100){ // - array의 길이는 1 이상 100 이하입니다.
                throw new RestrictionsException("array length 100 over");
            }

            for(int i = 0; i < array.length; i++){  // - array의 각 원소는 1 이상 100 이하입니다.
                if(array[i] > 100 || array[i] < 1){
                    throw new RestrictionsException("Each element of array is 1 or more and 100 or less");
                }
            }

            if(commands.length > 50) {  // - commands의 길이는 1 이상 50 이하입니다.
                throw new RestrictionsException("commends length 50 over");
            }

            for(int i = 0 ; i < commands.length; i++){  // - commands의 각 원소는 길이가 3입니다.
                if(commands[i].length != 3){
                    throw new RestrictionsException("Each element of commands is 3 in length.");
                }
            }

            answer = new int [commands.length];

            for(int i = 0; i < commands.length; i++) {
                ArrayList list = new ArrayList();
                int n = commands[i][0] - 1;
                int m = commands[i][1] - 1;
                if (n > m) {
                    int temp = m;
                    m = n;
                    n = temp;
                }
                for (int j = n; j <= m; j++) {
                    list.add(array[j]);
                }
                Collections.sort(list);
                answer[i] = (int) list.get(commands[i][2] - 1);
            }

        }catch (RestrictionsException e){
            e.printStackTrace();
        }
        return answer;
    }

    static class RestrictionsException extends Exception{
        RestrictionsException(){
            super();
        }
        RestrictionsException(String msg){
            super(msg);
        }
    }
}
