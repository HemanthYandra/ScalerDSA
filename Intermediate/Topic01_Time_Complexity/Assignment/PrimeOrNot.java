/*
	Approach

	1. A prime number has exactly two factors:
	   1 and the number itself.

	2. If A is less than or equal to 1, it is not
	   a prime number.

	3. To count the factors efficiently, iterate from
	   1 to sqrt(A).

	4. If i divides A:
	   - i is one factor.
	   - A / i is another factor.

	5. If i == A / i, both factors are the same.
	   This happens when A is a perfect square, so
	   count it only once.

	6. Otherwise, count both i and A / i.

	7. After counting all factors:
	   - If the count is 2, A is prime.
	   - Otherwise, A is not prime.

	Complexity Analysis

	Time : O(sqrt(N))
		- The loop runs from 1 to sqrt(A).
		- Therefore, the time complexity is O(sqrt(N)).

	Space : O(1)
		- Only a few variables are used.
		- No additional data structure is required.
*/

package Intermediate.Topic01_Time_Complexity.Assignment;

import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");

        int A = sc.nextInt();

        // Numbers less than or equal to 1 are not prime
        if (A <= 1) {
            System.out.println(A + " is not a Prime Number.");
        } 
        // A prime number has exactly two factors
        else if (factors(A) == 2) {
            System.out.println(A + " is a Prime Number.");
        } else {
            System.out.println(A + " is not a Prime Number.");
        }

        sc.close();
    }

    public static int factors(int A) {
        int c = 0;

        // Check factors only up to sqrt(A)
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                // If i and A / i are the same factor,
                // count it only once
                if (i == A / i) {
                    c++;
                } else {
                    // Count both i and A / i as factors
                    c += 2;
                }
            }
        }

        return c;
    }
}
