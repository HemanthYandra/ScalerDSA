/*
	Approach

	Version 1:

	1. Initialize a counter c to 0.

	2. Traverse all numbers from 1 to A.

	3. For every number i, check whether A is divisible
	   by i using:

	   A % i == 0

	4. If A is divisible by i, then i is a factor of A,
	   so increment the counter.

	5. After checking all numbers from 1 to A, return
	   the total count of factors.


	Complexity Analysis

	Time : O(N)
		- The loop runs from 1 to A.
		- Each iteration performs a constant-time
		  divisibility check.

	Space : O(1)
		- Only the counter and loop variable are used.


	Version 2:

	1. Initialize a counter c to 0.

	2. Traverse only up to the square root of A.

	3. If A is divisible by i, then both i and A / i
	   are factors of A.

	4. If i and A / i are different, add 2 to the count.

	5. If i == A / i, then i is the square root of A,
	   so it represents only one factor. Add 1 instead.

	6. After checking all possible factors up to the
	   square root of A, return the total count.


	Complexity Analysis

	Time : O(sqrt(N))
		- The loop runs only up to sqrt(A).
		- Each iteration performs a constant-time
		  divisibility check.

	Space : O(1)
		- Only the counter and loop variable are used.
*/

package Intermediate.Topic01_Time_Complexity.Assignment;

import java.util.*;

public class CountOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");

        int A = sc.nextInt();
        
        System.out.println(v1(A));

        sc.close();
    }

    // Version 2 - Optimised Approach
    public static int v2(int A) {
        int c = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                // Perfect square: count the factor only once
                if(i == A / i) {
                    c++;
                }
                else {
                    // Count both i and A / i
                    c += 2;
                }
            }
        }

        return c;
    }

    // Version 1 - Brute Force Approach
    public static int v1(int A) {
        int c = 0;
        for(int i = 1; i <= A; i++) {
            if(A % i == 0) {
                c++;
            }
        }

        return c;
    }
}
