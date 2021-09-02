package algo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_17298 {

    static int[] Sequence;
    static int[] ngelist;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        stack = new Stack<Integer>();

        int N = Integer.parseInt(bf.readLine());
        Sequence = new int[N];
        ngelist = new int[N];

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            Sequence[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i >= 0; i--) {
            nge(i);
        }

        for(int i : ngelist){
            sb.append(i + " ");
        }

        System.out.print(sb);

    }

    private static void nge(int i) {

        while(!stack.isEmpty()){
            if(stack.peek() <= Sequence[i]){
                stack.pop();
            } else break;
        }

        if(stack.isEmpty()){
            ngelist[i] = -1;
            stack.push(Sequence[i]);
            return;
        }
        ngelist[i] = stack.peek();
        stack.push(Sequence[i]);
    }
}

