/*
	Approach

	1. Calculate the total protein from all dishes Sam likes
	   (B[i] == 1).

	2. Use a sliding window of size C to find the maximum
	   additional protein from dishes Sam dislikes (B[i] == 0).

	3. Add the protein of a disliked dish to the window sum
	   only when B[i] == 0.

	4. Calculate the initial window sum of size C.

	5. Slide the window by removing the contribution of the
	   outgoing element and adding the contribution of the
	   incoming element.

	6. Keep track of the maximum window sum.

	7. Return the sum of the protein from liked dishes and
	   the maximum additional protein.

	Complexity Analysis

	Time : O(N)
	Space : O(1)
*/

package Intermediate.Topic12_Problem_Solving_Session_1;

import java.util.Scanner;

public class Dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of kinds of dishes: ");
        int N = sc.nextInt();

        // Create an array to store the protein amounts
        int[] A = new int[N];

        // Create an array to store Sam's dish preferences
        int[] B = new int[N];

        // Read the protein amount of each dish
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Read Sam's preferences for each dish
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // Read the no. of consecutive dishes to force Sam to eat
        int C = sc.nextInt();

        // Call solve() and print the maximum protein Sam can get
        System.out.println(solve(A, B, C));

        sc.close();
    }

    public static long solve(int[] A, int[] B, int C) {

        long ans = 0;
        long sum = 0;
        long maxSum = 0;

        // Calculate protein from all liked dishes
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                ans += A[i];
            }
        }

        // If C is 0, Sam eats only the dishes he likes
        if (C == 0) {
            return ans;
        }

        // Calculate the initial window sum
        for (int i = 0; i < C; i++) {
            if (B[i] == 0) {
                sum += A[i];
            }
        }

        maxSum = sum;

        // Slide the window
        for (int i = C; i < A.length; i++) {

            // Remove the outgoing element
            if (B[i - C] == 0) {
                sum -= A[i - C];
            }

            // Add the incoming element
            if (B[i] == 0) {
                sum += A[i];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return ans + maxSum;
    }
}
