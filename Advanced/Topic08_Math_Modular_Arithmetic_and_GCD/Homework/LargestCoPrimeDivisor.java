/*
	Approach

	1. We need to find the largest divisor of A that is co-prime
	   with B.

	   Two numbers are co-prime when their GCD is 1.

	2. First find the GCD of A and B using the Euclidean Algorithm:

	       gcd(A, B) = gcd(B, A % B)

	3. If gcd(A, B) is already 1, then A itself is co-prime
	   with B, so A is the answer.

	4. If gcd(A, B) is not 1, A and B have at least one common
	   factor.

	   Remove this common factor from A:

	       A = A / gcd(A, B)

	5. Repeat the process until:

	       gcd(A, B) == 1

	   At this point, A has no common factor with B.

	6. Return A as the largest divisor of the original A that
	   is co-prime with B.

	Complexity Analysis

	Time : O(log(min(A, B)) * log A)
	Space : O(log(min(A, B)))
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Homework;

import java.util.*;
public class LargestCoPrimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int result = cpFact(A, B);

        System.out.println(result);

        sc.close();
    }

    public static int gcd(int A, int B) {
        // When B becomes 0, A is the GCD
        if (B == 0) {
            return A;
        }

        // Apply Euclidean Algorithm
        return gcd(B, A % B);
    }

    public static int cpFact(int A, int B) {
        // Remove common factors until A and B become co-prime
        while (gcd(A, B) != 1) {
            A = A / gcd(A, B);
        }

        return A;
    }
}
