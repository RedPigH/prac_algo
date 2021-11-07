package Programmers.level_1;

import java.util.stream.IntStream;

public class Add_missing_numbers {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,6,7,8,0};

        solution(numbers);
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0 ; i < 10; i++){
            int tmp = i;
            if(!IntStream.of(numbers).anyMatch(x -> x == tmp)) answer += tmp;
        }

        return answer;
    }
}
