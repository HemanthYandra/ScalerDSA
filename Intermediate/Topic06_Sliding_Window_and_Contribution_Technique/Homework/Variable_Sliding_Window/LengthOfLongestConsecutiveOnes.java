/*
	Approach

	1. Use a sliding window with two pointers, s and e.

	2. Expand the window by moving e from left to right.

	3. Keep track of the number of zeros present in the
	   current window.

	4. Whenever the number of zeros becomes greater than 1,
	   shrink the window from the left by moving s until
	   the window contains at most one zero.

	5. At every valid window, calculate its length and update
	   maxLen if the current window is longer.

	6. Continue until e reaches the end of the array.

	7. Return maxLen as the maximum length of consecutive
	   ones after flipping at most one zero.


	Complexity Analysis

	Time : O(N)
		- Both pointers move from left to right.
		- Each element is added to and removed from the
		  window at most once.

	Space : O(1)
		- Only a few variables are used.
*/

package Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;

import java.util.*;
public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Max Length: " + solve(nums));

        sc.close();
    }

    public static int solve(int[] nums) {
        int n = nums.length;

        // Stores the number of zeros in the current window
        int zeros = 0;

        // Stores the length of the longest valid window
        int maxLen = 0;

        // Left and right pointers of the sliding window
        int s = 0;
        int e = 0;

        // Expand the window
        while (e < n) {
            // Include the current element in the window
            if (nums[e] == 0) {
                zeros++;
            }

            // Shrink the window if it contains more than one zero
            while (zeros > 1) {
                if (nums[s] == 0) {
                    zeros--;
                }
                s++;
            }

            // Update the maximum length of the valid window
            maxLen = Math.max(maxLen, e - s + 1);

            // Expand the window
            e++;
        }

        return maxLen;
    }
}
