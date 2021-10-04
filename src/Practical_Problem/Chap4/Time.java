package Practical_Problem.Chap4;

public class Time {
    public static void main(String[] args) {
        int N = 5;

        Solution(N);

    }

    private static int Solution(int n) {
        int result = 0;
        String time = "";

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    time = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    if (time.contains("3")) result++;
                }
            }
        }

        System.out.println(result);

        return result;
    }
}
