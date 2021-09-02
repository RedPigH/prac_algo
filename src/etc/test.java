package etc;

import java.util.*;

public class test {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.print(solution(participant,completion));

    }

    private static String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(participant));

        for(int i = 0; i < completion.length; i++){
            if(list.contains(completion[i])){
                list.remove(completion[i]);
            }
        }

        answer = list.get(0);

        return answer;

    }



    /*private static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0 ; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }

        if(answer == "") answer =  participant[participant.length-1];

        return answer;

    }*/
}
