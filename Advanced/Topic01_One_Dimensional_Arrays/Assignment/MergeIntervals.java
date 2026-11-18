/*
	Approach

	Single Pass Merge with Running Interval

	1. Assume A is non-empty and sorted by start value, so any intervals
	   that need to be merged are always adjacent.

	2. Initialize s1, e1 with the first interval's start and end. This is
	   the "current" interval being built.

	3. For every subsequent interval [s2, e2] in A (i = 1 to N - 1):
		- If s2 <= e1 (overlaps or touches the current interval), merge:
		    s1 = min(s1, s2)
		    e1 = max(e1, e2)
		  (the min on s1 is redundant since A is sorted by start, so
		  s1 <= s2 always holds, but it is kept for safety)
		- Otherwise (no overlap):
		    - Create a temp list with [s1, e1] and add it to ans
		    - Start a new current interval: s1 = s2, e1 = e2

	4. After the loop, the last tracked [s1, e1] is still pending, so
	   add it to ans using a temp list.

	5. Return ans.

	Example

		A = [ [1, 3], [2, 6], [8, 10], [15, 18] ]

		Start: s1=1, e1=3

		[2, 6]: 2 <= 3, merge -> s1=1, e1=6
		[8, 10]: 8 > 6, add [1,6] to ans, new current -> s1=8, e1=10
		[15, 18]: 15 > 10, add [8,10] to ans, new current -> s1=15, e1=18

		After loop, add [15, 18]

		Final result: [ [1, 6], [8, 10], [15, 18] ]

	Complexity Analysis

	Time : O(N)
		Single pass over all N intervals, each handled in O(1).

	Space : O(1) auxiliary
		Only s1, e1, s2, e2 and a temp list are used to track state.
		The ans list is the required output, not extra space.
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
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(s1);
                temp.add(e1);

                ans.add(temp);

                s1 = s2;
                e1 = e2;
            }
        }

        // insert the last interval being tracked
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(s1);
        temp.add(e1);

        ans.add(temp);

        return ans;
    }
}
