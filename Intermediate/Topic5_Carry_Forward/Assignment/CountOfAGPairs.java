/*
   Version 1 Approach (Right to Left)

   1. Traverse the string from right to left.

   2. Keep track of the number of 'G' characters
      encountered so far.

   3. Whenever an 'A' is found:
      - All previously counted 'G' characters
        form valid (A, G) pairs.
      - Add countG to the answer.

   4. Return the total number of AG pairs.

   Complexity Analysis

   Time  : O(N)
           - Single traversal of the string.

   Space : O(N)
           - Character array created using toCharArray().
*/

/*
   Version 2 Approach (Left to Right)

   1. Traverse the string from left to right.

   2. Keep track of the number of 'A' characters
      encountered so far.

   3. Whenever a 'G' is found:
      - Every previously seen 'A'
        forms a valid (A, G) pair.
      - Add countA to the answer.

   4. Return the total number of AG pairs.

   Complexity Analysis

   Time  : O(N)
           - Single traversal of the string.

   Space : O(N)
           - Character array created using toCharArray().
*/

import java.util.*;

public class CountOfAGPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        long res = solve(str);
        long res1 = solveV2(str);
        System.out.println(res);
        System.out.println(res1);
        sc.close();
    }

    // Counts the number of (A, G) pairs by traversing
    // the string from right to left.
    public static long solve(String A) {
        long countG = 0;
        long ans = 0;
        // Convert the string into a character array.
        char[] ch = A.toCharArray();

        // Traverse the string from right to left.
        for (int i = ch.length - 1; i >= 0; i--) {
            // Count every 'G' encountered.
            if(ch[i] == 'G') {
                countG++;
            } 
            // Every 'A' can pair with all 'G's to its right.
            else if(ch[i] == 'A'){
                ans += countG;
            }
        }

        // Return the total number of AG pairs.
        return ans;
    }

    // Counts the number of (A, G) pairs by traversing
    // the string from left to right.
    public static long solveV2(String A) {
        long countA = 0;
        long ans = 0;
        // Convert the string into a character array.
        char[] ch = A.toCharArray();

        // Traverse the string from left to right.
        for (int i = 0; i < ch.length; i++) {
            // Count every 'A' encountered.
            if(ch[i] == 'A') {
                countA++;
            } 
            // Every 'G' can pair with all 'A's to its left.
            else if(ch[i] == 'G') {
                ans += countA;
            }
        }

        // Return the total number of AG pairs.
        return ans;
    }
}
