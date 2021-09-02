package Programmers.Kit.Sort;

/*
코딩테스트 고득점 Kit > 정렬 > H-Index
https://programmers.co.kr/learn/courses/30/lessons/42747

제한사항
- 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
- 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
*/

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        Solution(citations);
    }

    private static int Solution(int[] citations) {

        int answer = 0;

        try {
            if (citations.length > 1000 || citations.length < 1) {
                throw new RestrictionsException("The number of papers published by scientists is at least 1 and no more than 1,000.");
            }

            for (int i = 0; i < citations.length; i++) {
                if (citations[i] > 10000 || citations[i] < 0) {
                    throw new RestrictionsException("The number of citations per paper is between 0 and 10,000.");
                }
            }

            Arrays.sort(citations);

            for (int i = 0; i < citations.length - 1; i++) {
                int h = citations.length - i;
                if (citations[i] >= h) {
                    answer = h;
                    break;
                }
            }
        } catch (RestrictionsException e) {
            e.printStackTrace();
        }

        return answer;
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
