/*
	Approach

	1. We need to find the Greatest Common Divisor (GCD) of A and B.

	2. Use the Euclidean Algorithm based on the property:

	       GCD(A, B) = GCD(B, A % B)

	3. Find the remainder when A is divided by B:

	       A % B

	   Then recursively find the GCD of B and this remainder.

	4. The remainder keeps becoming smaller with every recursive
	   call, so the problem gets reduced at each step.

	5. Base case:
	   - When B becomes 0, A is the GCD.
	   
	       GCD(A, 0) = A

	6. Return A when B is 0. Otherwise, recursively call:

	       gcd(B, A % B)

	Complexity Analysis

	Time : O(log(min(A, B)))
	Space : O(log(min(A, B)))
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Assignment;

import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int result = gcd(A, B);

        System.out.println(result);

        sc.close();
    }

    public static int gcd(int A, int B) {
        // When B becomes 0, A is the GCD
        if (B == 0)
            return A;

        // Apply Euclidean Algorithm
        return gcd(B, A % B);
    }
}
