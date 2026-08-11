/*
	Approach

	1. Use two pointers:
	   - si points to the starting index.
	   - ei points to the ending index.

	2. Compare the characters at si and ei.

	3. If the characters are different, the given
	   substring is not a palindrome, so return false.

	4. Move si one step forward and ei one step backward.

	5. Continue comparing until si crosses ei.

	6. If all corresponding characters are equal,
	   return true because the substring is a palindrome.


	Complexity Analysis

	Time : O(N)
		- We compare characters from both ends and
		  traverse at most N/2 characters.

	Space : O(1)
		- Only two pointer variables are used.
*/

package Intermediate.Topic10_Strings.Assignment;

import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.print("Enter the start index: ");
        int si = sc.nextInt();

        System.out.print("Enter the end index: ");
        int ei = sc.nextInt();

        if (isPalindromeOrNot(A, si, ei)) {
            System.out.println(A + " is Palindrome");
        } else {
            System.out.println(A + " is Not Palindrome");
        }

        sc.close();
    }

    public static boolean isPalindromeOrNot(String A, int si, int ei) {
        // Compare characters from both ends
        while(si < ei) {
            // If corresponding characters are different,
            // the substring is not a palindrome.
            if(A.charAt(si) != A.charAt(ei)) {
                return false;
            }

            si++;
            ei--;
        }

        // All corresponding characters are equal
        return true;
    }
}
