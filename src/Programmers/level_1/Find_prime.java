package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12921

public class Find_prime {
    public static void main(String[] args) {
        int n = 10;

        solution(n);
    }

    //에라토스테네스의 체 사용
    public static int solution(int n) {
        int result = 0;
        int[] temp = new int[n+1];

        for(int i = 1 ; i <= n; i++) {
            if(i == 1) temp[i] = 0;
            temp[i] = i;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(temp[i] == 0) continue;

            for(int j = i * 2; j <= n; j += i){
                temp[j] = 0;
            }
        }

        for(int i = 2; i <= n; i++){
            if(temp[i] != 0) result++;
        }

        return result;
    }
}
