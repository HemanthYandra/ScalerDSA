/*
	Approach

	1. We need to find the last occurrence of B in array A using
	   recursion.

	2. Start checking the array from the last index.

	3. If the current element A[i] is equal to B, return the
	   current index because we are searching from right to left.
	   Therefore, this is the last occurrence.

	4. If the current element is not equal to B, recursively
	   check the previous index.

	5. The base case is when i becomes less than 0.
	   This means the entire array has been checked and B was not
	   found, so return -1.

	6. Since we check the elements from right to left, the first
	   match we find is automatically the last occurrence.

	Complexity Analysis

	Time : O(N)
	       In the worst case, we check every element of the array.

	Space : O(N)
	        The maximum recursion depth can be N.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Homework;

import java.util.*;
public class FindLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int B = sc.nextInt();

        int ans = lastIndex(A, B);

        System.out.println("Last index: " + ans);

        sc.close();
    }

    public static int lastIndex(int[] A, int B) {
        // Start searching from the last index
        return helper(A, B, A.length - 1);
    }

    private static int helper(int[] A, int B, int i) {
        // Base case: entire array has been checked
        if (i < 0) {
            return -1;
        }

        // If the current element matches B, return its index
        if (A[i] == B) {
            return i;
        }

        // Recursively check the previous index
        return helper(A, B, i - 1);
    }
}
