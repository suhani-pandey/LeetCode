public class stock {
    
    public int profit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;


        for(int i = 0; i < prices.length-1; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i+1] - buy);

        }
        return profit;
    }

    public static void main(String[] args) {
        stock s= new stock();
        int[] prices = {1, 5, 0, 2};
        System.out.println("Profit: " + s.profit(prices));
    }
}
