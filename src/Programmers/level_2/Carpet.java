package Programmers.level_2;

public class Carpet {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        solution(brown,yellow);
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i = 1; i < sum; i++){
            int x = i;
            int y = sum / i;

            if(x >= y && (x - 2) * (y -2) == yellow){
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }

        return answer;
    }
}
