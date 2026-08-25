/*
	Approach

	1. Initialize a variable `xor` with 0.

	2. Traverse every element of the array and perform XOR with `xor`.

	3. XOR has the following properties:
	   - x ^ x = 0
	   - x ^ 0 = x
	   - XOR is commutative and associative.

	4. Since every element except one occurs exactly twice, the
	   duplicate elements cancel each other:
	   
	   a ^ a = 0

	5. The only element that does not have a duplicate remains
	   in `xor`.

	6. Return `xor` as the unique element.

	Complexity Analysis

	Time : O(N)
		Traverse the array once.

	Space : O(1)
		Only one extra variable `xor` is used.
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int[] A) {

        // Initialize with 0 because 0 is the identity value for XOR:
        // 0 ^ x = x, so it does not affect the first element
        int xor = 0;

        // XOR all elements; duplicate elements cancel each other
        for(int i = 0; i < A.length; i++) {
            xor = xor ^ A[i];
        }

        return xor;
    }
}
