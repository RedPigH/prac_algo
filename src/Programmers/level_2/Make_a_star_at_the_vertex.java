package Programmers.level_2;

import java.util.ArrayList;

public class Make_a_star_at_the_vertex {
    static int max_X = Integer.MIN_VALUE;
    static int max_Y = Integer.MIN_VALUE;
    static int min_X = Integer.MAX_VALUE;
    static int min_Y = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        //int[][] line = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};

        solution(line);
    }

    private static String[] solution(int[][] line) {
        String[] answer;
        int px, py;
        long A,B,C,D,E,F,denominator, nux, nuy;
        ArrayList<point> list = new ArrayList<>();

        // 교점 구하기
        for(int i = 0; i < line.length - 1; i++){
            A = line[i][0];
            B = line[i][1];
            E = line[i][2];

            for(int j = i + 1; j < line.length; j++){
                C = line[j][0];
                D = line[j][1];
                F = line[j][2];

                denominator = (A * D) - (B * C);
                nux = (B * F) - (E * D);
                nuy = (E * C) - (A * F);

                if(denominator == 0 || nux % denominator != 0 || nuy % denominator != 0)continue;
                else{
                    px = (int) (nux / denominator);
                    py = (int) (nuy / denominator);

                    list.add(new point(px,py));

                    max_X = Math.max(max_X,px);
                    max_Y = Math.max(max_Y,py);
                    min_X = Math.min(min_X,px);
                    min_Y = Math.min(min_Y,py);
                }
            }
        }

        //교점을 찍을 사각형의 넓이,높이
        int height = max_Y - min_Y;
        int width = max_X - min_X;

        answer = new String[height + 1];

        StringBuilder sb;

        for(int i = 0; i <= height; i++){
            sb = new StringBuilder();
            for(int j = 0; j <= width; j++){
                sb.append(".");
            }
            answer[i] = sb.toString();
        }

        for(int i = 0; i < list.size(); i++){
            String str = answer[max_Y - list.get(i).y];
            StringBuilder builder = new StringBuilder(str);
            builder.setCharAt(list.get(i).x - min_X,'*');
            answer[max_Y - list.get(i).y] = builder.toString();
        }

        return answer;
    }
    static class point{
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
