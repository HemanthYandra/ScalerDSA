/*
	Approach

	1. Instead of calculating the OR of every subarray, consider
	   each bit position independently.

	2. A bit contributes to the answer if that bit is set in the
	   OR of a subarray.

	3. For each bit position from 0 to 30, count the number of
	   subarrays whose OR has this bit set.

	4. A bit is NOT set in the OR of a subarray only when that bit
	   is 0 in every element of that subarray.

	5. If a consecutive sequence contains `length` elements where
	   the current bit is 0, then the number of subarrays having
	   this bit as 0 is:

	       length * (length + 1) / 2

	6. Total number of subarrays is:

	       N * (N + 1) / 2

	7. Therefore, the number of subarrays where the current bit
	   is set is:

	       totalSubarrays - zeroSubarrays

	8. If a bit is set in `count` subarrays, its contribution to
	   the answer is:

	       count * (2^bit)

	9. Add the contribution of every bit and take modulo
	   10^9 + 7.

	Complexity Analysis

	Time : O(31 * N)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Homework;

import java.util.*;
public class SubarrayOR {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int N = sc.nextInt();

		int[] A = new int[N];

		System.out.println("Enter the array elements: ");
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println(solve(A));

		sc.close();
	}

    public static int solve(int[] A) {

        int N = A.length;
        long MOD = 1000000007L;

        // Total number of possible subarrays
        long totalSubarrays = (long) N * (N + 1) / 2;
        long answer = 0;

        // Check every bit position from 0 to 30
        for(int bit = 0; bit <= 30; bit++) {
            // Number of subarrays in which the current bit is 0
            long zeroSubarrays = 0;

            // Length of the current consecutive sequence
            // where the current bit is 0
            long length = 0;

            // Traverse the array
            for(int i = 0; i < N; i++) {
                // Check whether the current bit is 0
                if((A[i] & (1 << bit)) == 0) {
                    // Extend the consecutive sequence
                    length++;
                } 
                else {
                    // The current bit is 1, so the previous
                    // sequence of zeros has ended.

                    // Number of subarrays inside this sequence
                    zeroSubarrays += length * (length + 1) / 2;

                    // Start a new sequence
                    length = 0;
                }
            }

            // Add the last consecutive sequence of zeros
            zeroSubarrays += length * (length + 1) / 2;

            // Subarrays where the current bit is set
            long setBitSubarrays = totalSubarrays - zeroSubarrays;

            // Value contributed by the current bit
            long contribution = (setBitSubarrays % MOD)
                    * ((1L << bit) % MOD);

            // Add this bit's contribution to the answer
            answer = (answer + contribution) % MOD;
        }

        return (int) answer;
    }
}
