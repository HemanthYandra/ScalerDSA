/*
	Approach

	Add One to Number Using Carry Propagation

	1. The array represents a non-negative integer where each element
	   contains one digit of the number.

	2. Start from the last digit because adding 1 begins from the
	   least significant digit.

	3. Maintain a `carry` initialized to 1 because we need to add 1
	   to the given number.

	4. For every digit from right to left:
	   - Add the carry to the current digit.
	   - If the result is 10, set the current digit to 0 and keep
	     the carry as 1.
	   - Otherwise, store the result and set carry to 0.

	5. After processing all digits, if the carry is still 1,
	   add 1 at the beginning of the array.
	   This handles cases such as [9, 9, 9] -> [1, 0, 0, 0].

	6. Remove leading zeros from the result while keeping at least
	   one digit in the array.

	Complexity Analysis

	Time : O(N)
		Each digit is processed at most once.

	Space : O(1) Auxiliary Space
		Only a constant number of variables are used apart from
		the input ArrayList.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Homework;

import java.util.*;
public class AddOneToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        ArrayList<Integer> result = solve(A);

        System.out.println(result);

        sc.close();
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();

        // Initialize carry as 1 because we need to add one
        int carry = 1;

        // Process digits from right to left
        for (int i = n - 1; i >= 0; i--) {
            int num = A.get(i) + carry;

            // If the digit becomes 10, set it to 0 and carry 1
            if (num == 10) {
                A.set(i, 0);
                carry = 1;
            } else {
                // Store the updated digit and stop carrying
                A.set(i, num);
                carry = 0;
            }
        }

        // If carry remains, add 1 at the beginning
        if (carry == 1) {
            A.add(0, 1);
        }

        // Remove leading zeros while keeping at least one digit
        while (A.size() > 1 && A.get(0) == 0) {
            A.remove(0);
        }

        return A;
    }
}
