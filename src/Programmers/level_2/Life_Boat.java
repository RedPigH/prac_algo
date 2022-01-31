package Programmers.level_2;

//https://programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;

public class Life_Boat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        solution(people,limit);
    }

    private static int solution(int[] people, int limit) {
        int answer = 0;
        int j = 0;
        Arrays.sort(people);

        for(int i = people.length - 1; j <= i; i--){
            if(people[i] + people[j] > limit) answer++;
            else{
                answer++;
                j++;
            }

        }

        return answer;
    }
}
