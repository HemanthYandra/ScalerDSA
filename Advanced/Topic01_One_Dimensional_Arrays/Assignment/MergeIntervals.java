/*
	Approach

	The intervals are already sorted by start value, so any intervals
	that need to be merged will always end up next to each other.
	This means we only need a single pass, tracking the "current"
	interval being built in two scalars (s1, e1) instead of peeking
	into the result list.

	1. If A is empty, return an empty result.

	2. Initialize s1, e1 with the first interval's start/end.

	3. For every subsequent interval [s2, e2] in A:
		- If s2 <= e1 (this interval overlaps or touches the
		  current one), merge them:
		    e1 = max(e1, e2)
		  (s1 = min(s1, s2) is unnecessary since A is sorted by
		  start, so s1 <= s2 always holds)
		- Otherwise, the interval doesn't overlap with current,
		  so close off [s1, e1] into the result, then start a
		  new current interval at [s2, e2].

	4. After the loop, insert the last tracked [s1, e1] into result.

	5. Return the result list.

	Example

		A = [ [1, 3], [2, 6], [8, 10], [15, 18] ]

		Start: s1=1, e1=3

		[2, 6]: 2 <= 3, merge -> e1 = 6        (s1=1, e1=6)
		[8, 10]: 8 > 6, close [1,6], new current (s1=8, e1=10)
		[15, 18]: 15 > 10, close [8,10], new current (s1=15, e1=18)

		After loop, insert [15, 18]

		Final result: [ [1, 6], [8, 10], [15, 18] ]

	Complexity Analysis

	Time : O(N)
		- Single pass over all N intervals.

	Space : O(1) auxiliary
		- Only s1, e1, s2, e2 scalars are used to track state;
		  the result list itself is the required output, not
		  extra space.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        System.out.println("Enter the intervals (start end), sorted by start: ");
        for(int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            A.add(new ArrayList<>(Arrays.asList(start, end)));
        }

        ArrayList<ArrayList<Integer>> result = solve(A);

        System.out.println(result);

        sc.close();
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int s1 = A.get(0).get(0);
        int e1 = A.get(0).get(1);

        for(int i = 1; i < A.size(); i++) {
            int s2 = A.get(i).get(0);
            int e2 = A.get(i).get(1);

            // overlap -> extend current interval
            if(s2 <= e1) {
                s1 = Math.min(s1, s2);   // This is not needed, since s1 <= s2 always (sorted input)
                e1 = Math.max(e1, e2);
            }
            // no overlap -> close off current interval, start a new one
            else {
                ans.add(new ArrayList<>(Arrays.asList(s1, e1)));
                s1 = s2;
                e1 = e2;
            }
        }

        // insert the last interval being tracked
        ans.add(new ArrayList<>(Arrays.asList(s1, e1)));

        return ans;
    }
}
