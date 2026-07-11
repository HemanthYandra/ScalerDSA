/*
   Approach

   1. Sort the array in descending order.
      - Since Arrays.sort() sorts in ascending
        order, multiply each element by -1,
        sort the array, and then multiply
        each element by -1 again.

   2. Traverse the sorted array.

   3. Keep track of the number of elements
      greater than the current element.
      - Whenever a new value is encountered,
        update the count using its index.

   4. If the current element is equal to the
      number of elements greater than it,
      then it is a noble integer.

   5. If at least one noble integer exists,
      return 1. Otherwise, return -1.

   Complexity Analysis

   Time  : O(N log N)
           - Sorting dominates the running time.

   Space : O(1)
           - Uses only a few extra variables.
*/

import java.util.*;

public class NobleInteger2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = solve(A);
        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * -1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * -1;
        }

        int count = 0;
        int noble_count = 0;

        if (A[0] == 0) {
            noble_count++;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                count = i;
            }

            if (A[i] == count) {
                noble_count++;
            }
        }
        return noble_count > 0 ? 1 : -1;
    }
}
