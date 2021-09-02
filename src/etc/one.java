package etc;

import java.util.HashMap;

public class one {
    public static void main(String[] args) {
        int[] gift_cards = {4,5,3,2,1};
        int[] wants = {2,4,4,5,1};
        
        solution(gift_cards,wants);
    }

    private static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap();

        for(int i = 0; i < gift_cards.length; i++){
            if(map.containsKey(gift_cards[i])) map.put(gift_cards[i],map.get(gift_cards[i]) + 1);
            else map.put(gift_cards[i], 1);
        }

        for(int i : wants){
            if(map.containsKey(i)) map.put(i,map.get(i) - 1);
            else answer++;
        }

        for(int v : map.values()){
            if(v < 0) answer++;
        }
        return answer;
    }
}
