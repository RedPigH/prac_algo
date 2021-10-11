package Practical_Problem.Chap5;

public class Freeze_Drinks {
    public static void main(String[] args) {
        int N = 4, M = 5;
        int[][] ice = {{0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};

        Solution(ice, N, M);
    }

    private static int Solution(int[][] ice, int n, int m) {
        int result = 0;
        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ice[i][j] == 0 && visited[i][j] == 0) {
                    dfs(i, j, ice, visited);
                    result++;
                }
            }
        }
        return result;
    }

    private static void dfs(int x, int y, int[][] ice, int[][] visited) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int nx, ny;

        if (x >= 0 && y >= 0 && x < visited.length && y < visited[0].length) {
            if (ice[x][y] == 0 && visited[x][y] == 0) {
                visited[x][y] = 1;
                for (int k = 0; k < 4; k++) {
                    nx = x + dx[k];
                    ny = y + dy[k];
                    dfs(nx, ny, ice, visited);
                }
            }
        }
    }
}
