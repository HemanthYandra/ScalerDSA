/*
	Approach

	1. Concatenate the given String with itself.

	2. Remove all uppercase characters from the
	   resulting String using replaceAll().

	3. Convert the resulting String into a character array
	   so that individual characters can be modified.

	4. Traverse the character array.

	5. If the current character is a lowercase vowel
	   (a, e, i, o, u), replace it with '#'.

	6. Convert the character array back into a String
	   and return the result.


	Complexity Analysis

	Time : O(N)
		- Concatenating, replacing uppercase characters,
		  and traversing the resulting String take O(N).

	Space : O(N)
		- A new String, regular expression result,
		  and character array are created.
*/

package Intermediate.Topic10_Strings.Assignment;

import java.util.*;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();
        
        System.out.println(operations(A));

        sc.close();
    }

    public static String operations(String A) {
        // Concatenate the String with itself
        String B = A + A;

        // Remove all uppercase characters
        String C = B.replaceAll("[A-Z]", "");

        // Convert the String into a character array
        char[] ch = C.toCharArray();

        // Traverse through each character
        for(int i = 0; i < ch.length; i++) {

            // Replace lowercase vowels with '#'
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' 
                    || ch[i] == 'o' || ch[i] == 'u') {
                ch[i] = '#';
            }
        }

        // Convert the character array back into a String
        return new String(ch);
    }
}
