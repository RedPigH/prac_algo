package algo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi2 {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        System.out.println("원판   " + "from   " + "by   " + "to");

        Hanoi(N, 'A','B','C');

        System.out.print("총 이동 회수 : " + cnt);
    }

    public static void Hanoi(int n, char from, char by, char to){

        if(n == 0){ // 종료 조건 기둥 1에서 더이상 옮길 원판이 없을 경우
            return;
        }else{
            cnt++;
            Hanoi(n-1,from,to,by);      // n-1개의 원판을 기둥 1에서 기둥 3을 이용하여 기둥 2로 옮긴다
            //System.out.println(n + "원판 이동, " + from + " -> " + to);

            System.out.println(n + "      " + from + "      " + by +  "   " +  to);
            
            Hanoi(n-1,by,from,to);      // n-1개의 원판을 기둥 2에서 기둥 1을 이용하여 기둥 3으로 옮긴다.
        }

    }
}
