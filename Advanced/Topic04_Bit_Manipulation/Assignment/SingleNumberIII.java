/*
	Approach

	Single Number II Using XOR and a Set Bit

	1. Initialize `xor` with `0` and traverse the entire array.

	2. XOR every element with `xor`.
	   Since every element except two appears twice, duplicate elements
	   cancel each other because:
	   
	   - x ^ x = 0
	   - x ^ 0 = x
	   
	   Therefore, after traversing the array:
	   
	   xor = unique1 ^ unique2

	3. Find the first set bit in `xor`.
	   This bit must be different between the two unique numbers because
	   `unique1 ^ unique2` contains `1` at every position where their bits
	   are different.

	4. Use this set bit to divide the array into two groups:
	   
	   - Group `a`: elements where this bit is unset.
	   - Group `b`: elements where this bit is set.

	5. XOR all elements in each group separately.
	   Every duplicate appears in the same group and cancels out.
	   Therefore:
	   
	   - `a` contains the first unique number.
	   - `b` contains the second unique number.

	6. Store the two unique numbers in the result array.

	7. Since the problem requires the answer in ascending order, swap
	   the two elements if `result[0] > result[1]`.

	Complexity Analysis

	Time : O(N)
	       The array is traversed twice, and finding the set bit takes
	       at most 32 iterations. Therefore, the overall time complexity
	       is O(N).

	Space : O(1)
	        Only a constant number of variables are used apart from the
	        returned result array.
*/

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class SingleNumberIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(solve(A)));

        sc.close();
    }

    public static int[] solve(int[] A) {
        int n = A.length;

        int[] result = new int[2];

        // Step 1: XOR all the elements
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor = xor ^ A[i];
        }

        // Step 2: Find the ith set bit
        int j = 0;
        while(j < 32) {
            if((xor & (1 << j)) > 0) {
                break;
            }
            j++;
        }

        // Step 3: Divide elements into two groups
        int a = 0;      // Elements with unset bit
        int b = 0;      // Elements with set bit

        for(int i = 0; i < n; i++) {
            if((A[i] & (1 << j)) > 0) {
                b = b ^ A[i];
            }
            else {
                a = a ^ A[i];
            }
        }

        result[0] = a;
        result[1] = b;

        // Step 4: Return elements in ascending order
        if(result[0] > result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }

        return result;
    }
}
