package leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

public class BuySellStock {

    public static int maxProfit(int[] prices)
    {
        int min = prices[0];
        int minPos = 0;
        for(int i = 1; i<prices.length; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
                minPos = i;
            }
        }
        if(minPos == prices.length-1)
        {
            return 0;
        }
        if(minPos == prices.length-2)
        {
            return (prices[prices.length-1] - prices[prices.length-2]);
        }
        int max = prices[minPos+1];
        for(int i = minPos+1; i<prices.length; i++)
        {
            if(max<prices[i])
            {
                max = prices[i];
            }
        }
        return max-min;
    }

    public static void main(String[] args)
    {
        int [] prices = {7, 6, 4, 3, 1};
        int answer = maxProfit(prices);
        System.out.println(answer);
    }
}
