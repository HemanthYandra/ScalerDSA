/*
   Approach

   1. Sort the array in ascending order.

   2. After sorting, the index of each element
      represents the number of elements smaller
      than it because all elements are distinct.

   3. Traverse the sorted array.
      - If A[i] == i, then exactly i elements
        are smaller than A[i].
      - Therefore, A[i] is a noble integer.

   4. Count all such noble integers.

   5. Return the total count.

   Complexity Analysis

   Time  : O(N log N)
           - Sorting the array dominates.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class NobleInteger {
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

        // Step 1: Sort the array in ascending order.
        Arrays.sort(A);

        // Stores the number of noble integers found.
        int count = 0;

        // Step 2: Traverse the sorted array.
        for(int i = 0; i < A.length; i++) {

            // Since the array is sorted and all elements
            // are distinct, index i equals the number of
            // elements smaller than A[i].
            if(A[i] == i) {
                count++;
            }
        }

        // Return the total number of noble integers.
        return count;
    }
}
