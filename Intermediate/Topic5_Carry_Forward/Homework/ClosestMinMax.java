/*
   Approach

   1. Traverse the array once to find the
      minimum and maximum values.

   2. If both values are the same,
      return 1 because any single element
      contains both the minimum and maximum.

   3. Traverse the array again from left to right.

   4. Keep track of the latest index where
      the minimum and maximum values appear.

   5. Whenever a minimum or maximum is found:
      - Calculate the length of the subarray
        ending at the current index that contains
        both values.
      - Update the minimum length if a smaller
        subarray is found.

   6. Return the smallest subarray length.

   Complexity Analysis

   Time  : O(N)
           - One traversal to find the minimum
             and maximum values.
           - One traversal to find the answer.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class ClosestMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = solve(A);
        System.out.println(result);

        sc.close();
    }

    // Returns the length of the smallest subarray
    // containing at least one minimum and one maximum element.
    public static int solve(int[] A) {
        // An empty array cannot contain both
        // a minimum and a maximum element.
        if (A.length == 0) {
            return 0;
        }

        int n = A.length;

        // Initialize the minimum and maximum values.
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        // Traverse the array to find the
        // minimum and maximum values.
        for (int i = 0; i < n; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }

            if (A[i] > maxValue) {
                maxValue = A[i];
            }
        }

        // If all elements are equal,
        // the answer is any single element.
        if (minValue == maxValue) {
            return 1;
        }

        // Stores the most recent indices where the
        // minimum and maximum values were found.
        int lastMinIndex = -1;
        int lastMaxIndex = -1;

        // Initialize the answer with the maximum
        // possible subarray length.
        int minLength = n;

        // Traverse the array to find the shortest subarray.
        for (int i = 0; i < n; i++) {

            // Update the latest occurrence of the minimum value.
            if (A[i] == minValue) {
                lastMinIndex = i;

                // If a maximum has already been seen,
                // calculate the current subarray length.
                if (lastMaxIndex != -1) {
                    int currentLength = i - lastMaxIndex + 1;

                    // Update the minimum length if needed.
                    if (currentLength < minLength) {
                        minLength = currentLength;
                    }
                }
            }

            // Update the latest occurrence of the maximum value.
            if (A[i] == maxValue) {
                lastMaxIndex = i;

                // If a minimum has already been seen,
                // calculate the current subarray length.
                if (lastMinIndex != -1) {
                    int currentLength = i - lastMinIndex + 1;

                    // Update the minimum length if needed.
                    if (currentLength < minLength) {
                        minLength = currentLength;
                    }
                }
            }
        }

        // Return the length of the smallest subarray
        // containing both the minimum and maximum values.
        return minLength;
    }
}
