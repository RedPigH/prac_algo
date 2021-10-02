package Practical_Problem.Chap3;

import java.util.Arrays;

public class Law_of_large_numbers {
    public static void main(String[] args) {
        int M = 8, K = 3;
        int[] num = {2, 4, 5, 4, 6};

        Solusion(num, M, K);
    }

    private static int Solusion(int[] num, int m, int k) {
        int result = 0;

        Arrays.sort(num);

        int first = num[num.length - 1];
        int second = num[num.length - 2];
        int cnt = m / (k + 1) * k;
        cnt += m % (k + 1);

        result = first * cnt + second * (m - cnt);

        return result;
    }
}
