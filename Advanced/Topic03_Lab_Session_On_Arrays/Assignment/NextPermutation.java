/*
	Approach

	Next Permutation Using Pivot, Successor, and Suffix Reversal

	1. Start from the end of the array and find the first index `i - 1`
	   such that A[i - 1] < A[i].
	   This element is called the pivot.

	2. If no such pivot exists, the array is in descending order.
	   Therefore, it is already the largest permutation.
	   Reverse the entire array to obtain the smallest permutation.

	3. If a pivot exists, search from the end of the array to find
	   the first element greater than the pivot.
	   Since the suffix is in descending order, this is the smallest
	   possible element that can replace the pivot.

	4. Swap the pivot with its successor.

	5. The suffix from index `i` to `n - 1` is in descending order.
	   Reverse this suffix to arrange it in ascending order.

	6. Return the modified array as the next lexicographically
	   greater permutation.

	Complexity Analysis

	Time : O(N)
		The array is traversed a constant number of times.
		Therefore, the overall time complexity is O(N).

	Space : O(1)
		The permutation is performed in-place using only a few
		extra variables.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Assignment;

import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[] A) {
        int n = A.length;

        int i = n - 1;

        // Find the pivot: A[i - 1] < A[i]
        while(i > 0) {
            if(A[i - 1] >= A[i]) {
                i--;
            }
            else {
                break;
            }
        }

        // If no pivot exists, reverse the entire array
        // to obtain the smallest permutation
        if(i == 0) {
            reverse(A, 0, n - 1);
            return A;
        }

        // Find the smallest element greater than the pivot
        int g = n - 1;
        while(A[g] <= A[i - 1]) {
            g--;
        }

        // Swap the pivot with its successor
        swap(A, i - 1, g);

        // Reverse the suffix to make it ascending
        reverse(A, i, n - 1);

        return A;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j) {
            swap(A, i, j);
            i++;
            j--;
        }
    }
}
