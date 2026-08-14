/*
	Approach

    Version 1 — Using ASCII Values:

    1. Convert string A into a character array so that
	   individual characters can be modified.

	2. Traverse the character array from left to right
	   to find the first occurrence of character B.

	3. If B is not found, return the original string.

	4. Starting from the first occurrence of B, traverse
	   the remaining characters.

	5. For every lowercase character:
	   - Convert it to uppercase by subtracting 32 from
	     its ASCII value.

	6. Convert the modified character array back into
	   a string and return it.


    Complexity Analysis

    Time : O(N)
        - Finding B takes O(N) in the worst case.
        - Converting the characters after B also takes O(N)
        in the worst case.

    Space : O(N)
        - A character array of size N is created.


    Version 2 — Using indexOf() and Character.toUpperCase():

	1. Convert string A into a character array so that
	   individual characters can be modified.

	2. Use indexOf() to find the first occurrence of
	   character B.

	3. If indexOf() returns -1, B is not present in the
	   string, so return the original string.

	4. Starting from the index where B occurs, traverse
	   the remaining characters.

	5. Convert every character to uppercase using
	   Character.toUpperCase().

	6. Convert the modified character array back into
	   a string and return it.


    Complexity Analysis

    Time : O(N)
        - indexOf() takes O(N) in the worst case.
        - The characters from the found index to the end
        are processed in O(N) in the worst case.

    Space : O(N)
        - A character array of size N is created.
*/

package Intermediate.Topic13_Contest_1;

import java.util.*;
public class AliceAndCapitalizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.print("Enter the character: ");
        String B = sc.nextLine();

        System.out.println(solveV1(A, B));
        //System.out.println(solveV2(A, B));

        sc.close();
    }

    // Version 1
    public static String solveV1(String A, String B) {
        char[] ch = A.toCharArray();

        // Find the first occurrence of B
        int i = 0;
        while (i < ch.length) {
            if (ch[i] == B.charAt(0)) {
                break;
            }
            i++;
        }

        // Character not found
        if (i == ch.length) {
            return A;
        }

        // Capitalize from the first occurrence to the end
        for (int j = i; j < ch.length; j++) {
            if (ch[j] >= 'a' && ch[j] <= 'z') {
                ch[j] = (char) (ch[j] - 32);
            }
        }

        return new String(ch);
    }

    // Version 2
    public static String solveV2(String A, String B) {
        char[] ch = A.toCharArray();

        // Find the first occurrence of B
        int index = A.indexOf(B);

        // Character not found
        if (index == -1) {
            return A;
        }

        // Capitalize from the first occurrence to the end
        for (int i = index; i < ch.length; i++) {
            ch[i] = Character.toUpperCase(ch[i]);
        }

        return new String(ch);
    }
}
