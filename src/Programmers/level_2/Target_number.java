package Programmers.level_2;

//https://programmers.co.kr/learn/courses/30/lessons/43165

public class Target_number {
    static int answer;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        solution(numbers, target);

        System.out.println(answer);
    }

    private static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers,target,0,0);

        return answer;
    }

    private static void dfs(int[] numbers, int target, int idx, int sum) {

        if(idx == numbers.length){
            if(target == sum) answer++;
            return;
        }

        dfs(numbers,target,idx+1,sum + numbers[idx]);
        dfs(numbers,target,idx+1, sum - numbers[idx]);
    }
}
