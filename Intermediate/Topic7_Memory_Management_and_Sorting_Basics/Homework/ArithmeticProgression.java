/*
   Approach

   1. If the array contains one or two elements,
      it can always be rearranged into an
      arithmetic progression.

   2. Sort the array in ascending order.

   3. Calculate the common difference using
      the first two elements.

   4. Traverse the remaining elements.
      - If the difference between any two
        consecutive elements is not equal to
        the common difference, return 0.

   5. If all consecutive differences are equal,
      return 1.

   Complexity Analysis

   Time  : O(N log N)
           - Sorting dominates the running time.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class ArithmeticProgression {
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

    public static int solve(int[] A) {

        // An array with one or two elements
        // always forms an arithmetic progression.
        if (A.length <= 2) {
            return 1;
        }
        
        // Step 1: Sort the array.
        Arrays.sort(A);

        // Stores the common difference.
        int commonDifference = A[1] - A[0];

        // Step 2: Check the difference between
        // every pair of consecutive elements.
        for (int i = 2; i < A.length; i++) {

            // If any difference is different,
            // an arithmetic progression is impossible.
            if (A[i] - A[i - 1] != commonDifference) {
                return 0;
            }
        }

        // All consecutive differences are equal.
        return 1;
    }
}
