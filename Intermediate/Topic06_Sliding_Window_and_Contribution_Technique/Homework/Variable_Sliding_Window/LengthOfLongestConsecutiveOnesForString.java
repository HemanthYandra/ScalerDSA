/*
	Approach

	1. Count the total number of 1s present in the string.

	2. If all characters are already 1, return N because
	   the entire string is already consecutive 1s.

	3. Use a sliding window with two pointers:
	   - s represents the start of the window.
	   - e represents the end of the window.

	4. Expand the window by moving e from left to right.

	5. Keep track of the number of 0s present inside
	   the current window.

	6. If the window contains more than one 0, shrink
	   the window from the left until it contains at most
	   one 0.

	7. A valid window contains at most one 0, which can
	   potentially be replaced by swapping it with a 1
	   outside the window.

	8. Since this is a swap, the number of 1s cannot
	   increase. Therefore, the answer cannot exceed
	   totalOnes.

	9. Calculate the possible length as:

	   min(windowLength, totalOnes)

	10. Update maxLen with the maximum possible length.

	11. Return maxLen.


	Complexity Analysis

	Time : O(N)
		- The e pointer traverses the string once.
		- The s pointer also moves forward at most N times.
		- Therefore, each character is processed at most twice.

	Space : O(1)
		- Only a few variables are used.
*/

package Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;

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

        // Stores the number of zeros in the current window
        int zeroCount = 0;

        // Stores the maximum possible length
        int maxLen = 0;

        // Left and right pointers of the sliding window
        int s = 0;
        int e = 0;

        // Expand the sliding window
        while (e < n) {
            // Add the current character to the window
            if (A.charAt(e) == '0') {
                zeroCount++;
            }

            // Shrink the window if it contains more than one zero
            while (zeroCount > 1) {
                if (A.charAt(s) == '0') {
                    zeroCount--;
                }

                s++;
            }

            // Calculate the current window length
            int windowLength = e - s + 1;

            // We cannot have more consecutive 1s than totalOnes
            int currentLength = Math.min(windowLength, totalOnes);

            // Update the maximum length
            maxLen = Math.max(maxLen, currentLength);

            // Expand the window
            e++;
        }

        return maxLen;
    }
}
