package etc;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        solusion(answers);
    }

    private static int[] solusion(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        int a = 0, b = 0, c = 0;

        int one[] = {1, 2, 3, 4, 5};
        int two[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int three[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) a++;
            if (answers[i] == two[i % two.length]) b++;
            if (answers[i] == three[i % three.length]) c++;
        }

        int max = Math.max(a, Math.max(b, c));

        if (max == a) list.add(1);
        if (max == b) list.add(2);
        if (max == c) list.add(3);

        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
