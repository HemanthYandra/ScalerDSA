/*
   Approach

   1. Every element contributes to multiple subarrays.

   2. For an element at index i:
      - It can be chosen as the ending element in (i + 1) ways.
      - It can be chosen as the starting element in (N - i) ways.

   3. Therefore, the total number of subarrays
      containing A[i] is:
      (i + 1) * (N - i)

   4. Contribution of A[i]:
      A[i] * (i + 1) * (N - i)

   5. Add the contribution of every element.

   6. Return the final sum.

   Complexity Analysis

   Time  : O(N)
           - Single traversal of the array.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class SumOfAllSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        long result = solve(A);
        System.out.println(result);

        sc.close();
    }

    public static long solve(int[] A) {
        int n = A.length;
        long sum = 0;
        for(int i = 0; i < n; i++) {
            long contribution = (long)(A[i]) * ((i + 1) * (n - i));
            sum += contribution;
        }

        return sum;
    }
}
