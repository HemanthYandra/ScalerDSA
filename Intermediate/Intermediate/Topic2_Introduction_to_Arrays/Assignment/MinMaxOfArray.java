/*
## Approach

- Initialize both the maximum and minimum values with the first element of the array.
- Traverse the array once:
  - Update the maximum value if a larger element is found.
  - Update the minimum value if a smaller element is found.
- Return the sum of the maximum and minimum values.

Complexity Analysis
   Time  : O(N)
   Space : O(1)
 */

import java.util.*;

public class MinMaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve(A));
        sc.close();
    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }

            if (A[i] < min) {
                min = A[i];
            }
        }
        return min + max;
    }
}
