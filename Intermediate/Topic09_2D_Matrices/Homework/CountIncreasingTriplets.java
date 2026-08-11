/*
   Approach

   1. Consider every element A[j] as the
      middle element of the triplet.

   2. Count the number of elements on the
      left side that are smaller than A[j].

      These elements can act as A[i].

   3. Count the number of elements on the
      right side that are greater than A[j].

      These elements can act as A[k].

   4. For every middle element, the number
      of valid triplets is:

      leftCount * rightCount

   5. Add this count to the final answer.

   6. Return the total number of increasing
      triplets.

   Time Complexity  : O(N²)
   Space Complexity : O(1)
 */

package Intermediate.Topic09_2D_Matrices.Homework;

import java.util.*;

public class CountIncreasingTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the size of the array
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        // Input array
        int[] A = new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Count increasing triplets
        int result = solve(A);

        // Print the result
        System.out.println("Count of Increasing Triplets: " + result);
        
        sc.close();
    }

    public static int solve(int[] A) {
        // Size of the array
        int n = A.length;

        // Stores the total no. of valid triplets
        int count = 0;

        // Consider each element as the middle
        // element of the increasing triplet.
        for (int j = 1; j < n - 1; j++) {

            // Count elements smaller than A[j]
            // on the left side
            int leftCount = 0;

            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) {
                    leftCount++;
                }
            }

            // Count elements greater than A[j]
            // on the right side.
            int rightCount = 0;

            for (int k = j + 1; k < n; k++) {
                if (A[k] > A[j]) {
                    rightCount++;
                }
            }

            // Every smaller left element can pair
            // with every greater right element.
            count += leftCount * rightCount;
        }

        // Return the total count
        return count;
    }
}
