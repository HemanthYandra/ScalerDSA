/*
## Approach

- Initialize a variable `count` to `0`.
- Traverse the array from beginning to end.
- For each element:
  - If it is equal to `B`, increment `count`.
- Return `count` after the traversal is complete.

Complexity Analysis
   Time  : O(N)
   Space : O(1)
*/

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int res = solve(A, B);
        System.out.println(res);
        sc.close();
    }

    public static int solve(int[] A, int B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
            }
        }
        return count;
    }
}
