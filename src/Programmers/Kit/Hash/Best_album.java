package Programmers.Kit.Hash;

/*
코딩테스트 고득점 Kit > 해시 > 베스트앨범
https://programmers.co.kr/learn/courses/30/lessons/42579

제한 사항
- genres[i]는 고유번호가 i인 노래의 장르입니다.
- plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
- genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
- 장르 종류는 100개 미만입니다.
- 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
- 모든 장르는 재생된 횟수가 다릅니다.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Best_album {
    public static void main(String[] args) {
        String[] genres = {};
        int[] plays = {};
        
        Solution(genres,plays);
    }

    private static int[] Solution(String[] genres, int[] plays) {
        ArrayList list = new ArrayList();
        HashMap<String,Integer> hash = new HashMap();
        int[] result = {};

        try{
            if(genres.length != plays.length || genres.length < 1 || genres.length>10000){
                throw new RestrictionsException("genres and plays are the same length, which is greater than or equal to 1 and less than or equal to 10,000.");
            }

            for(int i = 0 ; i< genres.length; i++){
                if(hash.containsKey(genres[i])){
                    hash.put(genres[i], hash.get(genres[i]) + plays[i]);
                }
                else hash.put(genres[i],plays[i]);
            }

            List<String> keySet = new ArrayList<>(hash.keySet());
            keySet.sort((o1, o2) -> hash.get(o2) - hash.get(o1));

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
