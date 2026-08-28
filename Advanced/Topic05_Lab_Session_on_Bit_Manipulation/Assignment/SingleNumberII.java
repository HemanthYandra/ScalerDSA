/*
	Approach

	1. Every element appears exactly 3 times except one element,
	   which appears only once.

	2. Check each of the 32 bit positions independently.

	3. For each bit position `i`, traverse the array and count
	   how many numbers have the `i`th bit set to `1`.

	4. The bits of every number appearing 3 times contribute a
	   multiple of 3 to `count`.

	   Therefore:

	   `count % 3 = 0`

	   This removes their contribution.

	5. The unique number appears only once. If its `i`th bit is
	   set, then:

	   `count % 3 = 1`

	6. Store `count % 3` in `rem`.

	7. Add the value of the current bit to `ans` using:

	   `rem * (1 << i)`

	8. After checking all 32 bits, `ans` contains the unique number.


	Example

	A = [2, 2, 2, 5]

	Binary:

	2 = 0010
	2 = 0010
	2 = 0010
	5 = 0101

	For each bit, count the set bits and take `count % 3`.

	The bits contributed by `2` occur 3 times and become `0`.

	The bits contributed by `5` occur once and remain `1`.

	Therefore:

	0101 = 5


	Complexity Analysis

	Time  : O(32 * N) = O(N)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Assignment;

import java.util.*;
public class SingleNumberII {
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
        int n = A.length;
        int ans = 0;

        // Check each bit position
        for(int i = 0; i < 32; i++) {
            int count = 0;

            // Count how many numbers have the current bit set
            for(int j = 0; j < n; j++) {
                if((A[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            // Keep only the unique number's contribution
            int rem = count % 3;

            // Add the current bit's value to the answer
            ans = ans + rem * (1 << i);
        }

        return ans;
    }
}
