/*
	Approach

	Number of 1 Bits Using Brian Kernighan's Algorithm

	1. Initialize `count` with `0` to keep track of the number of
	   set bits in `A`.

	2. While `A` is not equal to `0`, perform:
	   
	   A = A & (A - 1)

	   This operation removes the rightmost set bit (`1`) from `A`.

	3. Increment `count` after removing each set bit.

	4. Repeat the process until all set bits are removed and `A`
	   becomes `0`.

	5. Return `count`, which represents the total number of `1` bits
	   present in the binary representation of `A`.

	Complexity Analysis

	Time : O(K)
	       Where `K` is the number of set bits (`1`s) in `A`.
	       The loop runs only once for each set bit.

	Space : O(1)
	        Only a constant amount of extra space is used.
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class NoOf1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int A) {
        int count = 0;

        while (A != 0) {
            A = A & (A - 1);
            count++;
        }

        return count;
    }
}
