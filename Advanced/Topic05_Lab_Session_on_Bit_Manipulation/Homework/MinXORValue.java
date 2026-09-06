/*
	Approach

	1. Sort the array in ascending order.

	2. After sorting, the minimum XOR value will always be
	   obtained from two adjacent elements.

	3. For every adjacent pair, calculate their XOR value.

	4. Keep track of the minimum XOR value found.

	5. Return the minimum XOR value.

	Complexity Analysis

	Time : O(N log N)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Homework;

import java.util.*;
public class MinXORValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int[] A) {
        // Sort the array so that elements with similar
        // values are placed next to each other
        Arrays.sort(A);

        // Initialize minimum XOR with the maximum possible value
        int minXOR = Integer.MAX_VALUE;

        // Check XOR of every pair of adjacent elements
        for(int i = 0; i < A.length - 1; i++) {

            // Calculate XOR of the current adjacent pair
            int xor = A[i] ^ A[i + 1];

            // Update minimum XOR if the current value is smaller
            minXOR = Math.min(minXOR, xor);
        }

        return minXOR;
    }
}
