public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = -1;
        int high = 0;
        int length = prices.length;
        for(int i=0; i<length-1; i++){
            if(prices[i+1]>prices[i]){
                if(low == -1){
                    low = prices[i];
                }
            }
            if(prices[i+1]<prices[i] && low != -1){
                high = prices[i];
                max += high-low;
                low = -1;
            }
            if(i==length-2 && low != -1 && prices[i+1] > low){
                high = prices[i+1];
                max += high-low;
            }
        }
        return max;
    }
}
