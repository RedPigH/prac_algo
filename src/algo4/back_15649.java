package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back_15649 {

    static int[] Sequence;
    static boolean[] visited;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Sequence = new int[N + 1];
        visited = new boolean[N + 1];

        dfs(0);

        System.out.print(sb);
    }

    private static void dfs(int SqIndex) {
        if (SqIndex == M) {
            for (int i = 0; i < M; i++) {
                sb.append(Sequence[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                Sequence[SqIndex] = i;
                visited[i] = true;
                dfs(SqIndex + 1);
                visited[i] = !visited[i];
            }
        }
    }
}
