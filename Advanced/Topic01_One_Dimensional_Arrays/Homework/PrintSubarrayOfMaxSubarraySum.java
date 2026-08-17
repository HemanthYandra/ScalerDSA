/*
	Approach

	1. Use Kadane's Algorithm to find the maximum subarray sum.

	2. Maintain start to store the starting index of the current subarray.

	3. If curr_max is not positive:
		- Start a new subarray from the current index.
		- Update start = i.

	4. Whenever curr_max becomes greater than overall_max:
		- Store start as bestStart.
		- Store i as bestEnd.
		- Update overall_max.

	5. Create a result array of size:
		(bestEnd - bestStart + 1)

	6. Copy all elements from bestStart to bestEnd into result.

	7. Return the result array.

	Complexity Analysis

	Time : O(N)
		The array is traversed once to find the maximum subarray
		and once to copy the result.

	Space : O(K)
		Where K is the length of the maximum-sum subarray.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Homework;

import java.util.*;
public class PrintSubarrayOfMaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        
        int curr_max = A[0];
        int overall_max = A[0];

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for(int i = 1; i < n; i++) {
            if(curr_max > 0) {
                curr_max += A[i];
            }
            else {
                curr_max = A[i];
                start = i;
            }

            if(curr_max > overall_max) {
                overall_max = curr_max;
                bestStart = start;
                bestEnd = i;
            }
        }

        // Create result array with the size of the maximum subarray
        int[] result = new int[bestEnd - bestStart + 1];

        // Copy the maximum-sum subarray into result
        int j = 0;
        for (int i = bestStart; i <= bestEnd; i++) {
            result[j] = A[i];
            j++;
        }

        return result;
    }
}
