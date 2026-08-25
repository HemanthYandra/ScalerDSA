/*
    Approach

    Prefix Max / Suffix Max (Running Max Variable)

    1. For every index i, the amount of water that can be stored depends on
       the tallest building on its left and the tallest building on its right.

    2. Create a left[] array where left[i] stores the maximum height of a
       building from index 0 to i.
       - Maintain a running variable maxL, updating it with A[i] as we
         scan left to right, and store it into left[i] at each step.

    3. Create a right[] array where right[i] stores the maximum height of a
       building from index i to n - 1.
       - Maintain a running variable maxR, updating it with A[i] as we
         scan right to left, and store it into right[i] at each step.

    4. For every index from 1 to n - 2, calculate the water stored above
       that building using:

       waterStored = min(left[i], right[i]) - A[i]

    5. Add the water stored at every index to get the total amount of
       trapped rainwater.

    Complexity Analysis

    Time : O(N)
        We traverse the array three times to build the left[], right[]
        arrays and calculate the total trapped water.

    Space : O(N)
        We use two auxiliary arrays, left[] and right[], each of size N.
*/

package Advanced.Topic03_Lab_Session_On_Arrays.Assignment;

import java.util.*;

public class RainWaterTrapped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int result = solve(A);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[] A) {
        int n = A.length;

        // left[i] stores the maximum height from index 0 to i
        int[] left = new int[n];

        // right[i] stores the maximum height from index i to n - 1
        int[] right = new int[n];

        int maxL = A[0];
        int maxR = A[n - 1];

        // Build the left maximum array
        for (int i = 0; i < n; i++) {
            maxL = Math.max(maxL, A[i]);
            left[i] = maxL;
        }

        // Build the right maximum array
        for (int i = n - 1; i >= 0; i--) {
            maxR = Math.max(maxR, A[i]);
            right[i] = maxR;
        }

        int totalWater = 0;

        // Calculate water trapped at each index
        for (int i = 1; i < n - 1; i++) {
            // Water at index i is limited by the shorter of
            // the tallest bars on its left and right
            int waterStored = Math.min(left[i], right[i]) - A[i];

            totalWater += waterStored;
        }

        return totalWater;
    }
}
