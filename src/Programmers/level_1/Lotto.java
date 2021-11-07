package Programmers.level_1;

import java.util.stream.IntStream;

public class Lotto {
    public static void main(String[] args) {
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {44, 1, 0, 0, 31, 25};

        solution(lottos, win_nums);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rate = {6,6,5,4,3,2,1};

        int zero_cnt = 0;
        int correct_cnt = 0;

        for(int i : lottos){
            if(i == 0) zero_cnt++;
            else if(IntStream.of(win_nums).anyMatch(x -> x == i)) correct_cnt++;
        }

        answer[0] = rate[correct_cnt + zero_cnt];
        answer[1] = rate[correct_cnt];

        return answer;
    }
}
