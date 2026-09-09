/*
	Approach

	1. The Fibonacci sequence is defined as:

	   F(0) = 0
	   F(1) = 1

	   For every other number:

	   F(A) = F(A - 1) + F(A - 2)

	2. Use recursion to calculate the Fibonacci number by
	   breaking the problem into two smaller subproblems:
	   F(A - 1) and F(A - 2).

	3. The base cases are A = 0 and A = 1.
	   Return 0 for A = 0 and 1 for A = 1.

	4. For every other value of A, recursively calculate
	   F(A - 1) and F(A - 2), then add their results.

	5. The recursion continues until the base cases are reached,
	   and the results are added while returning from the calls.

	Complexity Analysis

	Time : O(2^A)
		Each recursive call creates two more recursive calls,
		resulting in exponential growth.

	Space : O(A)
		The maximum depth of the recursion tree is A.
*/

package Advanced.Topic06_Recursion.Assignment;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int A = sc.nextInt();

        System.out.println(fib(A));

        sc.close();
    }

    public static int fib(int A) {
        // Base case: Fibonacci of 0 is 0
        if(A == 0) {
            return 0;
        }

        // Base case: Fibonacci of 1 is 1
        if(A == 1) {
            return 1;
        }

        // Recursively calculate the previous two Fibonacci numbers
        int a1 = fib(A - 1);
        int a2 = fib(A - 2);

        // Add the two previous Fibonacci numbers
        return a1 + a2;
    }
}
