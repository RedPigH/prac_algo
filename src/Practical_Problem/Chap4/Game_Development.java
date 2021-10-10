package Practical_Problem.Chap4;

public class Game_Development {
    public static void main(String[] args) {
        int N = 4, M = 4;
        int[] Charactor = {1,1,0};
        int[][] map = {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        Solution(Charactor,map,N,M);

    }

    private static int Solution(int[] charactor, int[][] map, int n, int m) {
        int[] dx = {0,1,0,-1};
        int[] dy = {-1,0,1,0};
        int[][] visited = new int[n][m];
        int x = charactor[0], y = charactor[1], result = 1, turn_cnt = 0;
        int dis = charactor[2];
        int nx, ny;

        while(true){
            dis = Turn_Left(dis);
            nx = x + dx[dis];
            ny = y + dy[dis];
            if(turn_cnt != 4) {
                if (map[nx][ny] == 0 && visited[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    visited[x][y] = 1;
                    turn_cnt = 0;
                    result++;
                    continue;
                } else {
                    turn_cnt += 1;
                }
            }else{
                nx = x - dx[dis];
                ny = y - dy[dis];
                if(map[nx][ny] == 0){
                    x = nx;
                    y = ny;
                }else break;
            }
        }
        return result;
    }

    private static int Turn_Left(int dis) {
        dis -= 1;
        if(dis == -1) return 3;
        else return dis;
    }
}
