/*
	Approach

	1. Remove leading and trailing spaces using trim().

	2. Split the String into individual words using
	   one or more spaces as the delimiter.

	3. Use two pointers:
	   - left starts from the first word.
	   - right starts from the last word.

	4. Swap the words at left and right.

	5. Move left forward and right backward until they meet.

	6. Join the reversed words using a single space.

	7. Return the resulting String.


	Complexity Analysis

	Time : O(N)
		- Splitting, reversing, and joining the words
		  together takes O(N), where N is the length
		  of the String.

	Space : O(N)
		- The words array stores all the words.
		- The resulting String also requires O(N) space.
*/

package Intermediate.Topic11_Lab_Session_on_2D_Matrices_and_Strings.Strings.Assignment;

import java.util.*;
public class ReverseStringWordByWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println(reverseString(A));

        sc.close();
    }

    public static String reverseString(String A) {
        // Remove leading/trailing spaces and split into words
        String[] words = A.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        // Reverse the words using two pointers
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join the reversed words with a single space
        return String.join(" ", words);
    }
}
