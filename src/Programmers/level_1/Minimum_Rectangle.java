package Programmers.level_1;

public class Minimum_Rectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        solution(sizes);
    }

    private static int solution(int[][] sizes) {
        int result;
        int xmax = 0, ymax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int x = sizes[i][0];
            int y = sizes[i][1];
            if (x < y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (x > xmax) xmax = x;
            if (y > ymax) ymax = y;
        }

        result = xmax * ymax;

        return result;
    }
}
