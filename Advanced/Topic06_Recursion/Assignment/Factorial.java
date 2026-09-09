/*
	Approach

	1. The factorial of a number A is defined as:

	   A! = A × (A - 1) × (A - 2) × ... × 1

	2. Use recursion to calculate the factorial by reducing
	   the problem from A to A - 1.

	3. The base case is when A is 0 or 1.
	   The factorial of both 0 and 1 is 1.

	4. For every other value of A, calculate:

	   factorial(A) = factorial(A - 1) × A

	5. The recursive calls continue until the base case is reached.
	   The results are then multiplied while returning from the
	   recursive calls.

	Complexity Analysis

	Time : O(A)
		There are A recursive calls.

	Space : O(A)
		The recursion call stack can contain A calls.
*/

package Advanced.Topic06_Recursion.Assignment;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int A = sc.nextInt();

        System.out.println(factorial(A));

        sc.close();
    }

    public static int factorial(int A) {
        // Base case: factorial of 0 and 1 is 1
        if(A == 0 || A == 1) {
            return 1;
        }

        // Recursively calculate factorial of A - 1
        int ans = factorial(A - 1);

        // Multiply the result by A
        return ans * A;
    }
}