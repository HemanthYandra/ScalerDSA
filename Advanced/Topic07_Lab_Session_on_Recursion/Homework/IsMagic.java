/*
	Approach

	1. A number is a Magic Number if repeatedly adding its digits
	   eventually results in 1.

	2. If the number becomes a single digit:
	   - Return 1 if the digit is 1.
	   - Otherwise, return 0.

	3. For a number having multiple digits, calculate the sum of
	   its digits using a loop.

	4. Recursively call solve() with the digit sum.

	5. The recursion continues until the number becomes a
	   single digit.

	Complexity Analysis

	Time : O(log A)
	       At each recursive step, we process the digits of A.
	       The number of digits is O(log A).

	Space : O(log A)
	        The recursion depth depends on the number of times
	        the digit sum operation is performed.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Homework;

import java.util.*;

public class IsMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int A = sc.nextInt();

        int ans = solve(A);

        System.out.println(ans);

        sc.close();
    }

    public static int solve(int A) {

        // Base case: if A is a single digit, check whether it is 1
        if(A < 10) {
            return (A == 1) ? 1 : 0;
        }

        int digit_sum = 0;

        // Calculate the sum of all digits of A
        while(A > 0) {
            digit_sum += A % 10;
            A /= 10;
        }

        // Recursively check whether the digit sum eventually becomes 1
        return solve(digit_sum);
    }
}
