/*
	Approach

	1. Count the total number of 1s present in the string.

	2. If all characters are already 1, return N because
	   the entire string is already consecutive 1s.

	3. Traverse the string and consider every 0 as the
	   position where the swap can happen.

	4. For each 0:
	   - Count consecutive 1s on its left.
	   - Count consecutive 1s on its right.

	5. By swapping this 0 with a 1 outside the current
	   group, we can connect the left and right groups.

	6. The possible length is:
	   l + r + 1

	7. Since this is a swap, the total number of 1s
	   remains unchanged. Therefore, the answer cannot
	   exceed totalOnes.

	8. Calculate:
	   min(l + r + 1, totalOnes)

	9. Update maxLen with the maximum possible length.

	10. Return maxLen.


	Complexity Analysis

	Time : O(N²)
		- We traverse the string once to count total 1s.
		- For every 0, we may traverse consecutive 1s
		  on both sides.
		- In the worst case, this can take O(N) for each 0.

	Space : O(1)
		- Only a few variables are used.

	Note: This can be optimized to O(N) using the sliding window technique.
          Go here for the solution:
	      Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Strings.Assignment;

import java.util.*;
public class LengthOfLongestConsecutiveOnesForString {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println("Max Length: " + solve(A));

        sc.close();
	}

	public static int solve(String A) {
		int n = A.length();

		// Count the total number of 1s
		int totalOnes = 0;
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '1') {
				totalOnes++;
			}
		}

		// If all characters are already 1
		if (totalOnes == n) {
			return n;
		}

		int maxLen = 0;

		// Consider every 0 as the position to perform the swap
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '0') {
				// Count consecutive 1s on the left
				int l = 0;
				int j = i - 1;

				while (j >= 0 && A.charAt(j) == '1') {
					l++;
					j--;
				}

				// Count consecutive 1s on the right
				int r = 0;
				j = i + 1;

				while (j < n && A.charAt(j) == '1') {
					r++;
					j++;
				}

				int currentLen;

				// If an extra 1 is available outside the
				// current group, swap it with the current 0
				if (totalOnes > l + r) {
					currentLen = l + r + 1;
				} else {
					// No extra 1 is available for swapping
					currentLen = l + r;
				}

				// Update the maximum length
				maxLen = Math.max(maxLen, currentLen);
			}
		}

		return maxLen;
	}
}
