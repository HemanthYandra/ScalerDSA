/*
	Approach

	1. We need to print all numbers from A to 1 using recursion.

	2. The base case is when A becomes 0.
	   At this point, the recursion stops and a new line is printed.

	3. Print the current value of A before making the recursive call.
	   Therefore, A is printed immediately during the current function call.

	4. Recursively call printArray(A - 1) to reduce A by 1.

	5. The recursive calls continue until A becomes 0.
	   Since each value is printed before the recursive call,
	   the numbers are printed in decreasing order from A to 1.

	Complexity Analysis

	Time : O(A)
		Each number from A to 1 is processed once.

	Space : O(A)
		The recursion call stack can contain A calls.
*/

package Advanced.Topic06_Recursion.Homework;

import java.util.*;
public class PrintAto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int A = sc.nextInt();

        printArray(A);

        sc.close();
    }

    public static void printArray(int A) {
        // Base case: stop recursion when A becomes 0
        if (A == 0) {
            System.out.println();
            return;
        }

        // Print A before making the recursive call
        System.out.print(A + " ");

        // Recursively reduce A until it reaches 0
        printArray(A - 1);
    }
}
