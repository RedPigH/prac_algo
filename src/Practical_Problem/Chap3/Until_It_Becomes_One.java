package Practical_Problem.Chap3;

public class Until_It_Becomes_One {
    public static void main(String[] args) {
        int N = 25;
        int K = 5;

        Solution(N,K);
    }

    private static int Solution(int n, int k) {
        int result = 0;

        while(n != 1){
            if(n % k == 0){
                n = n / k;
                result++;
            }else {
                n -= 1;
                result++;
            }
        }

        System.out.println(result);

        return result;
    }
}
