package algo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_1874 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(bf.readLine());
		int[] Sequence = new int[N];

		for (int i = 0; i < N; i++) {
			Sequence[i] = Integer.parseInt(bf.readLine());
		}

		int index = 0;

		for (int i = 1; i <= N; i++) {
			stack.push(i);
			sb.append("+\n");

			while (true) {
				if (!stack.isEmpty() && stack.peek() == Sequence[index]) {
					stack.pop();
					sb.append("-\n");
					index++;
				} else
					break;
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("NO");
			return;
		}

		System.out.println(sb);

	}

}