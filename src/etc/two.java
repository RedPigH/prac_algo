package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class two {
    public static void main(String[] args) {
        int[][] needs = { { 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
        int r= 2;

        solution(needs,r);
    }

    private static int solution(int[][] needs, int r) {
        int answer = 0;

        int n = needs.length;
        int m = needs[0].length;
        int max_length = 0;

        String[] tmp = new String[n];

        for(int i = 0 ; i < n; i++){
            String str = "";
            for(int j = 0 ; j < m; j++){
                if(needs[i][j] == 1) str += j;
            }
            tmp[i] = str;
            max_length = Integer.max(max_length,str.length());
        }


        HashMap<String,Integer> map = new HashMap();
        int max = 0;
        int short_need = 0;

        if(max_length < r) answer = n;
        else {
            for (String s : tmp) {
                if(s.length() < r) short_need++;
                else if(s.length() == r){
                    if(map.containsKey(s)) map.put(s,map.get(s) +1);
                    else map.put(s,1);
                }
            }

            for(int i : map.values()){
                max = Integer.max(max,i);
            }
            answer = max + short_need;
        }
        System.out.print(answer);
        return answer;
    }
}
