/*
## Approach

- Initialize two variables:
  - `largest`
  - `secondLargest`
- Traverse the array once:
  - If the current element is greater than `largest`:
    - Update `secondLargest` to `largest`.
    - Update `largest` to the current element.
  - Else if the current element is less than `largest` but greater than `secondLargest`:
    - Update `secondLargest`.
- After traversal:
  - If `secondLargest` was never updated, return `-1`.
  - Otherwise, return `secondLargest`.

Complexity Analysis
   Time  : O(N)
   Space : O(1)
*/

import java.util.*;

public class SecondLargest {
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
        int secondMax = Integer.MIN_VALUE;

        if (A.length == 0) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                secondMax = max;
                max = A[i];
            }

            if (A[i] < max && A[i] > secondMax) {
                secondMax = A[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secondMax;
    }
}
