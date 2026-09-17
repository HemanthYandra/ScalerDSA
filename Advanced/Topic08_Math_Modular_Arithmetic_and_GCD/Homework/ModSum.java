/*
	Approach

	1. We need to calculate:

	       A[i] % A[j]

	   for every possible pair (i, j).

	2. The array length can be up to 10^5, so checking every
	   pair directly would take O(N^2), which is too slow.

	3. The important constraint is that every A[i] is at most 10^3.

	4. Create a frequency array "freq" where:

	       freq[x] = number of times x occurs in A.

	5. Now consider two values x and y.

	   If x occurs freq[x] times and y occurs freq[y] times,
	   then there are:

	       freq[x] * freq[y]

	   pairs having x as A[i] and y as A[j].

	6. Every such pair contributes:

	       x % y

	   Therefore, the total contribution is:

	       freq[x] * freq[y] * (x % y)

	7. Iterate x and y from 1 to 1000 and add their contribution
	   to the answer.

	8. Take modulo 10^9 + 7 while calculating the answer to
	   prevent overflow.

	9. Since x % x = 0, pairs where both values are the same
	   automatically contribute 0.

	Complexity Analysis

	Time : O(N + M^2)
	Space : O(M)

	Where M = 1000, the maximum possible value in A.
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Homework;

import java.util.*;
public class ModSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int result = solve(A);

        System.out.println("Sum: " + result);

        sc.close();
    }

    public static int solve(int[] A) {
        int MOD = 1000000007;
        int M = 1000;

        // Store the frequency of each value
        long[] freq = new long[M + 1];

        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;
        }

        long sum = 0;

        // Consider every possible value of A[i] and A[j]
        for (int x = 1; x <= M; x++) {

            if (freq[x] == 0) {
                continue;
            }

            for (int y = 1; y <= M; y++) {

                if (freq[y] == 0) {
                    continue;
                }

                // Contribution of all pairs with values x and y
                long contribution = freq[x] * freq[y] * (x % y);

                sum = (sum + contribution) % MOD;
            }
        }

        return (int) sum;
    }
}
