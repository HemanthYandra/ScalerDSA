/*
	Approach

	1. A string is a palindrome if it reads the same from both
	   left to right and right to left.

	2. Use two pointers:
	   - l represents the left end of the string.
	   - r represents the right end of the string.

	3. Compare the characters at positions l and r.
	   - If they are different, the string is not a palindrome,
	     so return 0.
	   - If they are the same, move both pointers towards the center.

	4. The base case is when l >= r.
	   This means all characters have been compared successfully,
	   so the string is a palindrome. Return 1.

	5. The recursion continues until a mismatch is found or
	   the two pointers meet/cross.

	Complexity Analysis

	Time : O(N)
	       Each character is checked at most once.

	Space : O(N)
	        The recursion can go up to N/2 levels.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Homework;

import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String A = sc.nextLine();

        int ans = solve(A);

        System.out.println(ans);

        sc.close();
    }

    public static int solve(String A) {
        // Start comparing characters from both ends of the string
        return helper(A, 0, A.length() - 1);
    }

    private static int helper(String A, int l, int r) {
        // Base case: all characters have been checked
        if (l >= r) {
            return 1;
        }

        // If characters at both ends are different, it is not a palindrome
        if (A.charAt(l) != A.charAt(r)) {
            return 0;
        }

        // Move both pointers towards the center
        return helper(A, l + 1, r - 1);
    }
}
