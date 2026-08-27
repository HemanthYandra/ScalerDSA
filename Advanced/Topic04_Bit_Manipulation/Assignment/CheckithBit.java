/*
	Approach

	Check Whether the Bth Bit is 1 or 0 Using Bitwise AND

	1. Create a bit mask by left-shifting 1 by B positions:

	   (1 << B)

	2. Perform bitwise AND between A and the mask:

	   A & (1 << B)

	3. The mask has only the Bth bit set to 1.
	   Therefore, the AND operation checks only the Bth bit of A.

	4. If the result is greater than 0, the Bth bit is 1.
	   Return 1.

	5. If the result is 0, the Bth bit is 0.
	   Return 0.

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class CheckithBit {
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

        int result = A & (1 << B);
        
        if(result > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
