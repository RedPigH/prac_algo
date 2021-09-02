package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS_BFS_2178 {

    static int[][] miro;
    static int[][] dis;
    static boolean[][] visited;
    static int[] moveX = {0,0,-1,1};
    static int[] moveY = {-1,1,0,0};
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new int[N+1][M+1];
        dis = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i = 1 ; i <= N; i++){
            String[] location = bf.readLine().split("");
            for(int j = 1; j <= M; j++){
                miro[i][j] = Integer.parseInt(location[j-1]);
            }
        }

        bfs(1,1);
    }

    private static void bfs(int startX, int startY) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(new Node(startX,startY));
        dis[startX][startY] = 1;
        visited[startX][startY] = true;

        while(!queue.isEmpty()) {
            Node node = queue.poll();

            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nextX = x + moveY[i];
                int nextY = y + moveX[i];
                if(nextX > 0 && nextX < N + 1 && nextY > 0 && nextY < M + 1) {
                    if (!visited[nextX][nextY] && miro[nextX][nextY] != 0) {
                        queue.add(new Node(nextX, nextY));
                        dis[nextX][nextY] = dis[x][y] + 1;
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }

        System.out.print(dis[N][M]);
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
