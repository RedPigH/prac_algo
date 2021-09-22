package Programmers.Weekly_Challenge;

/*
위클리 챌린지 > 2주차_상호평가
https://programmers.co.kr/learn/courses/30/lessons/83201

제한 사항
- 2 ≤ scores의 행의 길이(학생 수) ≤ 10
- scores의 열의 길이 = scores의 행의 길이 즉, scores는 행과 열의 길이가 같은 2차원 배열입니다.
- 0 ≤ scores의 원소 ≤ 100
*/

public class Mutual_Evaluation {
    public static void main(String[] args) {
        int[][] scores = {{50,90},{50,87}};

        Solution(scores);

    }

    private static String Solution(int[][] scores) {
        String answer = "";

        try{
            if(scores.length < 2 || scores.length > 10){
                throw new RestrictionsException("2 ≤ scores의 행의 길이(학생 수) ≤ 10");
            }
            int[] avg = new int[scores.length];

            for(int i = 0 ; i < scores.length; i++){
                int min = 100, max = 0, sum = 0, cnt = 0, myscore = scores[i][i];
                for(int j = 0 ; j < scores.length; j++){
                    if(myscore == scores[j][i])
                    if(scores[j][i] < min) min = scores[j][i];
                    if(scores[j][i] > max) max = scores[j][i];
                    sum += scores[j][i];
                }
                if(myscore == min || myscore == max){
                    sum -= myscore;
                    avg[i] = sum / (scores.length - 1);
                }else avg[i] = sum / scores.length;
                //System.out.println(sum);
            }

            for(int i = 0 ; i < avg.length; i++){
                if(avg[i] >= 90) answer += "A";
                else if(avg[i] < 90 && avg[i] >= 80) answer += "B";
                else if(avg[i] < 80 && avg[i] >= 70) answer += "C";
                else if(avg[i] < 70 && avg[i] >= 50) answer += "D";
                else answer += "F";
            }

            //System.out.println(answer);

        }catch (RestrictionsException e){
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
