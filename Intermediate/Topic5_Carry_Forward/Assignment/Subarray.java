/*
   Approach

   1. Calculate the total number of possible subarrays.
      - Total = N * (N + 1) / 2.

   2. Create a 2D array to store all subarrays.

   3. Generate every subarray:
      - Choose a starting index i.
      - Choose an ending index j.
      - Create a new array of size (j - i + 1).
      - Copy the elements from A[i] to A[j].

   4. Store each generated subarray in the result array.

   5. Return the result.

   Complexity Analysis

   Time  : O(N³)
           - O(N²) to generate all start and end indices.
           - O(N) to copy the elements of each subarray.

   Space : O(N³)
           - In the worst case, the total number of elements
             stored across all subarrays is O(N³).
*/

import java.util.*;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[][] res = solve(A);

        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }

        sc.close();
    }

    // Generates and returns all possible subarrays of the given array.
    public static int[][] solve(int[] A) {
        if (A.length == 0) {
            return new int[0][];
        }

        int n = A.length;

        // Calculates the total number of possible subarrays.
        int total = n * (n + 1) / 2;

        // Stores all generated subarrays.
        int[][] subarrays = new int[total][];

        // Index for storing the next generated subarray.
        int index = 0;

        // Generate every possible subarray.
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Size of the current subarray.
                int size = j - i + 1;

                // Create space for the current subarray.
                subarrays[index] = new int[size];

                // Copy elements from index i to j
                // into the current subarray.
                for (int k = i; k <= j; k++) {
                    // Copy the current element into the subarray.
                    subarrays[index][k - i] = A[k];
                }

                // Move to the next position for storing a subarray.
                index++;
            }
        }

        // Return all generated subarrays.
        return subarrays;
    }
}
