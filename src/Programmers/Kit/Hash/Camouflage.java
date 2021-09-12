package Programmers.Kit.Hash;

/*
코딩테스트 고득점 Kit > 해시 > 위장
https://programmers.co.kr/learn/courses/30/lessons/42578

제한 사항
- clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
- 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
- 같은 이름을 가진 의상은 존재하지 않습니다.
- clothes의 모든 원소는 문자열로 이루어져 있습니다.
- 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
- 스파이는 하루에 최소 한 개의 의상은 입습니다.
*/

import java.util.HashMap;

public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Solution(clothes);
    }

    private static int Solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> hash = new HashMap();

        try {
            if (clothes.length > 30 || clothes.length < 0) {
                throw new RestrictionsException("The number of outfits a Spy has is at least 1 and no more than 30.");
            }

        } catch (RestrictionsException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < clothes.length; i++) {
            if (hash.containsKey(clothes[i][1])) {
                hash.put(clothes[i][1], hash.get(clothes[i][1]) + 1);
            } else hash.put(clothes[i][1], 1);
        }

        for (String key : hash.keySet()) {
            result *= (hash.get(key) + 1);
        }
        result -= 1;
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
