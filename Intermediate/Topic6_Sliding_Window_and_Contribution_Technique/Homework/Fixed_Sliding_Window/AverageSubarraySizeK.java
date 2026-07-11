/*
   Approach

   1. Build the first window of size K
      and calculate its sum.

   2. Compute the average of the first window
      and store it.

   3. Slide the window one element at a time:
      - Remove the leftmost element.
      - Add the next element.
      - Compute the new average.
      - Store the average.

   4. Return the array of averages.

   Complexity Analysis

   Time  : O(N)
           - One traversal of the array.

   Space : O(N - K + 1)
           - Stores the average of each window.
*/

import java.util.*;

public class AverageSubarraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the window size (K): ");
        int K = sc.nextInt();
        double[] result = slidingWindow(A, K);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static double[] slidingWindow(int[] A, int K) {
        // An empty array or an invalid window size
        // has no valid subarrays.
        if (A.length == 0 || K <= 0 || K > A.length) {
            return new double[0];
        }

        int n = A.length;

        // Number of possible subarrays of size K.
        int totalWindows = n - K + 1;
        double[] result = new double[totalWindows];

        double sum = 0.0;

        // Step 1: Build the first window.
        int i = 0;
        while (i < K) {
            sum += A[i];
            i++;
        }

        // Step 2: Store the average of the first window.
        result[0] = sum / K;

        // Step3: Slide the window.
        int s = 1;
        int e = K;
        while (e < n) {
            sum = sum - A[s - 1] + A[e];

            // Update result
            result[s] = sum / K;

            s++;
            e++;
        }

        // Return all window averages.
        return result;
    }
}
