/*
	Approach:

	1. Create a boolean array of size N + 1.
	   Each index represents whether a natural number is present in A.
	   For example, flag[0] represents 1, flag[1] represents 2, and so on.

	2. Traverse the given array.
	   Ignore all numbers that are less than 1 or greater than N,
	   because they cannot be the first missing natural number.

	3. For every valid number A[i], mark it as present using:
		flag[A[i] - 1] = true;

	4. Traverse the flag array to find the first false value.
	   If flag[i] is false, then the natural number i + 1 is missing.

	5. If all numbers from 1 to N are present, then the first missing
	   natural number is N + 1.

	Complexity Analysis:

	Time : O(N)
		The array is traversed once to mark the numbers and once to find
		the first missing number. Therefore, the overall time complexity is O(N).

	Space : O(N)
		A boolean array of size N + 1 is used to store whether each natural
		number from 1 to N is present.
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Assignment;

import java.util.*;
public class FirstMissingNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int ans = solve(A);

        System.out.println(ans);

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        // Stores whether each natural number from 1 to N is present
        boolean[] flag = new boolean[n + 1];

        // Mark all valid natural numbers present in the array
        for(int i = 0; i < n; i++) {
            // Ignore negative numbers, zero, and numbers greater than N
            if(A[i] < 1 || A[i] > n) {
                continue;
            }
  
            // A[i] is present, so mark its corresponding index as true
            flag[A[i] - 1] = true;
        }

        // Find the first natural number that is not present
        for(int i = 0; i < flag.length; i++) {
            if(flag[i] == false) {
                return i + 1;
            }
        }

        // If all numbers from 1 to N are present, N + 1 is missing
        return n + 1;
    }
}
