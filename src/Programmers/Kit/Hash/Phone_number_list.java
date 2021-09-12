package Programmers.Kit.Hash;

/*
코딩테스트 고득점 Kit > 해시 > 전화번호 목록
https://programmers.co.kr/learn/courses/30/lessons/42577

제한 사항
- phone_book의 길이는 1 이상 1,000,000 이하입니다.
- 각 전화번호의 길이는 1 이상 20 이하입니다.
- 같은 전화번호가 중복해서 들어있지 않습니다.
*/

import java.util.Arrays;

public class Phone_number_list {
    public static void main(String[] args) {
        String[] phone_book = {};

        Solution(phone_book);
    }

    private static boolean Solution(String[] phone_book) {
        boolean result = true;

        try{
            if(phone_book.length < 1 || phone_book.length > 1000000){
                throw new RestrictionsException("The length of phone_book is 1 or more and 1,000,000 or less.");
            }
            for(String s : phone_book){
                if(s.length() > 20 || s.length() < 1){
                    throw new RestrictionsException("Each phone number must be between 1 and 20 in length.");
                }
            }

            Arrays.sort(phone_book);

            for(int i = 0 ; i < phone_book.length - 1; i++){
                if(phone_book[i+1].startsWith(phone_book[i])){
                    return false;
                }
            }
        }catch (RestrictionsException e){
            e.printStackTrace();
        }
        return result;
    }

    static class RestrictionsException extends Exception {
        RestrictionsException() {
            super();
        }

        RestrictionsException(String msg) {
            super(msg);
        }
    }
}
