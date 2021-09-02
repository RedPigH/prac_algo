package etc;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.print(solusion(numbers,hand));
    }

    private static String solusion(int[] numbers, String hand) {
        String answer = "";
        ArrayList<int[]> list = new ArrayList();
        int L = 10;
        int R = 12;

        for(int i = 1 ; i <= 12; i++){
            list.add(new int[] {(i -1) / 3, (i -1) % 3});
        }

        for(int i = 0; i < numbers.length; i++){
            int num = 0;

            if(numbers[i] == 0) num = 11;
            else num = numbers[i];

            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                L = num;
            }else if(num == 3 || num == 6 || num == 9){
                answer += "R";
                R = num;
            }else{
                int LD = Math.abs(list.get(num-1)[0]-list.get(L-1)[0]) + Math.abs(list.get(num-1)[1]-list.get(L-1)[1]);
                int RD = Math.abs(list.get(num-1)[0]-list.get(R-1)[0]) + Math.abs(list.get(num-1)[1]-list.get(R-1)[1]);

                if(LD == RD){
                    if(hand.equals("left")){
                        answer += "L";
                        L = num;
                    }else{
                        answer += "R";
                        R = num;
                    }
                }else if(LD > RD){
                    answer += "R";
                    R = num;
                }else{
                    answer += "L";
                    L = num;
                }
            }
        }

        return answer;
    }
}
