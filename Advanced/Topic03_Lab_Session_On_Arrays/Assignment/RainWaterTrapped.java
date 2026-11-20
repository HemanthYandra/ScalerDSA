/*
    Approach

    Prefix Maximum / Suffix Maximum Arrays

    1. For every index i, the amount of water that can be stored
       depends on the tallest building on its left and the
       tallest building on its right.

    2. Create two auxiliary arrays:

       - lMax[] : stores the maximum height from index 0 to i.
       - rMax[] : stores the maximum height from index i to N - 1.

    3. Calculate the Prefix Maximum (lMax[]):

       - Initialize lMax[0] = A[0].
       - Traverse the array from left to right, starting from i = 1.
       - For every index, calculate:

         lMax[i] = Math.max(lMax[i - 1], A[i])

       This ensures that lMax[i] stores the tallest building
       encountered from the beginning up to index i.

    4. Calculate the Suffix Maximum (rMax[]):

       - Initialize rMax[N - 1] = A[N - 1].
       - Traverse the array from right to left, starting from
         i = N - 2.
       - For every index, calculate:

         rMax[i] = Math.max(rMax[i + 1], A[i])

       This ensures that rMax[i] stores the tallest building
       encountered from index i to the end of the array.

    5. Calculate the trapped rainwater:

       - Traverse the array from index 0 to N - 1.
       - Calculate the water level at each index using:

         waterHeight = Math.min(lMax[i], rMax[i])

       - Calculate the amount of water stored above the
         current building using:

         amountOfWater = waterHeight - A[i]

       - Add the amount of water to the total:

         ans += amountOfWater

    6. After processing all indices, return ans containing
       the total amount of trapped rainwater.

    Complexity Analysis

    Time : O(N)
        We traverse the array three times:
        - First traversal to calculate lMax[].
        - Second traversal to calculate rMax[].
        - Third traversal to calculate the trapped rainwater.

        Each traversal takes O(N) time.

    Space : O(N)
        We use two auxiliary arrays, lMax[] and rMax[],
        each of size N.

    Note: This approach can be further optimized to O(1)
          auxiliary space using the Two Pointers Technique.
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

        int result = trap(A);

        System.out.println(result);

        sc.close();
    }

    public static int trap(int[] A) {
        int N = A.length;
        int ans = 0;

        int[] lMax = new int[N]; // To store Prefix Maximum
        int[] rMax = new int[N]; // To store Suffix Maximum

        // Calculate Left Maximum
        lMax[0] = A[0];
        for (int i = 1; i < N; i++) {
            lMax[i] = Math.max(lMax[i - 1], A[i]);
        }

        // Calculate Right Maximum
        rMax[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], A[i]);
        }

        // Calculate Trapped Water
        for (int i = 0; i < N; i++) {
            int waterHeight = Math.min(lMax[i], rMax[i]);
            int amountOfWater = waterHeight - A[i];
            ans += amountOfWater;
        }

        return ans;
    }
}
