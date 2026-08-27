/*
	Approach

	Toggling a Bit Using Bitwise XOR

	1. To toggle the bit at position B, create a bit mask by
	   left-shifting 1 by B positions:

	   (1 << B)

	2. Use the bitwise XOR (`^`) operator between A and the mask:

	   A ^ (1 << B)

	3. XOR toggles a bit because:
	   - 0 ^ 1 = 1  → bit changes from 0 to 1.
	   - 1 ^ 1 = 0  → bit changes from 1 to 0.

	4. Therefore, the bit at position B is toggled while all
	   other bits remain unchanged.

	5. Return the resulting integer.

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class Toggle {
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
        return A ^ (1 << B);
    }
}
