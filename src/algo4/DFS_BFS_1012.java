package algo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DFS_BFS_1012 {

    static int[][] bechu;
    static boolean[][] visited;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {-1, 1, 0, 0};
    static int T, N, M, K;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i < T; i++) {

            st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            int cnt = 0;

            bechu = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(bf.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                bechu[x][y] = 1;
            }

            for (int k = 0; k < N; k++) {
                for (int j = 0; j < M; j++) {
                    if (bechu[k][j] == 1 && !visited[k][j]) {
                        dfs(k, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt + "\n");
        }

        System.out.print(sb);

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + moveY[i];
            int nextY = y + moveX[i];
            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                if (!visited[nextX][nextY] && bechu[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
