/*
    Approach

    1. Convert the given String into a character array
       because Strings are immutable in Java.

	2. Traverse each character of the character array.

	3. If the character is uppercase:
	   - Add 32 to its ASCII value to convert it
	     into lowercase.

	4. Otherwise, subtract 32 from its ASCII value
	   to convert it into uppercase.

	5. Convert the character array back into a String
	   and return the result.


	Complexity Analysis

	Time : O(N)
    	- We traverse all N characters once.

	Space : O(N)
    	- A character array of size N is created.
*/

package Intermediate.Topic10_Strings.Assignment;

import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();
        
        System.out.println(caseConversion(A));

        sc.close();
    }

    public static String caseConversion(String A) {
        // Convert the String into a character array
        char[] ch = A.toCharArray();

        // Traverse through each character
        for(int i = 0; i < ch.length; i++) {

            // Convert uppercase character to lowercase
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32);
            }

            // Convert lowercase character to uppercase
            else {
                ch[i] = (char)(ch[i] - 32);
            }
        }

        // Convert the character array back into a String
        return new String(ch);
    }
}
