/*
    Approach

    Sliding Window

    1. Count the number of elements in the array that are less than or equal
        to B. This count represents the size of the window that should contain
        all the elements less than or equal to B.

    2. Consider the first window of this size and count how many elements
        are greater than B.

        These elements are the unwanted elements inside the window. Each
        unwanted element needs to be swapped with an element less than or
        equal to B from outside the window.

    3. Slide the window from left to right using two pointers:
        - Remove the element that is leaving the window.
        - Add the element that is entering the window.

        If the leaving or entering element is greater than B, update the
        count of unwanted elements accordingly.

    4. For every window, keep track of the minimum number of elements
        greater than B.

        The window with the minimum number of elements greater than B
        requires the minimum number of swaps.

    5. Return the minimum count as the answer.

    Complexity Analysis

    Time : O(n)
        We first traverse the array to find the window size and then use
        a sliding window to traverse the array once more.
        Therefore, the overall time complexity is O(n).

    Space : O(1)
        Only a fixed number of variables are used.
        No additional data structure is required.

    Note: You can find the same question in the below path
        Intermediate.Topic06_Sliding_Window_and_Contribution_Technique.Homework.Fixed_Sliding_Window
*/

package Advanced.Topic02_Two_Dimensional_Arrays.Homework;

import java.util.*;
public class MinimumSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the value(B): ");
        int B = sc.nextInt();

        int result = solve(A, B);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A, int B) {
        int n = A.length;

        // Count how many elements are <= B
        // This becomes the required window size
        int windowSize = 0;

        for(int i = 0; i < n; i++) {
            if (A[i] <= B) {
                windowSize++;
            }
        }

        // If there are no elements <= B, no swaps are required
        if(windowSize == 0) {
            return 0;
        }

        // Count elements > B in the first window
        int badCount = 0;

        // Step 1: Build the first window
        int i = 0;
        while( i < windowSize) {
            if(A[i] > B) {
                badCount++;
            }
            i++;
        }

        // Step 2: Store the number of swaps required for the first window
        int minSwaps = badCount;

        // Step 3: Slide the window
        int s = 1;
        int e = windowSize;
        while(e < n) {
            // Remove the element leaving the window
            if(A[s - 1] > B) {
                badCount--;
            }

            // Add the element entering the window
            if (A[e] > B) {
                badCount++;
            }

            // Update the minimum number of required swaps
            minSwaps = Math.min(minSwaps, badCount);

            s++;
            e++;
        }

        return minSwaps;
    }
}
