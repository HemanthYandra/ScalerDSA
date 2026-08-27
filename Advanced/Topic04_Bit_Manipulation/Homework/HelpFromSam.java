/*
	Approach

	Count the number of set bits (1s) in the binary representation of A
	using Brian Kernighan's Algorithm.

	1. The minimum number of times Alex needs help from Sam is equal to
	   the number of set bits in the binary representation of A.

	2. Initialize `count` to 0.

	3. While A is not zero, perform:
	   
	   A = A & (A - 1)

	4. The operation `A & (A - 1)` removes the rightmost set bit (1)
	   from A.

	5. Therefore, every iteration removes exactly one set bit.

	6. Increment `count` after removing each set bit.

	7. When A becomes zero, all set bits have been removed.

	8. Return `count` as the minimum number of times Alex needs help
	   from Sam.

	Example:
		A = 5

		Binary representation: 101

		Iteration 1:
			101 & 100 = 100
			count = 1

		Iteration 2:
			100 & 011 = 000
			count = 2

		Therefore, the minimum help needed is 2.


	Complexity Analysis

	Time : O(K)
	       Where `K` is the number of set bits (`1`s) in `A`.
	       The loop runs only once for each set bit.

	Space : O(1)
	        Only a constant amount of extra space is used.
*/

package Advanced.Topic04_Bit_Manipulation.Homework;

import java.util.*;
public class HelpFromSam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(int A) {
        int count = 0;

        while (A != 0) {
            A = A & (A - 1);
            count++;
        }

        return count;
    }
}
