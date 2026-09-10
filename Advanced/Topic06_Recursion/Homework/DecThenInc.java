/*
	Approach

	1. We need to print the numbers from A to 1 and then from
	   1 to A using recursion.

	2. The base case is when A becomes 0.
	   At this point, there are no more numbers to process,
	   so return from the helper function.

	3. Print A before making the recursive call.
	   This prints the numbers in decreasing order from A to 1.

	4. Recursively call helper(A - 1) to reduce A by 1.
	   The helper function continues until A becomes 0.

	5. After the recursive call returns, print A again.
	   Since the recursive calls return from 1 back to A,
	   this prints the numbers in increasing order from 1 to A.

	6. The decThenInc() method starts the recursive process
	   by calling helper(A).

	7. After the complete recursive process finishes,
	   print a new line.

	Complexity Analysis

	Time : O(A)
		Each number from A to 1 is processed once during the
		forward calls and once during the return calls.

	Space : O(A)
		The recursion call stack can contain A calls.
*/

package Advanced.Topic06_Recursion.Homework;

import java.util.*;

public class DecThenInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Positive Number: ");
        int A = sc.nextInt();

        decThenInc(A);

        sc.close();
    }

    public static void decThenInc(int A) {
        // Start the recursive process
        helper(A);

        // Print a new line after the complete output
        System.out.println();
    }

    private static void helper(int A) {
        // Base case: stop recursion when A becomes 0
        if (A == 0) {
            return;
        }

        // Print A before recursion to get decreasing order
        System.out.print(A + " ");

        // Recursively reduce A until it reaches 0
        helper(A - 1);

        // Print A while returning from recursion to get increasing order
        System.out.print(A + " ");
    }
}