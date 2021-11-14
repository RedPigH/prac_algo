package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12916

public class Number_of_p_and_y_in_string {
    public static void main(String[] args) {
        String s = "Pyy";

        solution(s);
    }

    private static boolean solution(String s) {
        boolean result = true;
        int p_num = 0, y_num = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') p_num++;
            else if (s.charAt(i) == 'y') y_num++;
        }

        if (p_num != y_num) result = false;

        return result;
    }
}
