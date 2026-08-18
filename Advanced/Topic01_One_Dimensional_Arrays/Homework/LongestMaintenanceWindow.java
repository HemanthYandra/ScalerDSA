/*
	Approach

	The intervals are already sorted by start value, so overlapping
	intervals are guaranteed to be adjacent to each other. This means
	we can merge them in a single pass, and check for gaps between
	merged intervals as we go — without needing to store the full
	list of merged intervals.

	1. Initialize s1, e1 with the first interval's start/end. This
	   represents the "current" merged interval being built.

	2. For every subsequent interval [s2, e2] in A:
		- If s2 <= e1 (this interval overlaps or touches the
		  current one), merge them by extending the end:
		    e1 = max(e1, e2)
		- Otherwise, the interval doesn't overlap with the current
		  one, which means we've found a gap of no activity
		  between e1 (end of current merged interval) and s2
		  (start of next interval):
		    gap = s2 - e1
		  If this gap is larger than the best gap seen so far,
		  update bestGap, bestStart, and bestEnd.
		  Then start tracking a new current interval at [s2, e2].

	3. After the loop, bestStart and bestEnd hold the boundaries of
	   the longest gap found. If no gap was ever found (i.e. all
	   intervals merged into one, or only one interval was given),
	   they remain at their initialized value of -1, -1.

	4. Wrap [bestStart, bestEnd] in the result list and return it.

	Example

		A = [ [9, 11], [14, 16], [15, 20] ]

		Start: s1=9, e1=11

		[14, 16]: 14 > 11 (e1), no overlap -> gap = 14 - 11 = 3
		          bestGap=3, bestStart=11, bestEnd=14
		          new current interval: s1=14, e1=16

		[15, 20]: 15 <= 16 (e1), overlap -> merge, e1 = max(16, 20) = 20

		Loop ends. Best gap found: [11, 14]

		Final result: [ [11, 14] ]

	Complexity Analysis

	Time : O(N)
		- Single pass over all N intervals.

	Space : O(1) auxiliary
		- Only a fixed number of scalars (s1, e1, s2, e2, bestGap,
		  bestStart, bestEnd) are used to track state; the single-
		  element output list is the required result, not extra
		  space.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Homework;

import java.util.*;
public class LongestMaintenanceWindow {
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

        // Track the current merged interval, starting from the first one
        int s1 = A.get(0).get(0);
        int e1 = A.get(0).get(1);

        int bestGap = -1;
        int bestStart = -1;
        int bestEnd = -1;

        for(int i = 1; i < A.size(); i++) {
            int s2 = A.get(i).get(0);
            int e2 = A.get(i).get(1);

            // overlap -> extend current merged interval
            if(s2 <= e1) {
                s1 = Math.min(s1, s2);   // This is not needed, since s1 <= s2 always (sorted input)
                e1 = Math.max(e1, e2);
            } 
            // no overlap -> gap found between e1 and s2
            else {
                int gap = s2 - e1;
                if(gap > bestGap) {
                    bestGap = gap;
                    bestStart = e1;
                    bestEnd = s2;
                }

                // start tracking the next merged interval
                s1 = s2;
                e1 = e2;
            }
        }

        ans.add(new ArrayList<>(Arrays.asList(bestStart, bestEnd)));

        return ans;
    }
}
