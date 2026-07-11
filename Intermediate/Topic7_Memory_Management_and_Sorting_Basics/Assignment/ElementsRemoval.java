/*
   Approach

   1. To minimize the total removal cost,
      always remove the largest element first.

   2. Sort the array in descending order.
      - Since Arrays.sort() sorts in ascending
        order, multiply each element by -1,
        sort the array, and then multiply
        each element by -1 again.

   3. After sorting:
      - The first element contributes once.
      - The second element contributes twice.
      - The third element contributes three times.
      - In general, A[i] contributes (i + 1) times.

   4. Compute the total cost by adding
      (i + 1) × A[i] for every element.

   5. Return the total cost.

   Complexity Analysis

   Time  : O(N log N)
           - Sorting the array dominates.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minCost(arr);
        System.out.println(result);

        sc.close();
    }

    public static int minCost(int[] A) {
        // An empty array has no removal cost.
        if (A.length == 0) {
            return 0;
        }

        // Sort the array in descending order.
        int[] reverseSortedArray = reverseSort(A);

        // Stores the minimum removal cost.
        long totalCost = 0;

        // Each element contributes (i + 1) times
        // to the total removal cost.
        for (int i = 0; i < reverseSortedArray.length; i++) {

            // Cast to long to avoid integer overflow
            // while multiplying large values.
            totalCost += (long) reverseSortedArray[i] * (i + 1);
        }

        // Return the minimum total cost.
        return (int) totalCost;
    }

    // Sorts the original array in descending order
    // and returns the same array.
    public static int[] reverseSort(int[] A) {

        // Multiply each element by -1 so that
        // ascending sort behaves like descending sort.
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * -1;
        }

        // Sort the modified array.
        Arrays.sort(A);

        // Restore the original values.
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * -1;
        }

        // Return the array sorted in descending order.
        return A;
    }
}
