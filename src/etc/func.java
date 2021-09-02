package etc;

import java.util.ArrayList;

public class func {
    public static void main(String[] args) {
        int[] progresses = {99, 1, 99, 1};
        int[] speeds = {1, 1, 1, 1};

        solution(progresses,speeds);
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;

        for(int i = 0; i < progresses.length; i++){
            list.add((100-progresses[i])%speeds[i] == 0? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1);
        }

        for(int i = 1 ; i < list.size(); i++){
            if(list.get(i - cnt) >= list.get(i)) cnt++;
            else{
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}