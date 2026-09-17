/*
	Approach

	1. We need to find the greatest positive integer M such that:

	       A % M = B % M

	2. If the remainders are equal, subtracting the two equations
	   gives:

	       A - B = k * M

	   Therefore, M must divide (A - B).

	3. Since M must be positive, it must divide |A - B|.

	4. The greatest positive divisor of |A - B| is |A - B| itself.

	5. Therefore, the answer is:

	       |A - B|

	Example:

	       A = 5, B = 10

	       |A - B| = |5 - 10| = 5

	       5 % 5 = 0
	       10 % 5 = 0

	       Therefore, the answer is 5.

	Complexity Analysis

	Time : O(1)
	Space : O(1)
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Homework;

import java.util.*;
public class ABandMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int result = solve(A, B);

        System.out.println("Greatest M: " + result);

        sc.close();
    }

    public static int solve(int A, int B) {

        // Greatest possible M is the absolute difference
        return Math.abs(A - B);
    }
}
