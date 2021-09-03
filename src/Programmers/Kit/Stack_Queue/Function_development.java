package Programmers.Kit.Stack_Queue;

/*
코딩테스트 고득점 Kit > 스택/큐 > 기능개발
https://programmers.co.kr/learn/courses/30/lessons/42586

제한 사항
- 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
- 작업 진도는 100 미만의 자연수입니다.
- 작업 속도는 100 이하의 자연수입니다.
- 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
*/

import java.util.ArrayList;

public class Function_development {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Solution(progresses, speeds);
    }

    private static int[] Solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> answer = new ArrayList<>();

        try {
            if (progresses.length > 100 || speeds.length > 100) {
                throw new RestrictionsException("The number of tasks (progresses, length of the speeds array) is less than 100.");
            }
            for (int i = 0; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    throw new RestrictionsException("The work progress is a natural number less than 100.");
                } else if (speeds.length > 100) {
                    throw new RestrictionsException("The working rate is a natural number less than or equal to 100.");
                }
            }


            for (int i = 0; i < progresses.length; i++) {
                list.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
                        : (100 - progresses[i]) / speeds[i] + 1);
            }

            int cnt = 1;

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= list.get(i - cnt)) {
                    cnt++;
                } else {
                    answer.add(cnt);
                    cnt = 1;
                }
            }
            answer.add(cnt);

        } catch (RestrictionsException e) {
            e.printStackTrace();
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
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
