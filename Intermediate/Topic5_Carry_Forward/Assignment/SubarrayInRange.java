/*
   Approach

   1. Calculate the size of the required subarray.
      - Size = C - B + 1.

   2. Create a new array of the calculated size.

   3. Copy all elements from index B to C
      into the new array.

   4. Return the subarray.

   Complexity Analysis

   Time  : O(C - B + 1)
           - Copies each element in the given range once.

   Space : O(C - B + 1)
           - Stores the extracted subarray.
*/

import java.util.*;

public class SubarrayInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the start index: ");
        int B = sc.nextInt();
        System.out.print("Enter the end index: ");
        int C = sc.nextInt();

        int[] result = solve(A, B, C);
        System.out.println(Arrays.toString(result));
        
        sc.close();
    }

    // Returns the subarray from index B to C (inclusive).
    public static int[] solve(int[] A, int B, int C) {
        // An empty array has no subarrays.
        if (A.length == 0) {
            return new int[0];
        }

        // Calculate the size of the required subarray.
        int size = C - B + 1;

        // Stores the extracted subarray.
        int[] result = new int[size];

        // Copy elements from index B to C.
        for (int i = B; i <= C; i++) {
            result[i - B] = A[i];
        }

        // Return the extracted subarray.
        return result;
    }
}
