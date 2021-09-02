package algo5;

import algo3.Sort_11650;

import java.io.*;
import java.util.StringTokenizer;

public class Sort_11651 {
    static location[] temp;

    static void merge(location[] array, int left, int right) {
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
                if (temp[j].Y < array[i].Y)
                    array[k++] = temp[j++];
                else if (temp[j].Y == array[i].Y) {
                    if (temp[j].X < array[i].X)
                        array[k++] = temp[j++];
                    else
                        array[k++] = array[i++];
                } else
                    array[k++] = array[i++];
            }

            while (j < p) {
                array[k++] = temp[j++];
            }

        }
    }

    static void mergetSort(location[] array, int n) {
        temp = new location[n];

        merge(array, 0, n - 1);

        temp = null;
    }

    static class location {
        public int X;
        public int Y;

        public location(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }

        public String toString() {
            return this.X + " " + this.Y;

        }
    }

    public static void main(String[] args) throws NumberFormatException,
            IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                System.out));

        int N = Integer.parseInt(bf.readLine());
       location[] array = new location[N];

        for (int i = 0; i < N; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            array[i] = new location(x, y);

        }

        mergetSort(array, N);

        for (int i = 0; i < N; i++) {
            bw.write(array[i].toString() + "\n");
        }
        bw.close();
    }
}
