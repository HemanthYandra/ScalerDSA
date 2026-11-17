/*
	Approach

	Version 1: Expand Around Center (Inline)

	1. Handle the edge case where the String is null or empty.

	2. Convert the String into a character array so that
	   characters can be accessed using array indexing.

	3. Treat every character as the center of an odd-length
	   palindrome and every gap between adjacent characters
	   as the center of an even-length palindrome.

	4. Expand two pointers, l and r, from the center while
	   the characters are equal.
	   - l and r end one step past the palindrome.

	5. Calculate the length as r - l - 1.
	   - If it is longer than maxLen, update maxLen and
	     set start = l + 1.

	6. Return A.substring(start, start + maxLen).


	Version 2: Expand Around Center (Helper Method)

	1. Handle the edge case where the String is null or empty.

	2. Convert the String into a character array.

	3. Use a separate expand() method that expands around a
	   given center and returns the palindrome length.

	4. For odd-length palindromes, call expand(ch, mid, mid).
	   - New start = mid - len / 2

	5. For even-length palindromes, call expand(ch, mid, mid + 1).
	   - New start = mid - len / 2 + 1

	6. Update maxLen and start only when a longer palindrome
	   is found, then return A.substring(start, start + maxLen).


	Complexity Analysis

	Time : O(N^2)
		- There are O(N) possible centers, and expanding
		  around each center can take O(N) time.

	Space : O(N)
		- A character array of size N is created.
*/

package Intermediate.Topic10_Strings.Assignment;

import java.util.*;
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println("V1: " + longestPalindromeV1(A));
        System.out.println("V2: " + longestPalindromeV2(A));

        sc.close();
    }

    // Version 1
    public static String longestPalindromeV1(String A) {
        if (A == null || A.length() == 0) {
            return "";
        }

        int n = A.length();
  
        int start = 0;      // Starting Index of the longest palindrome
        int maxLen = 1;     // Length of the longest palindrome

        // Convert the String into a character array
        char[] ch = A.toCharArray();

        // Consider every character as a possible center
        for (int mid = 0; mid < n; mid++) {
            // Odd Length Palindrome
            int l = mid;
            int r = mid;

            // Expand around the current character
            while (l >= 0 && r < n) {
                if (ch[l] != ch[r]) {
                    break;
                }

                l--;
                r++;
            }

            // Calculate the palindrome length
            int len = r - l - 1;

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
                start = l + 1;      // Only update start when a new max is found
            }

            // Even Length Palindrome
            l = mid;
            r = mid + 1;

            // Expand around the two adjacent characters
            while (l >= 0 && r < n) {
                if (ch[l] != ch[r]) {
                    break;
                }

                l--;
                r++;
            }

            // Calculate the palindrome length
            len = r - l - 1;

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
                start = l + 1;      // Only update start when a new max is found
            }
        }

        return A.substring(start, start + maxLen);      // Return the longest palindromic substring
    }

    // Version 2
    public static String longestPalindromeV2(String A) {
        if (A == null || A.length() == 0) {
            return "";
        }
        
        int start = 0;      // Starting Index of the longest palindrome
        int maxLen = 1;     // Length of the longest palindrome

        // Convert the String into a character array
        char[] ch = A.toCharArray();

        for(int mid = 0; mid < ch.length; mid++) {
            // Odd Length Palindrome
            int l = mid;
            int r = mid;
            int len = expand(ch, l, r);     // Expand around the current character

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
                start = mid - len / 2;      // Only update start when a new max is found
            }
        

            //Even Length Palindrome
            l = mid;
            r = mid + 1;
            len = expand(ch, l, r);        // Expand around two adjacent characters

            // Update the longest palindrome
            if  (len > maxLen) {
                maxLen = len;
                start = mid - len / 2 + 1;      // Only update start when a new max is found
            }
        }

        return A.substring(start, start + maxLen);      // Return the longest palindromic substring
    }

    public static int expand(char[] ch, int l, int r) {
        int n = ch.length;

        // Expand while the characters are equal
        while(l >= 0 && r < n) {
            if(ch[l] != ch[r]) {
                break;
            }
            l--;
            r++;
        }
        
        return r - l - 1;       // Return the length of the palindrome
    }
}
