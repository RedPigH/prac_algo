package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BFS_1260 {

    static ArrayList<Integer>[] tree;
    static boolean[] visited;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        tree = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            tree[from].add(to);
            tree[to].add(from);
        }

/*        for(int i=1; i<tree.length; i++) {
            Collections.sort(tree[i]);
        }*/

        bf.close();

        visited = new boolean[N + 1];

        dfs(V);

        System.out.println("");

        visited = new boolean[N + 1];

        bfs(V);
    }

    public static void dfs(int startnode) {
        if(visited[startnode]) return;
        visited[startnode] = true;
        System.out.print(startnode + " ");
        for (int i = 0; i < tree[startnode].size(); i++) {
            dfs(tree[startnode].get(i));
        }
    }

    public static void bfs(int startnode) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(startnode);

        while(!queue.isEmpty()) {
            startnode = queue.poll();
            if(visited[startnode]) continue;
            visited[startnode] = true;
            System.out.print(startnode + " ");
            for (int i = 0; i < tree[startnode].size(); i++) {
                queue.add(tree[startnode].get(i));
            }
        }
    }
}


