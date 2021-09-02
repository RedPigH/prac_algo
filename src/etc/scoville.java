package etc;

import java.util.PriorityQueue;
import java.util.Queue;

public class scoville {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        
        solution(scoville,K);
    }

    private static int solution(int[] scoville, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        int answer = 0;
        int tmp;

        for(int i : scoville){
            q.add(i);
        }

        while(q.peek() < k){
            tmp = q.poll() + (q.poll() * 2);
            System.out.println(tmp);
            q.add(tmp);
            answer++;
        }

        System.out.println(answer);

        return answer;
    }
}
