/*
	Approach

	1. We need to calculate (A^B) % C efficiently.

	2. Instead of multiplying A, B times, use Binary Exponentiation.
	   This reduces the exponent by half in every recursive call.

	3. Base case:
	   - If B is 0, the answer is 1 % C.
	   This represents A^0 % C.

	4. Handle negative A by first taking A % C and then adding C
	   if the result is negative.

	5. Recursively calculate:

	       pow(A, B / 2, C)

	   This gives the result for half of the exponent.

	6. Square the recursive result and take modulo C:

	       (ans * ans) % C

	   Taking % C here keeps the intermediate value small.

	7. If B is even, the squared result is the final answer.

	   If B is odd, we need to multiply the squared result by A:

	       ((ans * ans) % C * A) % C

	   Here % C is used twice:
	   - The first % C reduces the squared value before multiplying
	     it by A.
	   - The second % C gives the modulo of the final result.

	   This is valid because:

	       ((X % C) * Y) % C = (X * Y) % C

	   Therefore, applying % C in between does not change the
	   final answer and also keeps intermediate values smaller.

	8. Since multiplication can exceed the int range, use long
	   for intermediate calculations.

	Complexity Analysis

	Time : O(log B)
	Space : O(log B)
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Assignment;

import java.util.*;
public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        System.out.print("Enter C: ");
        int C = sc.nextInt();

        int result = pow(A, B, C);

        System.out.println(result);

        sc.close();
    }

    public static int pow(int A, int B, int C) {
        // A^0 % C = 1 % C
        if(B == 0)
            return 1 % C;

        // Handle negative A
        A = A % C;
        if(A < 0) {
            A = A + C;
        }

        // Calculate power for half of B
        long ans = pow(A, B / 2, C);

        // Calculate result when B is even
        long ifEven = (ans * ans) % C;

        // Calculate result when B is odd
        long ifOdd = ((ans * ans) % C * A) % C;

        if(B % 2 == 0) {
            return (int) ifEven;
        } else {
            return (int) ifOdd;
        }
    }
}
