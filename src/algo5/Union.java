package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Union {

    static StringBuilder sb;
    static int parent[];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];

        // 각 원소에 대한 연결 초기값을 자기 자신으로
        for (int i = 0; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int Operator = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (Operator == 0) {
                union(a, b);
            } else {
                isunion(a, b);
            }
        }
        System.out.print(sb);
    }

    private static void isunion(int a, int b) {
        if (find(a) == find(b))
            sb.append("YES\n");
        else sb.append("NO\n");

    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) parent[b] = a;
            else parent[a] = b;
        }
    }

    private static int find(int n) {
        if (n == parent[n]) return n;
        else return parent[n] = find(parent[n]);
    }
}
