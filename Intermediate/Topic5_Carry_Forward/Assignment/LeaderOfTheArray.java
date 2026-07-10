/*
   Approach

   1. The rightmost element is always a leader,
      so initialize it as the current leader.

   2. Traverse the array from right to left.

   3. Keep track of the maximum element seen so far.

   4. If the current element is greater than the
      maximum seen so far:
      - It is a leader.
      - Store it in a temporary array.
      - Update the maximum.

   5. Since leaders are collected from right to left,
      reverse the temporary array to get the original order.

   6. Return the result array.

   Complexity Analysis

   Time  : O(N)
           - One traversal to find the leaders.
           - One traversal to reverse the result.

   Space : O(N)
           - Temporary array + result array.
*/

import java.util.*;

public class LeaderOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] res = solve(A);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    // Finds and returns all leader elements in the array.
    public static int[] solve(int[] A) {
        // An empty array has no leaders.
        if (A.length == 0) {
            return new int[0];
        }

        int n = A.length;

        // Stores the leaders as they are found 
        // while traversing the array from right to left.
        int[] leaders = new int[n];

        // Keeps track of the number of leaders found.
        int count = 0;

        // The rightmost element is always a leader.
        // maxFromRight stores the largest element 
        // seen so far while traversing from the right.
        int maxFromRight = A[n - 1];

        // Store the first leader (the rightmost element).
        // count++ increments the index after storing the value.
        leaders[count++] = maxFromRight;

        // Traverse the array from right to left.
        for (int i = n - 2; i >= 0; i--) {
            // If the current element is greater than all elements
            // seen so far on its right, it is a leader.
            if (A[i] > maxFromRight) {
                // Update the maximum element seen from the right.
                maxFromRight = A[i];

                // Store the newly found leader.
                leaders[count++] = A[i];
            }
        }

        // Result array containing only the leader elements.
        int[] result = new int[count];

        // Copy the leaders into the result array in reverse order
        // so they match the original left-to-right order.
        for (int i = 0; i < count; i++) {
            result[i] = leaders[count - 1 - i];
        }

        // Return the array of leaders.
        return result;
    }
}
