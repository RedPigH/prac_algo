package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_BFS_2606 {

    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        tree = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            tree[from].add(to);
            tree[to].add(from);
        }

        dfs(1);

        System.out.print(cnt - 1);
    }

    private static void dfs(int startnode) {
        if(visited[startnode]) return;
        visited[startnode] = true;
        cnt++;
        for (int i = 0; i < tree[startnode].size(); i++) {
            dfs(tree[startnode].get(i));
        }
    }
}
