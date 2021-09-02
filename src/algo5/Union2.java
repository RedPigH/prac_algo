package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Union2 {

    static StringBuilder sb;
    static int city[];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        city = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            city[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= N; j++) {
                int isconnect = Integer.parseInt(st.nextToken());
                if (isconnect != 0) {
                    union(i, j);
                }
            }
        }

        String[] route = bf.readLine().split(" ");

        for (int i = 1; i < route.length; i++) {
            if (!isunion(Integer.parseInt(route[i - 1]), Integer.parseInt(route[i]))) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.printf("YES");

    }

    private static boolean isunion(int a, int b) {
        if (find(a) == find(b))
            return true;
        else return false;
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) city[b] = a;
            else city[a] = b;
        }
    }

    private static int find(int n) {
        if (n == city[n]) return n;
        else return city[n] = find(city[n]);
    }
}
