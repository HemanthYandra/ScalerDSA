/*
   Approach

   1. Create a copy of the original array
      so that the input array is not modified.

   2. Perform Selection Sort only for the
      first B positions.
      - In each iteration, find the smallest
        element in the unsorted portion.
      - Swap it with the current position.

   3. After completing B iterations,
      the B-th smallest element will be
      placed at index (B - 1).

   4. Return the element at index (B - 1).

   Complexity Analysis

   Time  : O(B × N)
           - Each of the first B iterations
             scans the remaining array.

   Space : O(N)
           - Uses a copy of the input array.
*/

import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the value of B: ");
        int B = sc.nextInt();
        int result = kthsmallest(A, B);
        System.out.println(result);

        sc.close();
    }

    public static int kthsmallest(final int[] A, int B) {
        // An empty array or an invalid value of B
        // cannot have a B-th smallest element.
        if (A.length == 0 || B <= 0 || B > A.length) {
            return -1;
        }

        // Create a copy so the original array
        // remains unchanged.
        int[] arrCopy = Arrays.copyOf(A, A.length);

        // Perform Selection Sort for the first B positions.
        for (int i = 0; i < B; i++) {

            // Assume the current position has
            // the smallest element.
            int minIdx = i;

            // Find the smallest element in the
            // remaining unsorted portion.
            for (int j = i + 1; j < arrCopy.length; j++) {
                if (arrCopy[j] < arrCopy[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap only if a smaller element is found.
            if (minIdx != i) {
                int temp = arrCopy[i];
                arrCopy[i] = arrCopy[minIdx];
                arrCopy[minIdx] = temp;
            }
        }

        // Return the B-th smallest element.
        return arrCopy[B - 1];
    }
}
