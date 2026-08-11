/*
	Approach

	1. Handle the edge case where the String is null or empty.

	2. Convert the String into a character array so that
	   characters can be accessed efficiently.

	3. Consider every character as the center of an
	   odd-length palindrome and expand around it.

	4. Consider every pair of adjacent characters as the
	   center of an even-length palindrome and expand around it.

	5. Use the expand() method to calculate the length of
	   the palindrome for each center.

	6. Update maxLen whenever a longer palindrome is found.

	7. Return maxLen as the length of the longest
	   palindromic substring.


	Complexity Analysis

	Time : O(N^2)
		- There are O(N) possible centers, and expanding
		  around each center can take O(N) time.

	Space : O(N)
		- A character array of size N is created.
*/

package Intermediate.Topic10_Strings.Assignment;

import java.util.*;
public class LengthOfTheLongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String A = sc.nextLine();
        System.out.print(longestPalindrome(A));

        sc.close();
    }

    public static int longestPalindrome(String A) {
        if (A == null || A.length() == 0) {
            return 0;
        }

        // Length of the longest palindrome
        int maxLen = 1;

        // Convert the String into a character array
        char[] ch = A.toCharArray();

        // Odd Length Palindrome
        for (int mid = 0; mid < ch.length; mid++) {
            // Expand around the current character
            int len = expand(ch, mid, mid);

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
            }
        }

        // Even Length Palindrome
        for (int mid = 0; mid < ch.length; mid++) {
            // Expand around two adjacent characters
            int len = expand(ch, mid, mid + 1);

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
            }
        }

        // Return the length of the longest palindrome
        return maxLen;
    }

    public static int expand(char[] ch, int l, int r) {
        int n = ch.length;

        // Expand while the characters are equal
        while (l >= 0 && r < n) {
            if (ch[l] != ch[r]) {
                break;
            }
            
            l--;
            r++;
        }

        // Return the length of the palindrome
        return r - l - 1;
    }
}
