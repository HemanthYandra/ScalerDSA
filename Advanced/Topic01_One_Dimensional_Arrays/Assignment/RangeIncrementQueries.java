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

	5. Convert arr into a prefix sum in-place.
		- arr currently stores only where each increment starts.
		- Turning it into a prefix sum makes each index hold
		  the actual accumulated value, without needing a
		  separate array.

	6. arr[0] already holds its correct final value, so the
	   prefix sum starts from index 1.

	7. Calculate the prefix sum for the remaining indices.

		- Use:

		  arr[i] += arr[i - 1];

		- This carries all increments received by the previous
		  index into the current index.

		- For example:

		  before: arr = [0, 3, 0, 4, -2, 0, 0]
		  after:  arr = [0, 3, 3, 7, 5, 5, 5]

		- Therefore, arr now represents the final state of the array.

	8. Return arr as the final result.
		- No separate prefix sum array is used.
		- arr is overwritten in-place to save space.

	9. The main advantage of this technique is that each query
	   is processed in O(1).
		- We do not update every element from idx to N - 1.
		- We only record the increment at arr[idx].
		- The prefix sum later calculates the final values.

	Complexity Analysis

	Time : O(N + Q)
		- Processing Q queries takes O(Q).
		- Calculating the prefix sum takes O(N).

	Space : O(1)
		- Excluding the output array, only a constant amount
		  of extra space is used.
		- The increments are recorded in arr itself, and the
		  prefix sum is computed in-place over the same array.
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

        System.out.println("Enter the queries: ");
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

        // Calculate the prefix sum in-place to propagate
		// each increment to all following indices
		for(int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
		}

        // Return the final array after applying
        // all the range increment queries
        return arr;
    }
}
