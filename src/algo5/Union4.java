package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Union4 {

    static int cycle[];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        cycle = new int[N];

        for (int i = 0; i < N; i++) {
            cycle[i] = i;
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (find(a) != find(b)) {
                union(a, b);
            } else {
                System.out.print(i);
                System.exit(0);
            }
        }
        System.out.print("0");
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) cycle[b] = a;
            else cycle[a] = b;
        }
    }

    private static int find(int n) {
        if (n == cycle[n]) return n;
        else return cycle[n] = find(cycle[n]);
    }
}
