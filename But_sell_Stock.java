package ARRAYSDSA;

public class But_sell_Stock {
    public static void main(String[] args) {
        int[] price = {100,180,260,310,40,535,695};
        int n = price.length;
        System.out.println(maxProfit(price, 0, n - 1));
    }
    
    static int maxProfit(int[] price , int start , int end)
    {

        //if the stock can't be baought
        if(end <= start)
        return 0;

        //initialise the profit
        int profit = 0;

        //the day at which the stock
        //must be bought
        for(int i = start ; i < end ; i ++)
        {
           // the day at which the
           // stock must be sold
           for(int j = i + 1 ; j <= end ; j++)
           {
              //if the buying the stock at ith day and
              //selling it at jth day is profitable
              if(price[j]  >  price[i])
              {
                //update the current profit
                int curr_profit = price[j] - price[i] 
                    + maxProfit(price, start, i - 1) +
                    maxProfit(price, j + 1 , end);

                //update the maximum profit so far
                profit = Math.max(profit , curr_profit);
              }
           }
        }
        return profit;
    }
}
