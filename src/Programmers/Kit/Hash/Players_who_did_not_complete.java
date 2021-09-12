package Programmers.Kit.Hash;

/*
코딩테스트 고득점 Kit > 해시 > 완주하지 못한 선수
https://programmers.co.kr/learn/courses/30/lessons/42576

제한 사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.
*/

import java.util.HashMap;
import java.util.Map;

public class Players_who_did_not_complete {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution(participant, completion);

    }

    private static String Solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> hash = new HashMap<>();

        try {
            if (participant.length < 1 || participant.length > 100000) {
                throw new RestrictionsException("The number of runners participating in the marathon is not less than 1 and not more than 100,000.");
            }
            if (completion.length != participant.length - 1) {
                throw new RestrictionsException("The length of completion is 1 less than the length of the participant.");
            }

            for (String ps : participant) {
                if (hash.containsKey(ps)) {
                    hash.put(ps, hash.get(ps) + 1);
                } else hash.put(ps, 1);
            }

            for (String cs : completion) {
                hash.put(cs, hash.get(cs) - 1);
            }

            result = getKey(hash, 1);

        } catch (RestrictionsException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
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
