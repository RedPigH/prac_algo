package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Failure_rate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        solution(N, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N];
        int[] challenge = new int[N];

        for (int i = 0; i < stages.length; i++) {
            int n = stages[i] - 1;
            if (n != N) challenge[n]++;
            else n -= 1;
            for (int j = 0; j <= n; j++) {
                clear[j]++;
            }
        }

        ArrayList<stage> list = new ArrayList();

        for (int i = 0; i < N; i++) {
            double rate = challenge[i] / (double) clear[i];
            list.add(new stage(i, rate));
        }

        Collections.sort(list, new StageComparator());

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getnum() + 1;
        }
        return answer;
    }

    static class stage {
        int num;
        double rate;

        public stage(int num, double rate) {
            this.num = num;
            this.rate = rate;
        }

        public int getnum() {
            return this.num;
        }

        public double getRate() {
            return this.rate;
        }

    }

    static class StageComparator implements Comparator<stage> {
        @Override
        public int compare(stage o1, stage o2) {
            if(o1.rate < o2.rate) return 1;
            if(o1.rate > o2.rate) return -1;
            return 0;
        }
    }
}


