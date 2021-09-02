package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class back_2580 {

    static int[][] Sudoku;
    static ArrayList<Node> nulllist;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        Sudoku = new int[9][9];
        nulllist = new ArrayList<Node>();

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) nulllist.add(new Node(i, j));
                Sudoku[i][j] = num;
            }
        }
        dfs(0);
    }

    private static void dfs(int n) {
        if (n == nulllist.size()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(Sudoku[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            System.exit(0);
        }

        for (int i = 1; i <= 9; i++) {
            int x = nulllist.get(n).x;
            int y = nulllist.get(n).y;

            if (linecheak(x, y, i) && squarecheak(x, y, i)) {
                Sudoku[x][y] = i;
                dfs(n+1);
                Sudoku[x][y] = 0;
            }
        }

    }

    private static boolean linecheak(int x, int y, int num) {
        for (int i = 0; i < 9; i++) {
            if (Sudoku[x][i] == num || Sudoku[i][y] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean squarecheak(int x, int y, int num) {
        int squareX = (x / 3) * 3;
        int squareY = (y / 3) * 3;

        for (int i = squareX; i < squareX + 3; i++) {
            for (int j = squareY; j < squareY + 3; j++) {
                if (Sudoku[i][j] == num) return false;
            }
        }
        return true;
    }

    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
