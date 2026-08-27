/*
	Approach

	Unset the first B bits from the right side of A.

	1. The rightmost bit is at position 0, the next bit is at position 1,
	   and so on.

	2. Iterate from bit position 0 up to B - 1.

	3. For each bit position i, create a mask using:
	   
	   (1 << i)

	   This mask has only the ith bit set to 1.

	4. Apply the NOT operator to the mask:
	   
	   ~(1 << i)

	   This creates a mask where the ith bit is 0 and all other bits
	   are 1.

	5. Perform AND between A and the mask:
	   
	   A = A & ~(1 << i)

	   This clears (unsets) the ith bit of A while keeping all other
	   bits unchanged.

	6. Repeat this for the first B bits from the right.

	7. Return the modified value of A.

	Example:
		A = 13
		B = 2

		Binary representation:
		1101

		Unset bit 0:
		1101 → 1100

		Unset bit 1:
		1100 → 1100

		Result = 12

	Complexity Analysis

		Time : O(B)
		Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Homework;

import java.util.*;
public class UnsetXBitsFromRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number(A): ");
        int A = sc.nextInt();

        System.out.print("Enter the bit position(B): ");
        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }

    public static int solve(int A, int B) {
        for(int i = 0; i < B; i++) {
            A = A & ~(1 << i);
        }

        return A;
    }
}
