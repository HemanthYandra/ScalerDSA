/*
	Approach

	1. Count the total number of 1s present in the array.

	2. If all elements are already 1, return N because
	   the entire array is already a valid sequence.

	3. Consider every 0 as the position where we can
	   bring a 1 by swapping.

	4. For every 0:
	   - Count consecutive 1s on its left.
	   - Count consecutive 1s on its right.

	5. The current 0 can be replaced by a 1, so the
	   possible length is:

	   leftOnes + rightOnes + 1

	6. However, if all available 1s are already present
	   in the left and right portions, there is no extra
	   1 outside the current window to swap with the 0.

	   Therefore, in that case, the maximum length is:

	   leftOnes + rightOnes

	7. Compare the possible length for every 0 and keep
	   the maximum value.

	8. Return maxLen.


	Complexity Analysis

	Time : O(N²)
		- For every zero, we may traverse consecutive 1s
		  on both its left and right.
		- In the worst case, this can take O(N) for each
		  zero.

	Space : O(1)
		- Only a few variables are used.

	Note: This can be optimized to O(N) using the sliding window technique.
          Go here for the solution: 
	      Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Additional_Questions;

import java.util.*;
public class LengthOfLongestConsecutiveOnesBySwapping {
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

        // Count the total number of 1s
        int totalOnes = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                totalOnes++;
            }
        }

        // If all elements are already 1
        if(totalOnes == n) {
            return n;
        }

        int ans = 0;
        int maxLen = 0;

        // Consider every zero as the element to be flipped
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // Count consecutive 1s on the left
                int l = 0;
                int j = i - 1;

                while (j >= 0 && nums[j] == 1) {
                    l++;
                    j--;
                }

                // Count consecutive 1s on the right
                int r = 0;
                j = i + 1;

                while (j < n && nums[j] == 1) {
                    r++;
                    j++;
                }

                // If there is a 1 outside the current window,
                // swap it with the current zero
                if(totalOnes > l + r) {
                    ans = l + r + 1;
                }
                else {
                    // No extra 1 is available to swap
                    ans = l + r;
                }

                // Update the maximum length
                maxLen = Math.max(maxLen, ans);
            }
        }

        return maxLen;
    }
}