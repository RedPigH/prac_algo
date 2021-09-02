package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DFS_BFS_2667 {

    static int[][] danji;
    static ArrayList<Integer> jipcnt;
    static boolean[][] visited;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {-1, 1, 0, 0};
    static int N, cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bf.readLine());

        danji = new int[N][N];
        visited = new boolean[N][N];
        jipcnt = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            String[] location = bf.readLine().split("");
            for (int j = 0; j < N; j++) {
                danji[i][j] = Integer.parseInt(location[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (danji[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    dfs(i, j);
                    jipcnt.add(cnt);
                }
            }
        }

        Collections.sort(jipcnt);

        System.out.println(jipcnt.size());

        for (int i = 0; i < jipcnt.size(); i++) {
            System.out.println(jipcnt.get(i));
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + moveY[i];
            int nextY = y + moveX[i];
            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
                if (!visited[nextX][nextY] && danji[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                    cnt++;
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
