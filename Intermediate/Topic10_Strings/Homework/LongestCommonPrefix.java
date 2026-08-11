/*
	Approach

	1. Handle the edge case where the array is null or empty.

	2. Consider the first String as the reference String.
	   The longest common prefix cannot be longer than
	   this String.

	3. Traverse each character of the reference String.

	4. For every character, compare it with the character
	   at the same index in all other Strings.

	5. If any String is shorter than the current index or
	   its character does not match the reference character,
	   return the prefix found so far.

	6. If all characters of the reference String match in
	   every String, return the complete reference String.


	Complexity Analysis

	Time : O(N * M)
		- N is the number of Strings.
		- M is the length of the reference String.
		- In the worst case, every character is compared
		  across all N Strings.

	Space : O(1)
		- Apart from the returned substring, only a few
		  variables are used.
*/

package Intermediate.Topic10_Strings.Homework;

import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] A = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            A[i] = sc.next();
        }

        System.out.println(longestCommonPrefix(A));

        sc.close();
    }

    public static String longestCommonPrefix(String[] A) {
        if (A == null || A.length == 0) {
            return "";
        } 

        // Consider the first String as the reference String
        String reference = A[0];

        // Traverse through every character of the reference String
        for (int i = 0; i < reference.length(); i++) {
            // Store the current reference character
            char ch = reference.charAt(i);

            // Compare the current character with all other Strings
            for (int j = 1; j < A.length; j++) {
                // Check if the current String is shorter or
                // the character does not match.
                if (i >= A[j].length() || A[j].charAt(i) != ch){
                    // Return the common prefix found so far
                    return reference.substring(0, i);
                }   
            }
        }

        // The complete reference String is the common prefix
        return reference;
    }
}
