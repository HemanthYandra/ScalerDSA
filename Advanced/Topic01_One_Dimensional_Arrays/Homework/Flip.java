/*
	Approach

    Use Kadane's Algorithm

	Flipping a range [L, R] changes the count of 1s by:
		(zeros turned into ones) - (ones turned into zeros)
	in that range.

	Map each character to a value:
		'0' -> +1  (flipping this to 1 is a gain)
		'1' -> -1  (flipping this to 0 is a loss)

	Flipping [L, R] then increases the total number of 1s by exactly
	sum(val[L..R]). So we need the contiguous subarray with the
	MAXIMUM sum -> this is Kadane's Algorithm (Maximum Subarray Sum).

	1. Walk through the string, maintaining:
		- curr_sum: sum of the current window [l, r]
		- max_sum: best (maximum) window sum found so far
		- l, r: the current window's start and end

	2. For each character:
		- Update curr_sum by +1 (if '0') or -1 (if '1').
		- If curr_sum > max_sum, this window is the best seen so
		  far, so record ans = [l+1, r+1] (converted to 1-indexed).
		  Using strict '>' ensures ties keep the earliest window,
		  giving the lexicographically smallest [L, R].
		- If curr_sum drops below 0, the window isn't worth
		  extending, so reset curr_sum to 0 and start a new window
		  at i+1. Otherwise, extend the window by moving r forward.

	3. If max_sum stays 0, no flip can increase the number of 1s,
	   so return an empty array. Otherwise, return ans.

	Example

		A = "010"
		val = [+1, -1, +1]

		i=0: curr_sum=1 > max_sum(0) -> ans=[1,1]; r becomes 1
		i=1: curr_sum=0, not > max_sum(1); r becomes 2
		i=2: curr_sum=1, not > max_sum(1) (strict); r becomes 3

		max_sum = 1 (> 0), ans = [1, 1]

	Complexity Analysis

	Time : O(N)
		- Single pass Kadane's algorithm over the string.

	Space : O(1)
		- Only a few variables used (excluding output).
*/

package Advanced.Topic01_One_Dimensional_Arrays.Homework;

import java.util.*;
public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary string: ");
        String A = sc.next();

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(String A) {
        int n = A.length();

        int l = 0;  // start of current window
        int r = 0;  // end of current window

        int curr_sum = 0;   // sum of current window (Kadane's)
        int max_sum = 0;    // best gain in 1s found so far

        int[] ans = new int[2];

        for(int i = 0; i < n; i++) {
            char ch = A.charAt(i);

            // '1' -> flipping loses a 1, '0' -> flipping gains a 1
            if(ch == '1') {
                curr_sum -= 1;
            }
            else {
                curr_sum += 1;
            }

            // Strictly greater keeps the earliest [l, r] for ties
            if(curr_sum > max_sum) {
                max_sum = curr_sum;
                ans[0] = l + 1;
                ans[1] = r + 1;
            }

            // Negative window not worth keeping, start fresh from i+1
            if(curr_sum < 0) {
                curr_sum = 0;
                l = i + 1;
                r = i + 1;
            }
            else {
                // Extend the current window
                r += 1;
            }
        }

        // max_sum == 0 means no flip increases the count of 1s
        if(max_sum == 0) {
            return new int[0];
        }
        else {
            return ans;
        }
    }
}
