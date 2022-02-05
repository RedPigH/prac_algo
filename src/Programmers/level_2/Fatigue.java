package Programmers.level_2;

//https://programmers.co.kr/learn/courses/30/lessons/87946

public class Fatigue {
    static int max = Integer.MIN_VALUE;
    static boolean[] isvisited;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        solution(k,dungeons);
    }

    private static int solution(int k, int[][] dungeons) {
        int answer = -1;
        isvisited = new boolean[dungeons.length];

        dfs(k, 0, dungeons);

        answer = max;

        return answer;
    }

    private static void dfs(int k, int n, int[][] dungeons) {
        for(int i = 0 ; i < dungeons.length; i++){
            if(!isvisited[i] && dungeons[i][0] <= k){
                isvisited[i] = true;
                dfs(k - dungeons[i][1], n + 1, dungeons);
                isvisited[i] = false;
            }
        }
        max = Math.max(max,n);
    }
}
