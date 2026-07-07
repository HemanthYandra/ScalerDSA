/*
## Approach

- Find the maximum element in the array.
- Traverse the array again.
- Count all elements that are **strictly less than** the maximum element.
- Return the count.

Complexity Analysis
   Time  : O(N)
   Space : O(1)
*/

import java.util.*;

public class CountOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        int max = Integer.MIN_VALUE;
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == max) {
                count++;
            }
        }

        return N - count;
    }
}
