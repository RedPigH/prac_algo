package Practical_Problem.Chap4;

public class Royal_Night {
    public static void main(String[] args) {
        String night = "e4";

        Solution(night);
    }

    private static int Solution(String night) {
        int result = 0;
        String row = "abcdefgh";
        int move[][] = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {1, 2}, {-1, 2}};   //night가 움직일 수 있는 경우의 수

        int x = row.indexOf(night.charAt(0));
        int y = Integer.valueOf(night.charAt(1) - '0') - 1;
        int next_x = 0, next_y = 0;

        for (int i = 0; i < move.length; i++) {
            next_x = x + move[i][0];
            next_y = y + move[i][1];
            if (next_x < 0 || next_y < 0 || next_x > 7 || next_y > 7) continue;
            else result++;
        }

        System.out.println(result);

        return result;
    }
}
