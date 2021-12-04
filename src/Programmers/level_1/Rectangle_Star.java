package Programmers.level_1;

//https://programmers.co.kr/learn/courses/30/lessons/12969

public class Rectangle_Star {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
