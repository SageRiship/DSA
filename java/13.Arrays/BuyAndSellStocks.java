public class BuyAndSellStocks {

    public static int calProfit(int[] numbers) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (buyPrice < numbers[i]) {
                int profit = numbers[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = numbers[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] numbers = { 7, 1, 5, 3, 6, 4 };
       int profit =  calProfit(numbers);
       System.out.println(profit);
    }
}
