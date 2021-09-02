package Programmers.Kit.Sort;

/*
코딩테스트 고득점 Kit > 정렬 > 가장 큰 수
https://programmers.co.kr/learn/courses/30/lessons/42746

제한 사항
- numbers의 길이는 1 이상 100,000 이하입니다.
- numbers의 원소는 0 이상 1,000 이하입니다.
- 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Biggest_number {

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution(numbers);
    }

    private static String Solution(int[] numbers) {
        String answer = "";

        try{
            if(numbers.length > 100000 || numbers.length < 1){  // - numbers의 길이는 1 이상 100,000 이하입니다.
                throw new RestrictionsException("The length of numbers is 1 or more and 100,000 or less.");
            }

            for(int i = 0 ; i < numbers.length; i++){
                if(numbers[i] < 0 || numbers[i] > 1000){    // - numbers의 원소는 0 이상 1,000 이하입니다.
                    throw new RestrictionsException("The elements of numbers are 0 or more and 1,000 or less.");
                }
            }

            ArrayList<String> list= new ArrayList<>();

            for(int i : numbers){
                list.add(Integer.toString(i));
            }

            Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

            if(!list.get(0).equals("0")) {
                for (int i = 0; i < list.size(); i++) {
                    answer += list.get(i);
                }
            }else answer = "0";
        }catch (RestrictionsException e) {
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
