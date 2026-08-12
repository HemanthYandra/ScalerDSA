/*
	Approach

	1. Count the total number of 1s present in the array.

	2. If all elements are already 1, return N because
	   the entire array consists of consecutive ones.

	3. Traverse the array and consider every 0 as the
	   element that can be changed to 1.

	4. For each 0:
	   - Count consecutive 1s on its left.
	   - Count consecutive 1s on its right.

	5. Combining the left ones, the current zero, and the
	   right ones gives the length of the possible window.

	6. Since we can flip only one zero, if there are other
	   zeros in the array, the current zero can be replaced
	   by a 1 while keeping the other elements unchanged.

	7. The maximum possible length cannot exceed the total
	   number of 1s in the array.

	8. Therefore, take the minimum of:
	   - left + right + 1
	   - totalOnes

	9. Return the maximum length found.


	Complexity Analysis

	Time : O(N²)
		- For every zero, we may traverse consecutive 1s
		  on both its left and right.
		- In the worst case, this can take O(N) for each
		  zero.

	Space : O(1)
		- Only a few variables are used.
    
    Note: We can do this in O(N) using sliding window.
	      Go here for the solution: 
	      Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Variable_Sliding_Window;
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Additional_Questions;

import java.util.*;
public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
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

                // Include the current zero by flipping it to 1
                int len = l + r + 1;

                // We cannot have more 1s than totalOnes
                len = Math.min(len, totalOnes);

                // Update the maximum length
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
