/*
    Approach

    Reverse Traversal with Carry Propagation

    1. Since adding one only affects digits from the rightmost end, and a
       carry propagates leftward, traverse the array from index n - 1
       down to 0.

    2. At each index i, add the current carry (starts at 1, since we are
       adding one to the number) to A[i].
       - If the resulting sum is 10, set A[i] to 0 and keep carry as 1
         to propagate to the next digit on the left.
       - Otherwise, set A[i] to the sum and set carry to 0, meaning no
         further digits need to change.

    3. Once the traversal ends, if carry is 0, no new leading digit is
       needed, so return A as is.

    4. If carry is still 1 after processing every digit (this happens
       only when every digit was a 9, e.g. 999 -> 1000), create a new
       array of size n + 1, place 1 at index 0, and copy the remaining
       digits (now all zeros) from A into the rest of the array.

    5. Return the final result array.

    Complexity Analysis

    Time : O(N)
        We traverse the array once from right to left, and in the worst
        case (all digits are 9) we copy it once more into a new array.

    Space : O(N)
        Only used when a carry overflows past the most significant digit,
        requiring a new array of size N + 1. Otherwise the input array
        is modified in place.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Homework;

import java.util.*;
public class AddOneToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] result = solve(A);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int[] A) {
        int n = A.length;

        // carry starts at 1 since we are adding one to the number
        int carry = 1;

        // process digits from least significant (rightmost) to most
        // significant (leftmost), propagating the carry as we go
        for(int i = n - 1; i >= 0; i--) {
            int num = A[i] + carry;

            if(num == 10) {
                // digit overflowed, reset to 0 and carry 1 into the next digit
                A[i] = 0;
                carry = 1;
            }
            else {
                // digit absorbed the carry, no further propagation needed
                A[i] = num;
                carry = 0;
            }
        }

        // carry died out somewhere in the middle, A already holds the answer
        if (carry == 0) {
            return A;
        }

        // carry survived past index 0, meaning every digit was a 9
        // (e.g. 999 -> 1000), so we need one extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1;

        // copy the remaining digits (all zeros at this point) after the leading 1
        for (int i = 0; i < n; i++) {
            result[i + 1] = A[i];
        }

        return result;
    }
}
