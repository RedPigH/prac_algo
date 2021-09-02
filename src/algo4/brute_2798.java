package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class brute_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> card = new ArrayList();
        int result = 0;

        st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            card.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (i != j && j != k && i != k) {
                        int sum = card.get(i) + card.get(j) + card.get(k);
                        if (result < sum && sum <= M) result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }

}