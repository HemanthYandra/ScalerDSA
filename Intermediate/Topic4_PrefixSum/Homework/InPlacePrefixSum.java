/*
   Approach

   1. Traverse the array from index 1 to N - 1.

   2. For each element:
      - Add the previous prefix sum to the current element.
      - Update the current element in the same array.
      - A[i] = A[i - 1] + A[i]

   3. After the traversal, the original array itself
      becomes the Prefix Sum array.

   4. Return the modified array.

   Complexity Analysis

   Time  : O(N)
           - Single traversal of the array.

   Space : O(1)
           - Prefix sum is computed in-place without using
             any extra array.
*/

import java.util.*;

public class InPlacePrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] res = solve(A);
        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static int[] solve(int[] A) {
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }
}
