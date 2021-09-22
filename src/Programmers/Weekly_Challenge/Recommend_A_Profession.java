package Programmers.Weekly_Challenge;

/*
위클리 챌린지 > 4주차_직업군 추천하기
https://programmers.co.kr/learn/courses/30/lessons/84325

제한 사항
- table의 길이 = 5, table의 원소는 "직업군 5점언어 4점언어 3점언어 2점언어 1점언어"형식의 문자열입니다. 직업군, 5점언어, 4언어, 3점언어, 2점언어, 1점언어는 하나의 공백으로 구분되어 있습니다. table은 모든 테스트케이스에서 동일합니다.
- 1 ≤ languages의 길이 ≤ 9
languages의 원소는 "JAVA", "JAVASCRIPT", "C", "C++" ,"C#" , "SQL", "PYTHON", "KOTLIN", "PHP" 중 한 개 이상으로 이루어져 있습니다. languages의 원소는 중복되지 않습니다.
- preference의 길이 = languages의 길이, 1 ≤ preference의 원소 ≤ 10
- preference의 i번째 원소는 languages의 i번째 원소의 언어 선호도입니다.
- return 할 문자열은 "SI", "CONTENTS", "HARDWARE", "PORTAL", "GAME" 중 하나입니다.
*/

import java.util.HashMap;
import java.util.Map;

public class Recommend_A_Profession {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};

        Solution(table, languages, preference);
    }

    private static String Solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Map.Entry<String, Integer> maxEntry = null;

        for (int i = 0; i < table.length; i++) {
            String[] tmp = table[i].split(" ");
            for(int j = 0; j < languages.length; j++){
                for(int k = 1; k < tmp.length; k++){
                    if(tmp[k].equals(languages[j])) {
                        if (map.containsKey(tmp[0])) {
                            map.put(tmp[0], map.get(tmp[0]) + preference[j] * (5 - (k - 1)));
                        } else map.put(tmp[0], preference[j] * (5 - (k - 1)));
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }else if(maxEntry.getValue() == entry.getValue()){
                if(entry.getKey().compareTo(maxEntry.getKey()) < 0) maxEntry = entry;
            }
        }
        answer = maxEntry.getKey();

        System.out.println(answer);

        return answer;
    }

}
