/*
	Approach

	Expand Around Center

	1. Handle the edge case where the String is null or empty.

	2. Convert the String into a character array so that
	   characters can be accessed using array indexing.

	3. Consider every character as the center of an
	   odd-length palindrome and expand around it.

	4. Consider every gap between adjacent characters as the
	   center of an even-length palindrome and expand around it.

	5. Use the expand() method to calculate the length of
	   the palindrome for each center.
	   - Expansion stops at a mismatch or an array boundary.
	   - Length is r - l - 1, since l and r end one step past the palindrome.

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

        int maxLen = 1;     // Length of the longest palindrome

        // Convert the String into a character array
        char[] ch = A.toCharArray();

        for (int mid = 0; mid < ch.length; mid++) {

            // Odd Length Palindrome
            int l = mid;
            int r = mid;
            int len = expand(ch, l, r);         // Expand around the current character
            maxLen = Math.max(maxLen, len);         // Update the longest palindrome
        
            // Even Length Palindrome
            l = mid;
            r = mid + 1;
            len = expand(ch, l, r);     // Expand around two adjacent characters
            maxLen = Math.max(maxLen, len);         // Update the longest palindrome
        }

        return maxLen;      // Return the length of the longest palindrome
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

        return r - l - 1;       // Return the length of the palindrome
    }
}
