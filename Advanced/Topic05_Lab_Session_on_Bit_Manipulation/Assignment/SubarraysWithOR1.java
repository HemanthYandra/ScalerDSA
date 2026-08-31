/*
	Approach

	1. A subarray has OR equal to `1` if it contains at least one `1`.

	2. Therefore, instead of directly counting subarrays with OR = 1,
	   calculate:

	   `Answer = Total Subarrays - Subarrays Containing Only 0s`

	3. The total number of subarrays in an array of size `n` is:

	   `n * (n + 1) / 2`

	4. Maintain `zeroCount` as the length of the current consecutive
	   zero sequence.

	5. Whenever a zero is encountered, increment `zeroCount`.

	   Every new zero creates exactly `zeroCount` new all-zero
	   subarrays ending at the current position.

	   For example, for `[0, 0, 0]`:

	   - First 0 -> 1 subarray
	   - Second 0 -> 2 new subarrays
	   - Third 0 -> 3 new subarrays

	   Total = 1 + 2 + 3 = 6

	6. Whenever a `1` is encountered, the current consecutive-zero
	   sequence ends, so reset `zeroCount` to `0`.

	7. Finally, subtract the number of all-zero subarrays from the
	   total number of subarrays.

	Complexity Analysis

	Time : O(N)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Assignment;

import java.util.*;
public class SubarraysWithOR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the binary array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        // Total number of subarrays
        int total = n * (n + 1) / 2;

        // Number of subarrays containing only 0s
        int zeroSubarrays = 0;

        // Length of the current consecutive-zero sequence
        int zeroCount = 0;

        for(int i = 0; i < n; i++) {
            if (A[i] == 0) {
                // Extend the current consecutive-zero sequence
                zeroCount++;

                // Every zero creates `zeroCount` new all-zero subarrays
                // ending at the current index.
                zeroSubarrays += zeroCount;
            } else {
                // A 1 breaks the consecutive-zero sequence
                zeroCount = 0;
            }
        }

        // Remove all-zero subarrays to get subarrays with OR = 1
        return total - zeroSubarrays;
    }
}
