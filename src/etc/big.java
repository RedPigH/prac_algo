package etc;

import java.util.ArrayList;
import java.util.Arrays;

public class big {
    public static void main(String[] args) {
        String number = "1231234";
        int K = 3;

        solution(number,K);
    }

    private static String solution(String number, int k) {
        int max = 0;
        char[] list = number.toCharArray();
        Arrays.sort(list);

        for(int i = 0; i < number.length() - k; i++) {
            String tmp = number;
            for (int j = i; j < k + i; j++) {
                tmp = tmp.replaceFirst(String.valueOf(list[j]), "");
            }
            if(Integer.parseInt(tmp) > max) max = Integer.parseInt(tmp);
        }

        System.out.print(max);

        return Integer.toString(max);
    }
}
