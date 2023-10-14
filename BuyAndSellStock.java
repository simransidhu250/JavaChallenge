public class BuyAndSellStock {
    public static void  main(String []args){
        int prices[] = {1,7,2,5,3,6,4};
        int profit = profit(prices);
        System.out.println(profit); // Printing profit


    }

    public static int profit(int prices[]){
        int costPrice = Integer.MAX_VALUE;
        int profit = 0, maxProfit = 0;  //Time Complexity: O(n)
        for(int i =0 ; i<prices.length; i++){                           
            if(costPrice<prices[i]){                        
                profit = prices[i] - costPrice;             // Profit is Selling price  - Cost price
                maxProfit = Integer.max(profit, maxProfit);     // to find how much profit can current price give when given min of all previous elements
            }
            else{
                costPrice = prices[i];      // if the current element is greater than costPrice it means it will not give profit rather it can be used as costPrice to get profit for further elements
            }
        }
        return maxProfit;   //returns maximum profit that be achived
    }
    
}
