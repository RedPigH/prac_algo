package algo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_1021 {
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> deque = new LinkedList<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}
		
		input = bf.readLine();
		st = new StringTokenizer(input);
		
		for(int i = 0; i < M; i++) {
			int SearchNum = Integer.parseInt(st.nextToken());
			
			int index = deque.indexOf(SearchNum);
			
			if(index <= N /2) {
				while(SearchNum != deque.getFirst()) {
					deque.addLast(deque.pollFirst());
				}
			}else {
				while(SearchNum != deque.getLast()) {
					deque.addFirst(deque.pollLast());
					result++;
				}
			}
			
			deque.removeFirst();
		}
		
		System.out.println(result);
		
	}

}
