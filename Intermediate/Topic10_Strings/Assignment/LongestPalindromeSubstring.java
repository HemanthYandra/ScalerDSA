/*
	Approach

	Version 1:
	1. Handle the edge case where the String is null or empty.

	2. Treat every character as the center of an odd-length
	   palindrome.

	3. Expand two pointers, l and r, from the center while
	   the characters are equal.

	4. Calculate the palindrome length and update the
	   maximum length and starting index if a longer
	   palindrome is found.

	5. Repeat the same process for even-length palindromes
	   by taking two adjacent characters as the center.

	6. Return the substring using the starting index and
	   maximum palindrome length.


	Version 2:
	1. Handle the edge case where the String is null or empty.

	2. Use a separate expand() method to expand around a
	   given center and return the palindrome length.

	3. For odd-length palindromes, use the current character
	   as both the left and right center.

	4. For even-length palindromes, use two adjacent
	   characters as the left and right center.

	5. Whenever a longer palindrome is found, calculate its
	   starting index and update the maximum length.

	6. Return the longest palindromic substring.


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

        // Starting Index of the longest palindrome
        int start = 0;

        // Length of the longest palindrome
        int maxLen = 1;

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
                start = l + 1; // Only update start when a new max is found
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
                start = l + 1; // Only update start when a new max is found
            }
        }

        // Return the longest palindromic substring
        return A.substring(start, start + maxLen);
    }

    // Version 2
    public static String longestPalindromeV2(String A) {
        if (A == null || A.length() == 0) {
            return "";
        }

        // Starting Index of the longest palindrome
        int start = 0;

        // Length of the longest palindrome
        int maxLen = 1;

        // Convert the String into a character array
        char[] ch = A.toCharArray();

        //Odd Length Palindrome
        for(int mid = 0; mid < ch.length; mid++) {
            // Expand around the current character
            int len = expand(ch, mid, mid);

            // Update the longest palindrome
            if (len > maxLen) {
                maxLen = len;
                start = mid - len / 2;      // Only update start when a new max is found
            }
        }

        //Even Length Palindrome
        for(int mid = 0; mid < ch.length; mid++) {
            // Expand around two adjacent characters
            int len = expand(ch, mid, mid + 1);

            // Update the longest palindrome
            if  (len > maxLen) {
                maxLen = len;
                start = mid - len / 2 + 1;      // Only update start when a new max is found
            }
        }

        // Return the longest palindromic substring
        return A.substring(start, start + maxLen);
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

        // Return the length of the palindrome
        return r - l - 1;
    }
}
