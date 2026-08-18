/*
	Approach

    Use Kadane's Algorithm

	1. Initialize curr_sum to 0 and max_sum to Integer.MIN_VALUE.
		- curr_sum stores the sum of the current subarray ending at index i.
		- max_sum stores the maximum subarray sum found so far.

	2. Traverse the array from the first element.

	3. Add the current element to curr_sum.

	4. Update max_sum with the maximum of max_sum and curr_sum.
		- This ensures every prefix sum (including negative or single-element
		  sums) is considered, so the answer is correct even if all elements
		  are negative.

	5. If curr_sum becomes negative, reset it to 0.
		- A negative running sum can only reduce the sum of any future
		  subarray, so it's discarded and a new subarray starts fresh
		  from the next element.

	6. Return max_sum.

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

        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        // Find the maximum sum contiguous subarray
        for(int i = 0; i < n; i++) {
            curr_sum += A[i];

            max_sum = Math.max(max_sum, curr_sum);

            // Start a new subarray if current sum becomes negative
            if(curr_sum < 0) {
                curr_sum = 0;
            }
        }

        return max_sum;
    }
}
