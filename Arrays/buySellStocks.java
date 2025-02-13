package Arrays;

public class buySellStocks {

    public static int stocks(int sellingPrice[]) {
        int n = sellingPrice.length;
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++) {
            //buyingPrice = Math.min(sellingPrice[i], buyingPrice);
            if(buyingPrice < sellingPrice[i]) {
                int currenProfit = sellingPrice[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, currenProfit);
            } else {
                buyingPrice = sellingPrice[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max. Profit: "+stocks(prices));
    }
}
