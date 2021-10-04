package Practical_Problem.Chap4;

public class Up_Down_Left_Right {
    public static void main(String[] args) {
        int N = 5;
        String[] dis = {"R", "R", "R", "U", "D", "D"};

        Solution(N, dis);
    }

    private static void Solution(int n, String[] dis) {
        String tmp = "LRUD";
        int[] x_dis = {0, 0, -1, 1};
        int[] y_dis = {-1, 1, 0, 0};
        int x = 0, y = 0;

        for (int i = 0; i < dis.length; i++) {
            int move = tmp.indexOf(dis[i]);
            int next_x = x + x_dis[move], next_y = y + y_dis[move];
            if (next_x < 0 || next_y < 0 || next_x >= n || next_y >= n) continue;
            else {
                x = next_x;
                y = next_y;
            }
        }

        System.out.println("x : " + (x+1) + " y : " + (y+1) );

    }
}
