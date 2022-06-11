package interview.java.exercises;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 */

// TODO: Revisit and try to recode this problem from scracth
public class LC121BestTimeToBuyStock {
    public int maxProfit(int[] prices){
        int profit = 0; // Profit = sell price - buy price
        int todaysProfit = 0;
        int smallestCostFound = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
           if (prices[i] < smallestCostFound) {
               smallestCostFound = prices[i];
           }
           todaysProfit = prices[i] - smallestCostFound;
           if (profit < todaysProfit)
               profit = todaysProfit;
        }




        return profit;
    }
}
