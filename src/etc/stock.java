package etc;

public class stock {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        solotion(prices);
    }

    private static int[] solotion(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length - 1; i++){
            int sec = 0;
            for(int j = i + 1; j < prices.length; j++){
                sec++;
                if(prices[i] > prices[j]) break;
            }
            answer[i] = sec;
        }
        return answer;
    }
}
