/*
	Approach

	1. Understand what each query means.
		- A query (idx, value) means:
		  "Starting from index idx, add value to every
		  element until the end of the array."

		- For example, query (3, 4) means:

		  index:  0  1  2  3  4  5  6
		  add:    0  0  0  4  4  4  4

	2. Instead of updating every element from idx to N - 1,
	   use the array arr to store the starting increments.

	3. For every query, record only where the increment starts.
		- Add value at arr[idx].
		- This means:
		  "From this index onwards, there is an additional value."

		- For example, for query (3, 4):

		  arr = [0, 0, 0, 4, 0, 0, 0]

	4. Process all queries by storing their increments at
	   their respective starting indices.

		- For example:

		  Queries:
		  (3, 4)
		  (1, 3)
		  (4, -2)

		  After processing all queries:

		  arr = [0, 3, 0, 4, -2, 0, 0]

	5. Create a separate prefix sum array pSum.
		- The arr array stores only where each increment starts.
		- The pSum array stores the actual accumulated value
		  at every index.

	6. Initialize pSum[0] with arr[0].

		- pSum[0] = arr[0]

	7. Calculate the prefix sum for the remaining indices.

		- Use:

		  pSum[i] = pSum[i - 1] + arr[i];

		- This carries all increments received by the previous
		  index into the current index.

		- For example:

		  arr  = [0, 3, 0, 4, -2, 0, 0]
		  pSum = [0, 3, 3, 7, 5, 5, 5]

		- Therefore, pSum represents the final state of the array.

	8. Return pSum as the final result.
		- The original arr array remains unchanged.
		- This is why a separate pSum array is used.

	9. The main advantage of this technique is that each query
	   is processed in O(1).
		- We do not update every element from idx to N - 1.
		- We only record the increment at arr[idx].
		- The prefix sum later calculates the final values.

	Complexity Analysis

	Time : O(N + Q)
		- Processing Q queries takes O(Q).
		- Calculating the prefix sum takes O(N).

	Space : O(N)
		- The arr array of size N is used to store the increments.
		- The prefix sum array pSum of size N is used for the result.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class RangeIncrementQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        int[][] queries = new int[q][2];

        System.out.print("Enter the queries: ");
        for(int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] result = solve(n, queries);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int n, int[][] queries) {
        int[] arr = new int[n];

        // Store each increment at its starting index
        for(int i = 0; i < queries.length; i++) {
            int idx = queries[i][0];
            int value = queries[i][1];

            // Add the value at the index from where
            // the increment should start
            arr[idx] += value;
        }

        // Calculate the prefix sum to propagate
        // each increment to all following indices
        int[] pSum = new int[n];

        pSum[0] = arr[0];

        for(int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        // Return the final array after applying
        // all the range increment queries
        return pSum;
    }
}
