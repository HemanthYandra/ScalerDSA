/*
## Approach

- Initialize two pointers:
  - `left = B`
  - `right = C`
- While `left < right`:
  - Swap `A[left]` and `A[right]`.
  - Increment `left`.
  - Decrement `right`.
- Return the modified array.

Complexity Analysis
   Time  : O(C - B + 1)
   Space : O(1)
*/

import java.util.*;

public class ReverseInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] res = solve(A, B, C);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    public static int[] solve(int[] A, int B, int C) {
        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
}
