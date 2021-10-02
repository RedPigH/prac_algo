package Practical_Problem.Chap3;

public class Number_Card_Game {
    public static void main(String[] args) {
        int N = 3, M = 3;
        int[][] card = {{3,1,2},{4,1,4},{2,2,2}};

        Solution(card);
    }

    private static int Solution(int[][] card) {
        int result = 0, max = 0;
        for(int i = 0 ; i < card.length; i ++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < card[i].length; j ++){
                if(card[i][j] < min) min = card[i][j];
            }
            if(min > max) max = min;
        }
        result = max;

        System.out.println(result);

        return result;
    }
}
