/*
	Approach

	1. Use the Boyer-Moore Voting Algorithm to find a
	   potential majority element.

	2. Maintain two variables:
	   - candidate stores the current majority candidate.
	   - c stores the candidate's current count.

	3. Traverse the array:
	   - If c becomes 0, select the current element as
	     the new candidate.
	   - If the current element equals candidate, increment c.
	   - Otherwise, decrement c.

	4. After the first traversal, candidate is only a
	   potential majority element.

	5. Traverse the array again and count the actual
	   occurrences of candidate.

	6. If the candidate occurs more than N / 2 times,
	   return candidate.

	7. Otherwise, return -1 because no majority element
	   exists.


	Complexity Analysis

	Time : O(N)
		- The array is traversed twice.
		- Each traversal takes O(N), so the overall
		  complexity remains O(N).

	Space : O(1)
		- Only a few variables are used.
*/

package Intermediate.Topic12_Problem_Solving_Session_1;

import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(solve(nums));

        sc.close();
    }

    public static int solve(int[] nums) {
        int n = nums.length;
        int c = 0;
        int candidate = 0;

        // Find the potential majority element
        for(int i = 0; i < n; i++) {
            if(c == 0) {
                candidate = nums[i];
            }
            if(nums[i] == candidate) {
                c++;
            }
            else {
                c--;
            }
        }

        // Count occurrences of the candidate
        int candidateCount = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == candidate) {
                candidateCount++;
            }
        }

        // Verify whether the candidate is actually
        // a majority element
        if(candidateCount > n / 2) {
            return candidate;
        }
        else {
            return -1;
        }
    }
}
