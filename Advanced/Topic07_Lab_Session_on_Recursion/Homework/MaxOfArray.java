/*
	Approach

	1. We need to find the maximum element in the array using recursion.

	2. Start from the last index of the array and recursively find
	   the maximum element from index 0 to index i - 1.

	3. The base case is when i == 0.
	   At this point, only the first element is left, so return A[0].

	4. After the recursive call returns the maximum of the remaining
	   elements, compare it with A[i].

	5. Return the larger of A[i] and the maximum found in the
	   previous elements.

	Complexity Analysis

	Time : O(N)
	       Each array element is considered once.

	Space : O(N)
	        The recursion depth can go up to N.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Homework;

import java.util.*;
public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int ans = getMax(A);

        System.out.println("Maximum element: " + ans);

        sc.close();
    }

    public static int getMax(int[] A) {
        // Start the recursion from the last index
        return helper(A, A.length - 1);
    }

    private static int helper(int[] A, int i) {
        // Base case: only the first element is left
        if(i == 0) {
            return A[0];
        }

        // Find the maximum element from index 0 to i - 1
        int maxOfRest = helper(A, i - 1);

        // Compare the current element with the maximum of the previous elements
        if(A[i] > maxOfRest) {
            return A[i];
        } 
        else {
            return maxOfRest;
        }
    }
}
