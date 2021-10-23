package Practical_Problem.Chap6;

import java.util.Arrays;
import java.util.Collections;

public class Top_to_bottom {
    public static void main(String[] args) {
        int N = 3;
        Integer[] list = {15,27,12};

        Arrays.sort(list, Collections.reverseOrder());

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
