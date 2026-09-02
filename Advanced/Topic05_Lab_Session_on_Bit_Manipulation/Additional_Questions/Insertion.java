/*	
	Version 1:

	Approach

	1. Read N and M as binary strings because the input numbers are
	   represented in binary form.

	2. Convert N and M from binary strings to integers using
	   Integer.parseInt(value, 2).

	3. Find the number of bits required to represent M.

	4. Calculate the number of positions M needs to be shifted so that
	   its most significant bit is placed at position j.

	   shift = j - numberOfBits + 1

	5. Calculate the total number of positions from i to j.

	   numberOfPositions = j - i + 1

	6. Create a mask containing 1s for all positions from i to j.

	   First, left shift 1 by numberOfPositions.
	   Then subtract 1 to get numberOfPositions consecutive 1s.
	   Finally, left shift the result by i.

	   This creates a mask with 1s from bit i through bit j.

	7. Invert the mask using the NOT operator.
	   This changes the bits from i through j to 0 and keeps all
	   other bits as 1.

	8. Perform AND between N and the inverted mask to clear the
	   bits from position i through j.

	9. Shift M by the calculated shift value so that its most
	   significant bit is placed at position j.

	10. Perform OR between the cleared N and shifted M to insert M
	    into the required bit positions.

	11. Return the resulting value.

	Example:

	N = 10000000000
	M = 10011
	i = 2
	j = 6

	M contains 5 bits.

	shift = j - numberOfBits + 1
	      = 6 - 5 + 1
	      = 2

	numberOfPositions = j - i + 1
	                  = 6 - 2 + 1
	                  = 5

	Mask:

	11111 << 2
	= 001111100

	Inverted mask:

	110000011

	Clear bits 2 through 6 in N and shift M by 2 positions:

	10000000000
	00001001100

	After inserting M:

	N = 10001001100

	Complexity Analysis

	Time : O(1)
		Only a fixed number of operations are performed because
		the numbers are 32-bit integers.

	Space : O(1)
		Only a constant amount of extra space is used.
	

	Version 2:

	Approach

	1. Read N and M as binary strings because the problem represents
	   the numbers using their binary form.

	2. Convert the binary strings into decimal integers using
	   Integer.parseInt(value, 2).

	3. Find the number of bits required to represent M.

	4. Calculate the shift required to place the most significant
	   bit of M at position j.

	   shift = j - numberOfBits + 1

	5. Create a mask containing 1s from bit position i through
	   bit position j.

	6. Clear bits i through j in N by performing AND with the
	   complement of the mask.

	7. Shift M by the calculated amount so that its most significant
	   bit is placed at position j.

	8. Insert the shifted M into N using the OR operator.

	9. Return the resulting number.

	Example:

	N = 10000000000
	M = 10011
	i = 2
	j = 6

	M contains 5 bits, so:

	shift = 6 - 5 + 1
	      = 2

	Therefore, M is shifted left by 2 positions:

	10011 << 2 = 1001100

	After clearing bits 6 through 2 of N and inserting M:

	N = 10001001100

	Complexity Analysis

	Time : O(1)
		Only a fixed number of bit operations are performed.

	Space : O(1)
		Only a constant amount of extra space is used.
*/

package Advanced.Topic05_Lab_Session_on_Bit_Manipulation.Additional_Questions;

import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N in binary: ");
        String n = sc.next();

        System.out.print("Enter M in binary: ");
        String m = sc.next();

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        System.out.print("Enter j: ");
        int j = sc.nextInt();

		// Converting N from binary to decimal
        int N = Integer.parseInt(n, 2);

		// Converting M from binary to decimal
        int M = Integer.parseInt(m, 2);

        int result = solveV1(N, M, i, j);

        System.out.println("Result in binary: " + Integer.toBinaryString(result));

        sc.close();
    }

    public static int solveV1(int N, int M, int i, int j) {

		// Step 1: Find how many bits M has
		String binaryM = Integer.toBinaryString(M);
		int numberOfBits = binaryM.length();

		// Step 2: Find how far M needs to be shifted
		int shift = j - numberOfBits + 1;

		// Step 3: Find how many bits we need to clear in N
		int numberOfPositions = j - i + 1;

		// Step 4: Create 1 followed by numberOfPositions zeros
		int one = 1;
		int shiftedOne = one << numberOfPositions;

		// Step 5: Subtract 1 to create all 1s
		int ones = shiftedOne - 1;

		// Step 6: Move those 1s to start at bit i
		int mask = ones << i;

		// Step 7: Invert the mask
		int invertedMask = ~mask;

		// Step 8: Clear bits i through j in N
		int clearedN = N & invertedMask;

		// Step 9: Shift M into the correct position
		int shiftedM = M << shift;

		// Step 10: Insert M into N
		int result = clearedN | shiftedM;

		return result;
	}

	public static int solveV2(int N, int M, int i, int j) {

		// Find the number of bits in M.
		int numberOfBits = Integer.toBinaryString(M).length();

		// Calculate where M should start.
		int shift = j - numberOfBits + 1;

		// Create a mask with 1s from bit i through bit j.
		int mask = ((1 << (j - i + 1)) - 1) << i;

		// Clear bits i through j in N.
		N = N & ~mask;

		// Shift M so that its MSB is placed at bit j.
		M = M << shift;

		// Insert M into N.
		N = N | M;

		return N;
	}
}
