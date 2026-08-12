/*
	Approach

	1. Convert the String into a character array because
	   Strings are immutable in Java.

	2. Use two pointers:
	   - left starts from the first character.
	   - right starts from the last character.

	3. Swap the characters at left and right.

	4. Move left forward and right backward.

	5. Continue until left and right meet.

	6. Convert the modified character array back into
	   a String and return it.


	Complexity Analysis

	Time : O(N)
		- Each character is visited at most once during
		  the reversal.

	Space : O(N)
		- A character array of size N is created.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Strings.Assignment;

import java.util.*;
public class SimpleReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println(reverseString(A));

        sc.close();
    }

    public static String reverseString(String A) {
        // Convert the String into a character array
        char[] ch = A.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        // Reverse the character array using two pointers
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to String
        return new String(ch);
    }
}
