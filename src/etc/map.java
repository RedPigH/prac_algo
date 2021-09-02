package etc;

public class map {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        solution(n,arr1,arr2);
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n; i++){
            String temp = "";
            String a = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i]).toString()));
            String b = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i]).toString()));

            for(int j = 0; j < n; j++){
                if(a.charAt(j) == '1' || b.charAt(j) == '1') temp += "#";
                else temp += " ";
            }
            answer[i] = temp;
        }

        return answer;
    }
}
