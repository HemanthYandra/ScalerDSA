/*
	Approach

	1. Initialize a variable count to keep track of the
	   number of occurrences of "bob".

	2. Traverse the String using a loop.

	3. Since "bob" has a length of 3, stop the loop at
	   index N - 3 so that a complete substring of length
	   3 can be formed.

	4. Extract the substring of length 3 starting from the
	   current index.

	5. If the substring is equal to "bob", increment count.

	6. Return count after checking all possible positions.


	Complexity Analysis

	Time : O(N)
		- We check N - 2 possible positions.
		- Each substring contains only 3 characters, so the
		  comparison takes constant time.

	Space : O(N)
		- substring() creates temporary String objects while
		  checking each position.
*/

package Intermediate.Topic10_Strings.Homework;

import java.util.*;
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(String A) {
        // Count the number of occurrences of "bob"
        int count = 0;

        // Traverse all possible starting positions of "bob"
        for(int i = 0; i <= A.length() - 3; i++) {
            // Check whether the substring is equal to "bob"
            if(A.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }

        // Return the total number of occurrences
        return count;
    }
}
