/*
    Approach

    Problem Recap:
    We have a list of intervals that are already:
        - Sorted by start time
        - Non-overlapping (no two intervals touch or overlap)

    We are given one new interval [start, end] to insert into
    this list, merging it with any existing intervals that overlap.

    ---------------
    Key Observation
    ---------------
    Since the existing intervals are already sorted and disjoint,
    once we scan through them left to right, they naturally split
    into exactly THREE groups relative to the new interval:

        Group 1 : Intervals that end BEFORE the new interval starts
                  -> These come entirely before newInterval on the
                     number line. They can NEVER overlap it.
                  -> Condition: intervals[i][1] < newInterval[0]

        Group 2 : Intervals that OVERLAP the new interval
                  -> Their start is less than or equal to the
                     (possibly still growing) end of newInterval.
                  -> Condition: intervals[i][0] <= newInterval[1]
                  -> These must be merged into newInterval by
                     expanding its start and end.

        Group 3 : Intervals that start AFTER the new interval ends
                  -> These come entirely after the merged interval.
                  -> They are simply copied as-is.

    Because the array is sorted, once we leave Group 1 we enter
    Group 2, and once we leave Group 2 we enter Group 3 — there is
    no going back. This is what allows a clean single pass (O(N)).

    ------------------------
    Step-by-Step Walkthrough
    ------------------------

    Step 1: Handle Group 1 (intervals strictly before newInterval)

        while (i < n && intervals[i][1] < start) {
            add intervals[i] to result;
            i++;
        }

        We keep copying intervals unchanged as long as their END
        is strictly less than the new interval's START. This means
        there's a gap between them — no overlap.

    Step 2: Handle Group 2 (intervals overlapping newInterval)

        while (i < n && intervals[i][0] <= end) {
            start = min(start, intervals[i][0]);
            end   = max(end,   intervals[i][1]);
            i++;
        }

        Two intervals overlap (or touch) when:
            intervals[i][0] <= newInterval.end

        Every time we find such an interval, we "absorb" it into
        newInterval by:
            - Pulling newInterval's start further left if needed
            - Pushing newInterval's end further right if needed

        This is why 'end' is used inside the loop condition — it
        keeps growing as more intervals get merged in, so the loop
        correctly continues absorbing intervals as long as they
        keep overlapping the ever-expanding merged interval.

        After this loop, newInterval [start, end] represents the
        fully merged interval covering itself and all overlapping
        neighbors.

    Step 3: Insert the merged interval into result

        Add [start, end] to the result list.

    Step 4: Handle Group 3 (remaining intervals)

        while (i < n) {
            add intervals[i] to result;
            i++;
        }

        Any interval left in the array must start after the merged
        interval's end (otherwise it would have been merged in
        Step 2), so they are copied unchanged.

    ---------------
    Dry Run Example
    ---------------

    intervals = [[1, 3], [6, 9]]
    newInterval = [2, 6]

    start = 2, end = 6, i = 0

    Step 1: Check intervals[0] = [1, 3]
        Is 3 < 2 (start)?  No.
        -> Loop does not execute. Group 1 is empty.

    Step 2: Check intervals[0] = [1, 3]
        Is 1 <= 6 (end)?  Yes -> overlaps.
        start = min(2, 1) = 1
        end   = max(6, 3) = 6
        i = 1

        Check intervals[1] = [6, 9]
        Is 6 <= 6 (end)?  Yes -> overlaps (touching counts).
        start = min(1, 6) = 1
        end   = max(6, 9) = 9
        i = 2

        i = 2 = n, loop ends.

    Step 3: Add merged interval [1, 9] to result.

    Step 4: No intervals left (i = n), nothing more to add.

    Final result: [[1, 9]]

    --------------
    Why This Works
    --------------
    - Sorted + non-overlapping input guarantees we never need to
      "go back" to a previous interval once we've moved past it.
    - Using 'end' (which keeps growing) in the Group 2 condition
      is essential — it correctly handles chains of overlaps
      (e.g., new interval overlaps interval A, which was smaller,
      but after merging with A, the enlarged interval now also
      overlaps interval B).

    Complexity Analysis

    Time  : O(N)  
        — every interval is visited exactly once across
          the three loops combined.

    Space : O(N)  
        — for storing the result array.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Homework;

import java.util.*;

public class MergeIntervals2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        System.out.print("Enter the new interval (start end): ");
        int[] newInterval = new int[2];
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();

        int[][] result = solve(intervals, newInterval);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

        sc.close();
    }

    public static int[][] solve(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        int[][] temp = new int[n + 1][2];
        int size = 0;

        int start = newInterval[0];
        int end = newInterval[1];

        int i = 0;

        // 1. Add all intervals ending before newInterval starts
        while (i < n && intervals[i][1] < start) {
            temp[size][0] = intervals[i][0];
            temp[size][1] = intervals[i][1];
            size++;
            i++;
        }

        // 2. Merge all overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        temp[size][0] = start;
        temp[size][1] = end;
        size++;

        // 3. Add remaining intervals
        while (i < n) {
            temp[size][0] = intervals[i][0];
            temp[size][1] = intervals[i][1];
            size++;
            i++;
        }

        // Copy into a properly sized result array
        int[][] result = new int[size][2];
        for (int j = 0; j < size; j++) {
            result[j][0] = temp[j][0];
            result[j][1] = temp[j][1];
        }

        return result;
    }
}
