/*
	Approach

	1. We need to calculate A^B using recursion.

	2. Instead of calculating A^B by multiplying A, B times,
	   we divide the exponent B by 2 in every recursive call.
	   This reduces the number of recursive calls significantly.

	3. First, recursively calculate:
	   
	       A^(B/2)

	   and store the result in "ans".

	4. If B is even:
	   
	       A^B = A^(B/2) * A^(B/2)
	           = ans * ans

	5. If B is odd:
	   
	       A^B = A^(B/2) * A^(B/2) * A
	           = ans * ans * A

	   We multiply by one extra A because one power of A
	   remains when B is odd.

	6. The base case is B == 0.
	   Any number raised to the power 0 is 1.

	Complexity Analysis

	Time : O(log B)
        The exponent is divided by 2 in every recursive call,
        so there are O(log B) recursive calls.

	Space : O(log B)
	    The recursion stack also requires O(log B) space.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Assignment;

import java.util.*;
public class FastPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the positive integer(A): ");
        int A = sc.nextInt();

        System.out.print("Enter the positive integer(B): ");
        int B = sc.nextInt();

        System.out.println(power(A, B));

        sc.close();
    }

    public static long power(int A, int B) {
        // Base case: A^0 = 1
        if (B == 0) {
            return 1;
        }

        // Recursively calculate A^(B/2)
        long ans = power(A, B / 2);

        // If B is odd, multiply by one extra A
        // If B is even, simply square the result
        if (B % 2 != 0) {
            return ans * ans * A;
        } else {
            return ans * ans;
        }
    }
}
