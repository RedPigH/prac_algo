package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_10989 {

    static int[] temp;
    static int[] Sequence;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(bf.readLine());

        Sequence = new int[N];

        for(int i = 0 ; i < N ; i++){
            Sequence[i] = Integer.parseInt(bf.readLine());
        }

        mergetSort(Sequence, N - 1);

        for(int i = 0; i < Sequence.length; i++){
            sb.append(Sequence[i] + "\n");
        }

        System.out.print(sb);

    }

    static void merge(int[] array, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0, j = 0;
            int k = left;

            merge(array, left, center);
            merge(array, center + 1, right);

            for (i = left; i <= center; i++) {
                temp[p++] = array[i];
            }

            while (i <= right && j < p) {
                if (temp[j] <= array[i])
                    array[k++] = temp[j++];
                else
                    array[k++] = array[i++];
            }

            while (j < p) {
                array[k++] = temp[j++];
            }
        }
    }

    static void mergetSort(int[] array, int n) {
        temp = new int[n];

        merge(array, 0, n - 1);

        temp = null;
    }
}
