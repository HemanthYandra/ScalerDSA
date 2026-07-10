/*
   Approach

   1. If the array is empty, no transaction can be made,
      so return 0.

   2. Assume the first day's price is the minimum price.

   3. Traverse the array from left to right.

   4. For each price:
      - Update the minimum price seen so far.
      - Calculate the profit by selling on the current day.
      - Update the maximum profit if the current profit
        is greater.

   5. Return the maximum profit.

   Complexity Analysis

   Time  : O(N)
           - Single traversal of the array.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = maxProfit(A);
        System.out.println(result);

        sc.close();
    }

    // Returns the maximum profit that can be earned
    // by making at most one buy and one sell transaction.
    public static int maxProfit(final int[] A) {
        // An empty array has no stock prices.
        if (A.length == 0) {
            return 0;
        }

        // Stores the minimum stock price seen so far.
        int minPrice = A[0];

        // Stores the maximum profit found so far.
        int maxProfit = 0;

        // Traverse the array from the second day onwards.
        for (int i = 1; i < A.length; i++) {
            // Update the minimum stock price seen so far.
            if (A[i] < minPrice) {
                minPrice = A[i];
            }

            // Calculate the profit if the stock is sold today.
            int profit = A[i] - minPrice;

            // Update the maximum profit if a better profit is found.
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit.
        return maxProfit;
    }
}
