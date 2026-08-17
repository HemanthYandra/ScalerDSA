/*
	Approach

	1. Initialize curr_max and overall_max with the first element.
		- curr_max stores the maximum sum of a subarray ending at the current index.
		- overall_max stores the maximum subarray sum found so far.

	2. Traverse the array from the second element.

	3. If curr_max is positive, add the current element to it.
		- A positive previous sum can increase the sum of the current subarray.

	4. If curr_max is not positive, start a new subarray from the current element.

	5. Update overall_max with the maximum of curr_max and overall_max.

	6. Return overall_max.

	Complexity Analysis

	Time : O(N)
		We traverse the array only once.

	Space : O(1)
		Only a constant amount of extra space is used.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        int curr_max = A[0];
        int overall_max = A[0];

        // Start from index 1 because A[0] is already included
        for(int i = 1; i < n; i++) {
            if(curr_max > 0) {
                curr_max += A[i];
            }
            else {
                curr_max = A[i];
            }

            if (curr_max > overall_max) {
                overall_max = curr_max;
            }
        }

        return overall_max;
    }
}
