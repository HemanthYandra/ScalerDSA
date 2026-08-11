/*
	Approach

	1. Convert the given String into a character array.

	2. Traverse through every character of the array.

	3. Check whether the current character is:
	   - An uppercase alphabet from A to Z.
	   - A lowercase alphabet from a to z.
	   - A digit from 0 to 9.

	4. If the character does not belong to any of these
	   three ranges, return 0 because the String is not
	   alphanumeric.

	5. If all characters satisfy one of the above conditions,
	   return 1 because the String is alphanumeric.


	Complexity Analysis

	Time : O(N)
		- We traverse all N characters once.

	Space : O(N)
		- A character array of size N is created.
*/

package Intermediate.Topic10_Strings.Homework;

import java.util.*;
public class Alphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        char[] A = str.toCharArray();

        System.out.println(isAlpha(A));

        sc.close();
    }

    public static int isAlpha(char[] A) {
        // Traverse through every character
        for(int i = 0; i < A.length; i++) {
            // Check if the character is not an alphabet or digit
            if (!(A[i] >= 'A' && A[i] <= 'Z' ||
                    A[i] >= 'a' && A[i] <= 'z' ||
                    A[i] >= '0' && A[i] <= '9')) {

                // Return 0 if a non-alphanumeric character is found
                return 0;
            }
        }

        // All characters are alphanumeric
        return 1;
    }
}
