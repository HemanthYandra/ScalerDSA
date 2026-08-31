/*
	Approach

	1. We need to find the maximum value of:

	   `A[i] & A[j]`

	   for any two distinct elements `i` and `j`.

	2. Instead of checking every pair, construct the answer bit by bit
	   from the most significant bit (MSB) to the least significant bit
	   (LSB).

	3. Maintain a variable `result` which stores the bits that are
	   already confirmed to be part of the maximum AND value.

	4. For every bit position `i` from 31 down to 0, create a
	   temporary value called `candidate`:

	   `candidate = result | (1 << i)`

	   Here, `1 << i` creates a number in which only the `i`th bit
	   is set.

	   The bitwise OR with `result` means that we are temporarily
	   adding the current bit to the answer.

	   For example:

	   `result = 0100`
	   `1 << 1 = 0010`

	   Therefore:

	   `candidate = 0100 | 0010`
	              `= 0110`

	   So, `candidate` represents the answer we would get if the
	   current bit can be included.

	5. Now check whether at least two elements in the array contain
	   all the bits present in `candidate`.

	   For every element `A[j]`, use:

	   `(A[j] & candidate) == candidate`

	   If this condition is true, it means `A[j]` contains every bit
	   that is set in `candidate`.

	   For example, if:

	   `candidate = 0110`
	   `A[j]     = 1110`

	   then:

	   `1110 & 0110 = 0110`

	   Since the result is equal to `candidate`, `A[j]` contains all
	   the required bits.

	6. Count how many elements satisfy this condition.

	   If at least two elements satisfy it, then those two elements
	   can have all the bits of `candidate` set in their AND.

	   Therefore, the current bit can safely be included:

	   `result = candidate`

	7. If fewer than two elements satisfy the condition, then no pair
	   can have all the bits of `candidate` set simultaneously.

	   Therefore, discard the current bit and keep `result` unchanged.

	8. We process bits from MSB to LSB because higher bits contribute
	   more to the value of the answer.

	   For example:

	   `1000 = 8`
	   `0100 = 4`
	   `0010 = 2`
	   `0001 = 1`

	   So, if the highest bit can be included, it is always better
	   to keep it than to replace it with any combination of lower bits.

	9. By greedily trying every bit from 31 down to 0 and keeping a bit
	   only when at least two elements can support it, `result` becomes
	   the maximum possible AND value of any pair.

	Complexity Analysis

	Time : O(32 * N) = O(N)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Assignment;

import java.util.*;
public class MaxANDPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        // Stores the maximum AND value found so far
        int result = 0;

        for(int i = 31; i >= 0; i--) {
            // Tentatively include the current bit
            int candidate = result | (1 << i);

            // Count elements that contain all bits of candidate
            int count = 0;

            for(int j = 0; j < n; j++) {
                // Check whether A[j] contains every bit of candidate
                if((A[j] & candidate) == candidate) {
                    count++;
                }
                // We only need to know whether at least two exist
                if(count >= 2)
                    break;
            }

            // If at least two elements contain candidate,
            // this bit can be included in the answer
            if(count >= 2) {
                result = candidate;
            }
        }

        return result;
    }
}
