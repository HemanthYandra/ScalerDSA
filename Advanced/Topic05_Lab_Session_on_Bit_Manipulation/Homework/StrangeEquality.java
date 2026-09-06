/*
	Approach

	1. The condition:

	       X ^ A = X + A

	   is true when adding X and A produces no carry.

	2. A carry occurs when both X and A have a set bit at
	   the same position.

	   Therefore:

	       X & A = 0

	3. To find X, we need the greatest number smaller than A
	   whose set bits do not overlap with A.

	4. Let the highest set bit of A be at position k.

	   X can have only bits from 0 to k - 1 because X < A.

	   Create a mask having all bits below k as 1.

	   Then set only those bits which are 0 in A:

	       X = mask & ~A

	5. To find Y, we need the smallest number greater than A
	   whose set bits do not overlap with A.

	   The smallest possible number is obtained by setting the
	   bit immediately above the highest set bit of A.

	   Therefore:

	       Y = 1 << (k + 1)

	6. Finally, return:

	       X ^ Y

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Homework;

import java.util.*;

public class StrangeEquality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int A) {
        // Find the position of the highest set bit
        int k = 31 - Integer.numberOfLeadingZeros(A);

        // Create a mask with all bits below the highest
        // set bit as 1
        int mask = (1 << k) - 1;

        // Find X by selecting only the bits that are 0 in A
        int X = mask & ~A;

        // Set the bit immediately above the highest set bit
        int Y = 1 << (k + 1);

        // Return XOR of X and Y
        return X ^ Y;
    }
}