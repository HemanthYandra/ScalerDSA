/*
	Approach

	1. The food stash starts with 1 unit on Day 1 and doubles
	   every day.

	   Therefore, the food received on each day is:

	   Day 1 -> 1  = 2^0
	   Day 2 -> 2  = 2^1
	   Day 3 -> 4  = 2^2
	   Day 4 -> 8  = 2^3
	   ...

	2. Since each day's stash is a power of 2, every day corresponds
	   to one bit position in the binary representation of `A`.

	3. If Boomer receives the stash on a particular day, that day's
	   power of 2 is included in the total food `A`.

	   For example:

	   A = 5

	   5 = 4 + 1
	     = 2^2 + 2^0

	   Therefore, Boomer received food on:
	   Day 3 -> 4 units
	   Day 1 -> 1 unit

	   Number of good days = 2.

	4. In binary, the presence of a power of 2 is represented by a
	   `1` bit.

	   5 = 101

	   The `1`s represent:
	   2^2 -> Day 3
	   2^0 -> Day 1

	5. Therefore, the number of days Boomer received food is equal
	   to the number of `1` bits, also called set bits, in `A`.

	6. We can therefore solve the problem by counting the set bits
	   using different bit manipulation techniques.


	Version 1: Check Every Bit

	1. An integer in Java uses 32 bits.

	2. Traverse all 32 bit positions from 0 to 31.

	3. For each position `i`, create a mask using:
	   `1 << i`

	4. Perform bitwise AND between `A` and the mask:
	   `A & (1 << i)`

	5. If the result is non-zero, the `i`th bit of `A` is `1`.
	   Increment the count.

	6. After checking all 32 bits, return the count.


	Version 2: Remove the Rightmost Set Bit

	1. Initialize `count` to 0.

	2. While `A` is greater than 0, remove the rightmost set bit
	   using:
	   `A = A & (A - 1)`

	3. The operation `A & (A - 1)` removes exactly one `1` bit
	   from the binary representation of `A`.

	4. Increment `count` after removing each set bit.

	5. When `A` becomes 0, all set bits have been removed.

	6. Return `count`.


	Version 3: Repeatedly Check the Last Bit

	1. Initialize `count` to 0.

	2. While `A` is greater than 0, check whether the last bit is `1`.

	3. The last bit can be checked using:
	   `A % 2`

	4. If `A % 2 != 0`, the last bit is `1`, so increment `count`.

	5. Divide `A` by 2 to remove the last bit and move to the
	   next bit:
	   `A = A / 2`

	6. Repeat until `A` becomes 0.

	7. Return `count`.


	Complexity Analysis

	Version 1:
	Time  : O(32) = O(1)
	Space : O(1)

	Version 2:
	Time  : O(number of 1 bits)
	Space : O(1)

	Version 3:
	Time  : O(log A)
	Space : O(1)
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Assignment;

import java.util.*;
public class FindGoodDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int A = sc.nextInt();

        System.out.println(solveV1(A));

        sc.close();
    }

    // version 1 (Check every bit)
    public static int solveV1(int A) {
        int count = 0;

        int i = 0;
        while (i < 32) {
            if ((A & (1 << i)) != 0) {
                count++;
            }
            i++;
        }

        return count;
    }

    // version 2 (Remove the rightmost set bit)
    public static int solveV2(int A) {
        int count = 0;

        while (A > 0) {
            A = A & (A - 1);
            count++;
        }

        return count;
    }

    // version 3 (Repeatedly check the last bit)
    public static int solveV3(int A) {
        int count = 0;

        while (A > 0) {
            if (A % 2 != 0) {
                count++;
            }

            A = A / 2;
        }

        return count;
    }
}
