/*
	Approach

	1. Count the total number of 1s present in the array.

	2. If all elements are already 1, return N because
	   the entire array is already a valid sequence.

	3. Use a sliding window with two pointers, s and e.

	4. Expand the window by moving e from left to right.

	5. Keep track of the number of zeros present in the
	   current window.

	6. If the window contains more than one zero, shrink
	   the window from the left until it contains at most
	   one zero.

	7. A valid window contains at most one zero, which can
	   be replaced by swapping it with a 1 outside the
	   window.

	8. Calculate the current window length.

	9. The answer cannot be greater than the total number
	   of 1s in the array because swapping only moves an
	   existing 1; it does not create a new 1.

	10. Therefore, take the minimum of:
	    - current window length
	    - totalOnes

	11. Update maxLen with the maximum valid length.

	12. Return maxLen.


	Complexity Analysis

	Time : O(N)
		- The right pointer moves from left to right once.
		- The left pointer also moves from left to right at
		  most once.
		- Therefore, each element is processed at most twice.

	Space : O(1)
		- Only a few variables are used.
*/

package Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;

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

        // Count total number of 1s
        int totalOnes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                totalOnes++;
            }
        }

        // If all elements are 1
        if (totalOnes == n) {
            return n;
        }

        // Stores the number of zeros in the current window
        int zeroCount = 0;

        // Stores the maximum possible length
        int maxLen = 0;

        // Left and right pointers of the sliding window
        int s = 0;
        int e = 0;

        // Sliding Window
        while (e < n) {

            // Add nums[e] to the window
            if (nums[e] == 0) {
                zeroCount++;
            }

            // Shrink the window if it contains more than one zero
            while (zeroCount > 1) {
                if (nums[s] == 0) {
                    zeroCount--;
                }

                s++;
            }

            // Current window length
            int windowLength = e - s + 1;

            // We cannot have more 1s than totalOnes
            int currentLength = Math.min(windowLength, totalOnes);

            // Update the maximum length
            maxLen = Math.max(maxLen, currentLength);

            // Expand the window
            e++;
        }

        return maxLen;
    }
}
