/*
	Approach

	1. Since we need elements occurring more than N / 3 times,
	   there can be at most two such elements.

	2. Use the extended Boyer-Moore Voting Algorithm to find
	   two possible candidates.

	3. Maintain two candidates and their counts:
	   - candidate1 with count c1
	   - candidate2 with count c2

	4. Traverse the array:
	   - If c1 is 0 and the current element is not candidate2,
	     make it candidate1.
	   - Otherwise, if c2 is 0 and the current element is not
	     candidate1, make it candidate2.
	   - If the current element matches candidate1, increment c1.
	   - Else if it matches candidate2, increment c2.
	   - Otherwise, decrement both counts.

	5. The first traversal only finds possible candidates.
	   They are not guaranteed to occur more than N / 3 times.

	6. Traverse the array again and count the actual occurrences
	   of both candidates.

	7. If candidate1 occurs more than N / 3 times, add it to
	   the result.

	8. If candidate2 occurs more than N / 3 times, add it to
	   the result.

	9. Convert the result ArrayList into an integer array
	   and return it.


	Complexity Analysis

	Time : O(N)
		- The array is traversed twice.
		- Each traversal takes O(N), so the overall complexity
		  remains O(N).

	Space : O(1)
		- Only a constant number of variables are used.
		- The returned result contains at most two elements.
*/

package Intermediate.Topic12_Problem_Solving_Session_1;

import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solve(nums);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[] nums) {
        int n = nums.length;
        int c1 = 0;
        int candidate1 = 0;
        int c2 = 0;
        int candidate2 = 0;

        // Find two possible candidates
        for(int i = 0; i < n; i++) {
            if(c1 == 0 && nums[i] != candidate2) {
                candidate1 = nums[i];
            }
            else if(c2 == 0 && nums[i] != candidate1) {
                candidate2 = nums[i];
            }
            
            if(nums[i] == candidate1) {
                c1++;
            }
            else if(nums[i] == candidate2) {
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }

        // Count the actual occurrences of both candidates
        int countCandidate1 = 0;
        int countCandidate2 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == candidate1) {
                countCandidate1++;
            }
            else if(nums[i] == candidate2) {
                countCandidate2++;
            }
        }

        // Verify candidates
        ArrayList<Integer> result = new ArrayList<>();

        if (countCandidate1 > n / 3) {
            result.add(candidate1);
        }

        if (countCandidate2 > n / 3) {
            result.add(candidate2);
        }

        // Convert ArrayList to int[]
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
