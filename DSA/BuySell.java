package DSA;
import java.util.*;
public class BuySell {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            
            int[] prices = new int[n];
            
            System.out.println("Enter prices:");
            for(int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }
            
            System.out.println("Maximum Profit: " + maxProfit(prices));
        }
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}