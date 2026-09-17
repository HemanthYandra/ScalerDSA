/*
	Approach

	1. We need to remove exactly one element and find the maximum
	   possible GCD of the remaining elements.

	2. Create a prefix GCD array where:

	       prefix[i] = GCD of A[0] to A[i]

	3. Create a suffix GCD array where:

	       suffix[i] = GCD of A[i] to A[N - 1]

	4. If we remove A[i], then the remaining elements are divided
	   into two parts:

	       A[0 ... i - 1]    and    A[i + 1 ... N - 1]

	5. The GCD of all remaining elements is:

	       gcd(prefix[i - 1], suffix[i + 1])

	6. For the first element, there is no prefix, so the GCD is
	   simply suffix[1].

	7. For the last element, there is no suffix, so the GCD is
	   simply prefix[N - 2].

	8. Calculate the GCD after removing every element and keep
	   track of the maximum GCD.

	Complexity Analysis

	Time : O(N log(max(A[i])))
	Space : O(N)
*/

package Advanced.Topic08_Math_Modular_Arithmetic_and_GCD.Homework;

import java.util.*;
public class DeleteOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int result = solve(A);

        System.out.println("Maximum GCD: " + result);

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Build prefix GCD array
        prefix[0] = A[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], A[i]);
        }

        // Build suffix GCD array
        suffix[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], A[i]);
        }

        int ans = 0;

        // Try removing every element
        for(int i = 0; i < n; i++) {
            int currentGCD;

            if(i == 0) {
                // Remove the first element
                currentGCD = suffix[1];
            } else if(i == n - 1) {
                // Remove the last element
                currentGCD = prefix[n - 2];
            } else {
                // Remove an element from the middle
                currentGCD = gcd(prefix[i - 1], suffix[i + 1]);
            }

            // Update maximum GCD
            ans = Math.max(ans, currentGCD);
        }

        return ans;
    }

    // Function to find GCD using Euclidean Algorithm
    public static int gcd(int A, int B) {
        if(B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
