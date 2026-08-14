/*
	Approach

	Version 1:

	1. Sort the array in ascending order.

	2. Traverse the sorted array from left to right.

	3. For every element A[i], the number of elements
	   greater than A[i] is:

	   N - i - 1

	4. However, duplicate elements need special handling.
	   If the next element is equal to A[i], then there are
	   still elements equal to A[i] after the current position.
	   Therefore, A[i] cannot be a noble integer at this index,
	   so we skip it.

	5. For the last occurrence of a value:
	   - Count of elements greater than A[i] = N - i - 1.
	   - Check whether this count is equal to A[i].

	6. If A[i] == N - i - 1, then A[i] is a noble integer,
	   so return 1.

	7. If no noble integer is found, return -1.


	Complexity Analysis

	Time : O(N log N)
		- Sorting the array takes O(N log N).
		- Traversing the sorted array takes O(N).
		- Therefore, the overall complexity is O(N log N).

	Space : O(1)
		- No additional array or data structure is used.
		- The sorting is performed on the original array.


	Version 2:

	1. Sort the array in descending order.

	2. Traverse the sorted array from left to right.

	3. In descending order, the index i represents the
	   number of elements greater than A[i] only when
	   A[i] is the first occurrence of that value.

	4. If the current element is equal to the previous
	   element, skip it because the current position does
	   not represent the first occurrence of that value.

	5. For every first occurrence, check whether:

	   A[i] == i

	6. If A[i] == i, then exactly i elements are greater
	   than A[i], so A[i] is a noble integer.

	7. If a noble integer is found, return 1.

	8. If no noble integer is found after traversing the
	   entire array, return -1.


	Complexity Analysis

	Time : O(N log N)
		- Sorting the array takes O(N log N).
		- Traversing the array takes O(N).
		- Therefore, the overall complexity is O(N log N).

	Space : O(1)
		- No additional array or data structure is used.
		- The sorting is performed on the original array.
*/

package Intermediate.Topic13_Contest_1;

import java.util.*;
public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solveV1(A));

        sc.close();
    }

    // Version 1
    public static int solveV1(int[] A) {
        int n = A.length;

        // Sort the array
        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            // Skip duplicate values
            if (i < n - 1 && A[i] == A[i + 1]) {
                continue;
            }

            // Number of elements greater than A[i]
            int greaterCount = n - i - 1;

            // Check if A[i] is a noble integer
            if (A[i] == greaterCount) {
                return 1;
            }
        }

        return -1;
    }

    // Version 2
    public static int solveV2(int[] A) {
        // Sort the array in descending order
        reverseSort(A);

        // Traverse the sorted array
        for (int i = 0; i < A.length; i++) {
            // Skip duplicate values
            if (i > 0 && A[i] == A[i - 1]) {
                continue;
            }

            // Number of elements greater than A[i] is i
            if (A[i] == i) {
                return 1;
            }
        }

        return -1;
    }

    public static void reverseSort(int[] A) {
        // Convert values to negative
        for (int i = 0; i < A.length; i++) {
            A[i] *= -1;
        }

        // Sort in ascending order
        Arrays.sort(A);

        // Convert back to positive
        for (int i = 0; i < A.length; i++) {
            A[i] *= -1;
        }
    }
}
