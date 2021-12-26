package Programmers.level_2;

//https://programmers.co.kr/learn/courses/30/lessons/42888?language=java

import java.util.ArrayList;
import java.util.HashMap;

public class Open_Chat_Room {
    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        solution(record);

    }

    private static String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Order> orders = new ArrayList<Order>();
        HashMap hmap = new HashMap();
        String[] temp;

        for(String str : record){
            temp = str.split(" ");

            if(!temp[0].equals("Leave")) {
                hmap.put(temp[1],temp[2]);
            }
            orders.add(new Order(temp[0],temp[1]));
        }

        for(int i = 0; i < orders.size(); i++){
            String Operation = orders.get(i).movement;

            if(Operation.equals("Enter")){
                list.add(hmap.get(orders.get(i).ID) + "님이 들어왔습니다.");
            }else if(Operation.equals("Leave")){
                list.add(hmap.get(orders.get(i).ID) + "님이 나갔습니다.");
            }
        }

        return list.toArray(new String[list.size()]);
    }

    static class Order {
        String movement;
        String ID;

        Order(String movement, String ID){
            this.movement = movement;
            this.ID = ID;
        }
    }
}
