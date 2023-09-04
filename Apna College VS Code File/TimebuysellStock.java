public class TimebuysellStock {
    public static int buyAndSellStocks(int price[]) {
        int buysPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;

        for(int i=0; i<price.length;i++) {
            if(buysPrice < price[i]) { // profit
                int profit = price[i] - buysPrice ;  // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buysPrice = price[i] ;
            }
        }
        return maxProfit;
    }
      public static void main(String[] args) {
        int price [] = {7,1,5,3,6,4} ;
        System.out.println("MaxiMum Profit : "+buyAndSellStocks(price));
      }
    
}
