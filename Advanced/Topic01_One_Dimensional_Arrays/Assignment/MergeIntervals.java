/*
	Approach

	The intervals are already sorted by start value, so any intervals
	that need to be merged will always end up next to each other.
	This means we only need a single pass, comparing each interval
	to the last one we've already placed in the result.

	1. If A is empty, return an empty result.

	2. Add the first interval to the result list as the "current"
	   interval we're building.

	3. For every subsequent interval [start, end] in A:
		- Let last = the last interval in the result list.
		- If start <= last[1] (i.e. this interval overlaps or
		  touches the last one), merge them:
		    last[1] = max(last[1], end)
		- Otherwise, the interval doesn't overlap with last,
		  so simply add it to the result as a new interval.

	4. Return the result list.

	Example

		A = [ [1, 3], [2, 6], [8, 10], [15, 18] ]

		Start with result = [ [1, 3] ]

		[2, 6]: 2 <= 3 (last[1]), so merge -> last becomes [1, 6]
		        result = [ [1, 6] ]

		[8, 10]: 8 > 6 (last[1]), no overlap -> add as new
		        result = [ [1, 6], [8, 10] ]

		[15, 18]: 15 > 10 (last[1]), no overlap -> add as new
		        result = [ [1, 6], [8, 10], [15, 18] ]

		Final result: [ [1, 6], [8, 10], [15, 18] ]

	Complexity Analysis

	Time : O(N)
		- Single pass over all N intervals.

	Space : O(N)
		- Result array holds up to N intervals (excluding output).
*/

package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int N = sc.nextInt();

        int[][] A = new int[N][2];

        System.out.println("Enter the intervals (start end), sorted by start: ");
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        int[][] result = solve(A);

        System.out.println(Arrays.deepToString(result));

        sc.close();
    }

    public static int[][] solve(int[][] A) {
        if (A.length == 0) {
            return new int[0][0];
        }

        // Temporary array to build merged intervals into.
        // At most A.length intervals can exist in the result.
        int[][] temp = new int[A.length][2];
        int count = 0;

        // Start with the first interval as the current interval being built
        temp[0][0] = A[0][0];
        temp[0][1] = A[0][1];
        count = 1;

        for (int i = 1; i < A.length; i++) {
            int start = A[i][0];
            int end = A[i][1];

            // The interval most recently added to temp
            int lastIndex = count - 1;

            if (start <= temp[lastIndex][1]) {
                // Overlaps (or touches) the last interval -> merge
                temp[lastIndex][1] = Math.max(temp[lastIndex][1], end);
            } 
            else {
                // No overlap -> starts a new interval
                temp[count][0] = start;
                temp[count][1] = end;
                count++;
            }
        }

        // Trim temp down to the actual number of merged intervals
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
