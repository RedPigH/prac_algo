package algo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sort_2751 {

	static int[] temp;

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

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));

		int N = Integer.parseInt(bf.readLine());
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(bf.readLine());
		}

		mergetSort(array, N);

		for (int i = 0; i < N; i++) {
			bw.write(array[i] + "\n");
		}
		bw.close();
	}
}
