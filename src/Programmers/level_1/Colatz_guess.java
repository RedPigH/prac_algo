package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12943

public class Colatz_guess {
    public static void main(String[] args) {
        int n = 626331;

        solution(n);
    }

    private static int solution(int n) {
        int result = -1;
        int cnt = 0;
        long num = n;

        while(cnt < 500){
            if(num == 1){
                return cnt;
            }else{
                if(num % 2 == 0) num = num / 2;
                else num = num * 3 + 1;
                cnt++;
            }
        }

        return result;
    }
}
