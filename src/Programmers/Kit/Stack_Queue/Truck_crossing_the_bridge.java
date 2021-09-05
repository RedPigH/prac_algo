package Programmers.Kit.Stack_Queue;

/*
코딩테스트 고득점 Kit > 스택/큐 > 다리를 지나는 트럭
https://programmers.co.kr/learn/courses/30/lessons/42583

제한 사항
- bridge_length는 1 이상 10,000 이하입니다.
- weight는 1 이상 10,000 이하입니다.
- truck_weights의 길이는 1 이상 10,000 이하입니다.
- 모든 트럭의 무게는 1 이상 weight 이하입니다.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Truck_crossing_the_bridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        Solution(bridge_length, weight, truck_weights);
    }

    static int Solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        try {
            if (bridge_length < 1 || bridge_length > 10000 || weight < 1 || weight > 10000) {
                throw new RestrictionsException("bridge_length / weight / truck_weights is greater than or equal to 1 and less than or equal to 10,000.");
            }
            if (truck_weights.length < 1 || truck_weights.length > 10000) {
                throw new RestrictionsException("The length of truck_weights is 1 or more and 10,000 or less.");
            }

            Queue<Truck> queue = new LinkedList<Truck>();

            for (int i = 0; i < truck_weights.length; i++) {
                if (truck_weights[i] < 1 || truck_weights[i] > weight) {
                    throw new RestrictionsException("All trucks weigh 1 or more and no more than 'weight'.");
                }
                queue.add(new Truck(truck_weights[i], bridge_length));
            }

            int[] move_lenght = new int [queue.size()];

            int spare_weight = weight - queue.peek().weight;
            int t_cnt = 0;

            while (!queue.isEmpty()) {
                for(int i = 0 ; i < t_cnt; i++){
                    if(move_lenght[i] == bridge_length){
                        spare_weight +
                    }
                }
                if(spare_weight > 0) {
                    Truck t = queue.poll();

                }
            }


        } catch (RestrictionsException e) {
            e.printStackTrace();
        }

        return answer;
    }

    static class Truck {
        int weight;
        int move;

        Truck(int weight, int move) {
            this.weight = weight;
            this.move = move;
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
