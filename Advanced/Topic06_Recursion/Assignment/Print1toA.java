/*
	Approach

	1. We need to print all numbers from 1 to A using recursion.

	2. The base case is when A becomes 0.
	   At this point, there are no more numbers to print.

	3. Before printing A, recursively call the function with A - 1.

	4. The recursive calls continue until A becomes 0.

	5. While returning from the recursive calls, print A.
	   This prints the numbers in increasing order from 1 to A.

	Complexity Analysis

	Time : O(A)
		Each number from 1 to A is processed once.

	Space : O(A)
		The recursion call stack can contain A calls.
*/

package Advanced.Topic06_Recursion.Assignment;

import java.util.*;
public class Print1toA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int A = sc.nextInt();

        solve(A);

        sc.close();
    }

    public static void solve(int A) {
        printArray(A);
        System.out.println();
    }

    public static void printArray(int A) {
        // Base case: stop when A becomes 0
        if(A == 0) {
            return;
        }

        // Recursively process numbers from A - 1 to 1
        printArray(A - 1);

        // Print A while returning from the recursive calls
        System.out.print(A + " ");
    }
}
