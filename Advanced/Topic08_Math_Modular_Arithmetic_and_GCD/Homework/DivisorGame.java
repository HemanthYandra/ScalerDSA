/*
	Approach

	1. We need to find the number of positive integers less than
	   or equal to A that are divisible by both B and C.

	2. A number divisible by both B and C must be a multiple of
	   the LCM (Least Common Multiple) of B and C.

	3. First, find the GCD (Greatest Common Divisor) of B and C
	   using the Euclidean Algorithm.

	4. Calculate the LCM using:

	       LCM(B, C) = (B / GCD(B, C)) * C

	   We divide B by GCD first to reduce the possibility of
	   integer overflow before multiplying by C.

	5. All positive multiples of LCM that are less than or equal
	   to A are:

	       LCM, 2 * LCM, 3 * LCM, ...

	6. Therefore, the number of such multiples is:

	       A / LCM

	7. Return A / LCM as the answer.

	Complexity Analysis

	Time : O(log(min(B, C)))
	Space : O(1)
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Homework;

import java.util.*;
public class DivisorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        System.out.print("Enter C: ");
        int C = sc.nextInt();

        int result = solve(A, B, C);

        System.out.println("Count: " + result);

        sc.close();
    }

    public static int solve(int A, int B, int C) {

        // Find GCD of B and C
        long g = gcd(B, C);

        // Find LCM of B and C
        long lcm = (B / g) * C;

        // Count multiples of LCM less than or equal to A
        return (int) (A / lcm);
    }

    public static long gcd(long B, long C) {
        if (C == 0) {
            return B;
        }

        return gcd(C, B % C);
    }
}
