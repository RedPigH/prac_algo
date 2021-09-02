package etc;

import java.util.Arrays;

public class snail {
    public static void main(String[] args) {
        int n = 4;

        solution(n);
    }

    private static int[] solution(int n) {
        int[][] snail = new int[n][n];
        int num = 1;
        int x = -1, y = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0) x++;
                else if(i % 3 == 1) y++;
                else{
                    x--;
                    y--;
                }
                snail[x][y] = num++;
            }
        }

        return Arrays.stream(snail).flatMapToInt(inner -> Arrays.stream(inner)).filter(value -> value != 0).toArray();
    }
}
