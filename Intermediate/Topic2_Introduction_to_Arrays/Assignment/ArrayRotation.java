/*
   Approach
  
   1. Compute the effective number of rotations:
      B = B % N
  
   2. Reverse the entire array.
   3. Reverse the first B elements.
   4. Reverse the remaining N - B elements.
   5. Return the rotated array.
  
   Complexity Analysis
   Time  : O(N)
   Space : O(1)
 */

import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        // Right Shift Question. Rotate K times
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int[] res = solve(A, K);
        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static int[] solve(int[] A, int B) {
        int N = A.length;
        if (B >= N) {
            B = B % N;
        }

        reverse(A, 0, N - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, N - 1);

        return A;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
}
