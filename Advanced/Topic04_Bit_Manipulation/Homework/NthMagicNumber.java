/*
	Approach

	Find the Nth Magic Number using the binary representation of A.

	1. A Magic Number is formed using powers of 5, where the binary
	   representation of A determines which powers of 5 are included.

	2. Initialize `ans` to 0 to store the Magic Number.

	3. Initialize `power` to 5, which represents 5^1.

	4. While A is greater than 0:
	   
	   - Find the last binary digit of A using `A % 2`.
	   - Remove the last binary digit using `A = A / 2`.
	   - If the binary digit is 1, add the current power of 5 to `ans`.
	   - Move to the next power of 5 by multiplying `power` by 5.

	5. Continue until all binary digits of A have been processed.

	6. Return `ans`.

	Example:
		A = 5

		Binary representation of 5 = 101

		From right to left:

		1 × 5   = 5
		0 × 25  = 0
		1 × 125 = 125

		Magic Number = 5 + 0 + 125 = 130

	Therefore, the 5th Magic Number is 130.

	Complexity Analysis

		Time : O(log A)
		Space : O(1)
*/

package Advanced.Topic04_Bit_Manipulation.Homework;

import java.util.*;
public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int A) {
        int ans = 0;
        int power = 5;

        while(A > 0) {
            int rem = A % 2;
            A = A / 2;

            ans = ans + (rem * power);
            power = power * 5;
        }

        return ans;
    }
}
