/*
	Approach

	Setting Two Bits Using Bitwise OR

	1. To set the bit at position A, create a bit mask by left-shifting
	   1 by A positions:
	   
	   (1 << A)

	2. Similarly, create a bit mask for the bit at position B:
	   
	   (1 << B)

	3. Use the bitwise OR (`|`) operator to combine both masks.
	   This sets the bits at positions A and B to 1.

	4. If a bit is already set, OR operation keeps it set.
	   Therefore, the operation can be written as:

	   (1 << A) | (1 << B)

	5. Return the resulting integer.

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bit position(A): ");
        int A = sc.nextInt();

        System.out.print("Enter the bit position(B): ");
        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }

    public static int solve(int A, int B) {
        return (1 << A) | (1 << B);
    }
}
