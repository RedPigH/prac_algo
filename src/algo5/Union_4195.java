package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Union_4195 {
    static StringBuilder sb;
    static HashMap friends;
    static int[] link;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());



        for (int i = 0; i < T; i++) {
            friends = new HashMap<String, Integer>();
            int F = Integer.parseInt(bf.readLine());

            link = new int [F + 1];
            int idx = 0;

            for (int j = 0; j < F; j++) {
                cnt = 0;
                st = new StringTokenizer(bf.readLine());
                String f1 = st.nextToken();
                String f2 = st.nextToken();

                if (!friends.containsKey(f1)) {
                    friends.put(f1,cnt++);
                }

                if (!friends.containsKey(f2)) {
                    friends.put(f2,cnt++);
                }
            }
        }
    }
}
