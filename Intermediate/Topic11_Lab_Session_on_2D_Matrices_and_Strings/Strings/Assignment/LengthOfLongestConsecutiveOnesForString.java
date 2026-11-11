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

    5. By swapping the current 0 with an available 1
       outside the combined group, we can connect
       the consecutive 1s on its left and right.

    6. Calculate the possible length:
           min(l + r + 1, totalOnes)

    7. Update maxLen with the maximum possible length.

    8. Return maxLen.


    Complexity Analysis

    Time : O(N)
        - We traverse the string once to count total 1s.
        - We traverse the string again to consider every 0.
        - For each 0, we count consecutive 1s on its left
          and right.
        - Each consecutive group of 1s can be traversed
          at most twice: once from each adjacent 0.
        - Therefore, the combined iterations of both
          while loops across the entire string are O(N).

    Space : O(1)
        - Only a fixed number of variables are used.

    Note: This can be done using the sliding window technique as well.
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

				// Calculate the possible consecutive length
				int currentLen = Math.min(l + r + 1, totalOnes);

				// Update the maximum length
				maxLen = Math.max(maxLen, currentLen);
			}
		}

		return maxLen;
	}
}
