package Practical_Problem.Chap5;

public class Maze_Escape {
    public static void main(String[] args) {
        int N = 5, M = 6;
        int[][] maze = {{1,0,1,0,1,0},{1,1,1,1,1,1},{0,0,0,0,0,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
        
        Solution(maze,N,M);
    }

    private static int Solution(int[][] maze, int n, int m) {
        int result = 0;
        int[][] visited = new int[n][m];

        bfs(maze, visited, 0,0);

        return result;
    }

    private static void bfs(int[][] maze, int[][] visited, int x, int y) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};



    }

}
