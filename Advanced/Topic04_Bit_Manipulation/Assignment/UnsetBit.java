/*
	Approach

	Unsetting the Bth Bit Using Bitwise AND

	1. Create a bit mask by left-shifting 1 by B positions:

	   (1 << B)

	   This creates a number where only the Bth bit is 1.

	2. Apply the bitwise NOT (`~`) operator to the mask:

	   ~(1 << B)

	   This changes the Bth bit to 0 and all other bits to 1.

	3. Perform bitwise AND between A and the inverted mask:

	   A & ~(1 << B)

	4. The AND operation forces the Bth bit of A to 0 while
	   keeping all other bits unchanged.

	5. Return the resulting integer.

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class UnsetBit {
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
        return A & ~(1 << B);
    }
}
