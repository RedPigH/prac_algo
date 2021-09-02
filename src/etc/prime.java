package etc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class prime {
    public static void main(String[] args) {
        String numbers = "011";

        solution(numbers);
    }

    static int prime = 0;
    static HashSet<Integer> set = new HashSet<>();
    
    private static int solution(String numbers) {
        int answer = 0;
        char[] arr = numbers.toCharArray();
        int n = arr.length;
        char[] output = new char[n];
        boolean visited[] = new boolean[n];

        for (int i = 1; i <= n; i++) {
            perm(arr, output, visited, 0, n, i);
        }

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            if(isprime((Integer) iterator.next())) prime++;
        }

        answer = prime;

        System.out.print(answer);

        return answer;
    }

    static void perm(char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            String str = "";
            for(int i = 0; i < r; i++){
                str += output[i];
            }

            System.out.println(Integer.parseInt(str));

            set.add(Integer.parseInt(str));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }

    private static boolean isprime(int n) {
        if(n == 1 || n == 0) return false;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
