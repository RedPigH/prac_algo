package Programmers.Kit.Stack_Queue;

/*
코딩테스트 고득점 Kit > 스택/큐 > 프린터
https://programmers.co.kr/learn/courses/30/lessons/42587

제한 사항
- 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
- 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
- location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {

        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        Solution(priorities, location);

    }

    private static int Solution(int[] priorities, int location) {
        int result = 0;
        int cnt = 1;

        try {
            if (priorities.length > 100 || priorities.length < 0) { // 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
                throw new RestrictionsException("There must be at least 1 and no more than 100 documents in the waiting list.");
            }
        } catch (RestrictionsException e) {
            e.printStackTrace();
        }

        Queue<Node> queue = new LinkedList();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Node(i, priorities[i]));
        }

        while (true) {
            Node n = (Node) queue.poll();
            int highprior = (int) queue.stream().filter(Node -> Node.prior > n.prior).count();
            if (highprior == 0) {
                if (n.loc == location) {
                    result = cnt;
                    break;
                }
                cnt++;
            } else {
                queue.add(n);
            }
        }
        return result;
    }

    static class Node {
        int loc;
        int prior;

        Node(int loc, int prior) {
            this.loc = loc;
            this.prior = prior;
        }
    }

    static class RestrictionsException extends Exception {
        RestrictionsException() {
            super();
        }

        RestrictionsException(String msg) {
            super(msg);
        }
    }
}
