package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12931

public class Add_digits {
    public static void main(String[] args) {
        int n = 123;

        solution(n);
    }

    private static int solution(int n) {
        int result = 0;

        int len = Integer.toString(n).length() - 1;
        int temp = n;

        while(true){
            if(len == -1) break;
            else{
                result += temp / (int) Math.pow(10,len);
                temp = temp % (int)(Math.pow(10,len));
            }
            len--;
        }

        return result;
    }
}
