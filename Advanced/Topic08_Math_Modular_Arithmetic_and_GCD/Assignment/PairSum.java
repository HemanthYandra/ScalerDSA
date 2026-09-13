/*
	Approach

	1. We need to count the number of pairs (i, j) such that:

	       (A[i] + A[j]) % B == 0

	2. Instead of checking every pair, calculate the remainder of
	   each element when divided by B.

	       val = A[i] % B

	3. For the sum of two numbers to be divisible by B, their
	   remainders must add up to B or be both 0.

	   For example, if:

	       val = 3
	       B = 5

	   then the required remainder is:

	       pair = 5 - 3 = 2

	   because:

	       3 + 2 = 5
	       5 % 5 = 0

	4. For every element, find the remainder required to form a
	   divisible pair.

	   If val is 0, the required remainder is also 0.

	   Otherwise:

	       pair = B - val

	5. Use a frequency array "freq" to store how many previously
	   seen elements have each remainder.

	6. Before adding the current element to freq, add freq[pair]
	   to the answer.

	   This ensures that every pair is counted only once because
	   we only pair the current element with elements that appeared
	   before it.

	7. Take % MOD while calculating the answer because the number
	   of pairs can be very large.

	   MOD = 1000000007

	8. Use long for count because the number of pairs can exceed
	   the int range.

	Complexity Analysis

	Time : O(N)
	Space : O(B)
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Assignment;

import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int result = solve(A, B);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A, int B) {
        // Store the frequency of each remainder
        int[] freq = new int[B];
        long count = 0;
        int MOD = 1000000007;

        for(int i = 0; i < A.length; i++) {
            // Find the remainder of the current element
            int val = A[i] % B;
            int pair;

            // Remainder 0 needs another remainder 0
            if(val == 0) {
                pair = 0;
            } else {
                // Find the remainder needed to make the sum divisible by B
                pair = B - val;
            }

            // Add previously seen elements having the required remainder
            count = (count + freq[pair]) % MOD;

            // Store the current element's remainder
            freq[val]++;
        }

        return (int) count;
    }
}
