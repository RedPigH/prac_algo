package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_smallest_number {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        solution(arr);
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Integer.MAX_VALUE;

        if (list.size() == 1) answer = new int[] {-1};
        else {
            for (int i : list) {
                if (i < min) min = i;
            }

            list.remove(list.indexOf(min));

            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}
