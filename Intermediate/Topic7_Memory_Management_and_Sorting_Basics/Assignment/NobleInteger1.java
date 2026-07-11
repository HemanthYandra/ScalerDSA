/*
   Approach

   1. Sort the array in ascending order.

   2. Traverse the sorted array while keeping
      track of the number of elements that are
      strictly smaller than the current element.

   3. For every element:
      - If it is different from the previous
        element, then its index represents the
        number of strictly smaller elements.
      - Update the count of smaller elements.

   4. If the current element equals the number
      of strictly smaller elements, it is a
      noble integer.

   5. Return the total count of noble integers.

   Complexity Analysis

   Time  : O(N log N)
           - Sorting dominates the running time.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class NobleInteger1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = findCount(A);
        System.out.println(result);

        sc.close();
    }

    public static int findCount(int[] A) {

        // An empty array contains no noble integers.
        if (A.length == 0) {
            return 0;
        }

        // Step 1: Sort the array.
        Arrays.sort(A);

        // Stores the number of strictly
        // smaller elements for the current value.
        int smallerCount = 0;

        // Stores the total noble integers.
        int nobleCount = 0;

        // Step 2: Check the first element separately.
        if (A[0] == 0) {
            nobleCount++;
        }

        // Step 3: Traverse the remaining elements.
        for (int i = 1; i < A.length; i++) {

            // If the current element is different
            // from the previous one, update the
            // number of strictly smaller elements.
            if (A[i] != A[i - 1]) {
                smallerCount = i;
            }

            // Check whether the current element
            // is a noble integer.
            if (A[i] == smallerCount) {
                nobleCount++;
            }
        }

        // Return the total count.
        return nobleCount;
    }
}