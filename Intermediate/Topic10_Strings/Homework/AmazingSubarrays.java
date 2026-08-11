/*
	Approach

	1. Convert the given String into a character array.

	2. Traverse through every character of the String.

	3. If the current character is a vowel, then every
	   substring starting from that index will also be an
	   amazing substring.

	4. The number of substrings starting at index i is
	   (N - i), where N is the length of the String.

	5. Add (N - i) to count whenever a vowel is found.

	6. Since the answer can be large, take the result
	   modulo 10003 after every addition.

	7. Return the final count.


	Complexity Analysis

	Time : O(N)
		- We traverse the String once.
		- Checking whether a character is a vowel takes
		  constant time.

	Space : O(N)
		- A character array of size N is created.
*/

package Intermediate.Topic10_Strings.Homework;

import java.util.*;
public class AmazingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String A = sc.nextLine();

        System.out.println(solve(A));

        sc.close();
    }

    public static int solve(String A) {
        // Convert the String into a character array
        char[] ch = A.toCharArray();
        int n = ch.length;

        // Store the number of amazing substrings
        int count = 0;

        // Modulo value given in the problem
        int mod = 10003;

        // Traverse through every character
        for(int i = 0; i < n; i++) {
            // Check whether the current character is a vowel
            if("aeiouAEIOU".indexOf(ch[i])!= -1) {
                // All substrings starting at index i are amazing
                count = (count + (n - i)) % mod;
            }
        }

        // Return the final count modulo 10003
        return count % mod;
    }
}
