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

public class Best_album {
    public static void main(String[] args) {
        String[] genres = {};
        int[] plays = {};
        
        Solution(genres,plays);
    }

    private static int[] Solution(String[] genres, int[] plays) {
        int[] result = {};

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
