/*
## Approach

- Find the maximum element in the array.
- Traverse the array again.
- For each element, calculate the difference between the maximum element and the current element.
- Add all these differences to obtain the minimum time required.

Complexity Analysis
   Time  : O(N)
   Space : O(1)
*/

import java.util.*;

public class TimeToEquality {
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
        int N = A.length;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            sum = sum + A[i];
        }

        long result = (long) N * max - sum;
        return (int) result;
    }
}
