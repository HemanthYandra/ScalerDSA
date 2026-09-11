/*
	Approach

	1. We need to find all the indices where the element B occurs
	   in the array A.

	2. Use recursion to process the array from left to right.
	   The parameter "i" represents the current index.

	3. The base case is when i reaches A.length.
	   There are no more elements to check, so return an empty array.

	4. First, recursively find all indices of B from i + 1
	   to the end of the array and store them in "ans".

	5. After the recursive call returns:
	   - If A[i] is equal to B, the current index i is also
	     a valid answer.
	   - Create a new array with one extra space.
	   - Put i at the beginning.
	   - Copy all elements from "ans" after i.

	6. If A[i] is not equal to B, simply return "ans".

	7. We add the current index after the recursive call returns.
	   This allows the indices to be stored in increasing order.

	Complexity Analysis

	Time : O(N^2)
        N recursive calls are made. Additionally, new arrays are created
        and elements are copied whenever B is found, resulting in O(N^2)
        total time in the worst case.
    
    Space : O(N)
	    The recursion stack requires O(N) space.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Assignment;

import java.util.Scanner;

public class AllIndicesOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int B = sc.nextInt();

        int[] result = allIndices(A, B);

        System.out.println("Indices: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();

        sc.close();
    }

    public static int[] allIndices(int[] A, int B) {
        // Start recursion from the first index
        return helper(A, B, 0);
    }

    private static int[] helper(int[] A, int B, int i) {
        // Base case: all elements have been processed
        if (i == A.length) {
            return new int[0];
        }

        // Recursively find all occurrences from the next index
        int[] ans = helper(A, B, i + 1);

        // If the current element matches B
        if (A[i] == B) {
            // Create a new array to include the current index
            int[] newArr = new int[ans.length + 1];

            // Store the current index first
            newArr[0] = i;

            // Copy the remaining indices from ans
            for (int j = 1; j < newArr.length; j++) {
                newArr[j] = ans[j - 1];
            }

            return newArr;
        } 
        else {
            // Current element does not match B
            return ans;
        }
    }
}
