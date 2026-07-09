/*
   Approach

   1. Calculate the total sum of all elements in the array.

   2. Initialize leftSum = 0.

   3. Traverse the array:
      - Compute the right sum as:
          rightSum = totalSum - leftSum - A[i]
      - If leftSum == rightSum,
          return the current index (equilibrium index).
      - Otherwise, add A[i] to leftSum.

   4. If no equilibrium index is found,
      return -1.

   Complexity Analysis

   Time  : O(N)
           - O(N) to calculate the total sum.
           - O(N) to find the equilibrium index.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int res = solve(A);
        System.out.println(res);
        sc.close();
    }

    public static int solve(int[] A) {
        long totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum = totalSum + A[i];
        }

        long leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            long rightSum = totalSum - leftSum - A[i];
            if (leftSum == rightSum)
                return i;
            leftSum = leftSum + A[i];
        }

        return -1;
    }
}
