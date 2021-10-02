package Programmers.Weekly_Challenge;

/*
위클리 챌린지 > 6주차_복서 정렬하기
https://programmers.co.kr/learn/courses/30/lessons/85002

제한 사항
- weights의 길이는 2 이상 1,000 이하입니다.
    weights의 모든 값은 45 이상 150 이하의 정수입니다.
    weights[i] 는 i+1번 복서의 몸무게(kg)를 의미합니다.
- head2head의 길이는 weights의 길이와 같습니다.
    head2head의 모든 문자열은 길이가 weights의 길이와 동일하며, 'N', 'W', 'L'로 이루어진 문자열입니다.
    head2head[i] 는 i+1번 복서의 전적을 의미하며, head2head[i][j]는 i+1번 복서와 j+1번 복서의 매치 결과를 의미합니다.
        'N' (None)은 두 복서가 아직 붙어본 적이 없음을 의미합니다.
        'W' (Win)는 i+1번 복서가 j+1번 복서를 이겼음을 의미합니다.
        'L' (Lose)는 i+1번 복사가 j+1번 복서에게 졌음을 의미합니다.
    임의의 i에 대해서 head2head[i][i] 는 항상 'N'입니다. 자기 자신과 싸울 수는 없기 때문입니다.
    임의의 i, j에 대해서 head2head[i][j] = 'W' 이면, head2head[j][i] = 'L'입니다.
    임의의 i, j에 대해서 head2head[i][j] = 'L' 이면, head2head[j][i] = 'W'입니다.
    임의의 i, j에 대해서 head2head[i][j] = 'N' 이면, head2head[j][i] = 'N'입니다.
*/

import java.util.Arrays;
import java.util.Comparator;

public class Sorting_Boxers {
    public static void main(String[] args) {

        int[] weights = {50, 82, 75, 120};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};

        Solution(weights, head2head);

    }

    private static int[] Solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        int[][] boxer = new int[weights.length][4];

        for (int i = 0; i < head2head.length; i++) {
            char[] temp = head2head[i].toCharArray();
            int win_cnt = 0;
            int N_cnt = 0;
            int heavy_cnt = 0;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == 'W') {
                    win_cnt++;
                    if (weights[i] < weights[j]) {
                        heavy_cnt++;
                    }
                }else if (temp[j] == 'N') N_cnt++;
            }
            boxer[i][0] = i;
            boxer[i][1] = weights[i];
            boxer[i][2] = (int) ((1.0) * win_cnt / (head2head.length - N_cnt) * 100000);
            boxer[i][3] = heavy_cnt;
        }

        Arrays.sort(boxer, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2] != o2[2]) return o2[2] - o1[2]; //승률
                if (o1[3] != o2[3]) return o2[3] - o1[3]; //큰놈이랑 싸움
                if (o1[1] != o2[1]) return o2[1] - o1[1]; //몸무게
                return o1[0] - o2[0];
            }
        });

        for(int i = 0 ; i < boxer.length; i++){
            answer[i] = boxer[i][0] + 1;
        }

        return answer;
    }
}
