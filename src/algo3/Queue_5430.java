package algo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_5430 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {
			Deque<Integer> deque = new LinkedList<Integer>();
			String cmd = bf.readLine();
			char[] cmdlist = cmd.toCharArray();
			int n = Integer.parseInt(bf.readLine());
			String input = bf.readLine();

			input = input.substring(1, input.length() - 1);

			StringTokenizer st = new StringTokenizer(input, ",");

			if (n != 0) {
				for (int j = 0; j < n; j++) {
					deque.add(Integer.parseInt(st.nextToken()));
				}
			}

			boolean isreverse = false;
			boolean error = false;

			for (int k = 0; k < cmdlist.length; k++) {
				if (cmdlist[k] == 'R') {
					isreverse = !isreverse;
				} else if (cmdlist[k] == 'D') {
					if (deque.isEmpty()) {
						sb.append("error\n");
						error = !error;
						break;
					} else {
						if (isreverse) {
							deque.pollLast();
						} else
							deque.pollFirst();
					}
				}
			}

			if (!error) {
				int dequesize = deque.size();
				sb.append("[");

				for (int j = 0; j < dequesize; j++) {
					if (isreverse) {
						sb.append(deque.pollLast());
					} else {
						sb.append(deque.pollFirst());
					}
					if(j != dequesize -1) sb.append(",");

				}
				sb.append("]\n");
			}

		}
		System.out.println(sb);
	}
}
