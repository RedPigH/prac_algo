package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Hanoi {

    static int cnt;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        hanoi(1,2,3,N);

        System.out.println(cnt);
        System.out.print(sb);
    }

    private static void hanoi(int from, int by, int to, int n) {
        if (n == 0) {
            return;
        } else {
            cnt++;
            hanoi(from, to, by, n - 1);
            sb.append(from + " " + to + "\n");
            hanoi(by, from, to, n - 1);
        }

    }
}
