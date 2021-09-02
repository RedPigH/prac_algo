package algo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_4949 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String input = bf.readLine();

			if (input.equals(".")) break;

			sb.append(cheack(input));
		}

		System.out.println(sb);
	}

	private static String cheack(String input) {

		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);

			if(c == '(' || c == '['){
				stack.push(c);
			}
			else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '('){
					return "no\n";
				}else stack.pop();
			}
			else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '['){
					return "no\n";
				}else stack.pop();
			}
		}

		if(!stack.isEmpty()) return "no\n";

		return "yes\n";
	}

}
