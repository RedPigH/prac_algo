package etc;

public class Coloring_book {
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        solution(m,n,picture);
    }

    static boolean[][] visited;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {-1, 1, 0, 0};
    static int area = 0;
    static int maxSizeOfOneArea = 0;

    private static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        visited = new boolean[m][n];

        int[] answer = new int[2];

        for(int i = 0 ; i < m; i ++){
            for(int j = 0; j < n; j++){
                if(picture[i][j] != 0 && !visited[i][j]){
                    int tmp = picture[i][j];
                    dfs(tmp,i,j,m,n, picture);
                    numberOfArea++;
                    maxSizeOfOneArea = Integer.max(maxSizeOfOneArea, area);
                    area = 0;
                }
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private static void dfs(int tmp, int x, int y, int m, int n, int[][] picture) {
        visited[x][y] = true;

        for(int k = 0; k < 4; k++){
            int nextX = x + moveY[k];
            int nextY = y + moveX[k];
            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n) {
                if (!visited[nextX][nextY] && picture[nextX][nextY] == tmp) {
                    dfs(tmp, nextX, nextY, m, n, picture);
                    visited[nextX][nextY] = true;
                }
            }
        }
        area++;
    }
}
