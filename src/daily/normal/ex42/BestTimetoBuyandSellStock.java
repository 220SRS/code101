package daily.normal.ex42;

public class BestTimetoBuyandSellStock {
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }


    public static int maxProfit(int[] prices) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = prices.length-1; i >= 0; i--) {
            max = Math.max(prices[i], max);
            min = Math.min(prices[i], max);
        }


        return max;
    }

}
