package etc;

import java.util.Arrays;

public class budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        solusion(d,budget);
    }

    private static int solusion(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            if(budget < d[i]) break;
            budget -= d[i];
            answer++;
        }

        System.out.print(answer);

        return answer;
    }
}
