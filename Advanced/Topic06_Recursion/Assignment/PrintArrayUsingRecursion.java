/*
	Approach

	1. We need to print all elements of the array using recursion.

	2. Start recursion from the last index of the array.

	3. The base case is when the index becomes 0.
	   Print the element at index 0 and return.

	4. For every other index, recursively call the function
	   with the previous index.

	5. After the recursive call returns, print the element at
	   the current index.

	6. Since the elements are printed while returning from the
	   recursive calls, they are printed in their original order.

	Complexity Analysis

	Time : O(N)
		Each element of the array is processed once.

	Space : O(N)
		The recursion call stack can contain N calls.
*/

package Advanced.Topic06_Recursion.Assignment;

import java.util.*;
public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        solve(A);

        sc.close();
    }

    public static void solve(int[] A) {
        int N = A.length;

        printArray(A, N - 1);
        System.out.println();
    }

    public static void printArray(int[] A, int idx) {
        // Base case: print the first element and stop recursion
        if(idx == 0) {
            System.out.print(A[idx] + " ");
            return;
        }

        // Recursively process the previous elements
        printArray(A, idx - 1);

        // Print the current element while returning from recursion
        System.out.print(A[idx] + " ");
    }
}
