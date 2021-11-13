package Programmers.level_1;

public class Add_positive_and_negative_numbers {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        solution(absolutes,signs);
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;

        for(int i = 0 ; i < absolutes.length; i++){
            if(signs[i]) result += absolutes[i];
            else result -= absolutes[i];
        }

        return result;
    }
}
