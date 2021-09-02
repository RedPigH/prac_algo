package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class brute_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 1; i < N; i++) {
            int decom = Decom(i);
            if(i + decom == N){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.print("0");
    }

    private static int Decom(int i) {
        int tmp = 0;

        while(i > 0){
            tmp += i % 10;
            i /= 10;
        }
        return tmp;
    }
}