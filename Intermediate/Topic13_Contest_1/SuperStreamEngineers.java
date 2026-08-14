/*
Approach

	1. Use a fixed-size sliding window of size B.

	2. Calculate the sum of the first B elements of the array.

	3. Check whether the average of this window is less than
	   or equal to C.
	   - If yes, return 1.

	4. Slide the window one position at a time.
	   - Remove the element that goes out of the window.
	   - Add the new element that enters the window.

	5. For every new window, calculate:
	   
	   sum / B

	   and check whether it is less than or equal to C.

	6. If any window satisfies the condition, return 1.

	7. If no window satisfies the condition after checking
	   all possible windows, return 0.


Complexity Analysis

	Time : O(N)
		- The first window takes O(B) time.
		- Each remaining element is added and removed once.
		- Therefore, the overall time complexity is O(N).

	Space : O(1)
		- Only a few variables are used.
		- No additional data structure is required.
*/

package Intermediate.Topic13_Contest_1;

import java.util.*;
public class SuperStreamEngineers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter B value: ");
        int B = sc.nextInt();

        System.out.print("Enter C value: ");
        int C = sc.nextInt();

        System.out.println(solve(A, B, C));

        sc.close();
    }

    public static int solve(int[] A, int B, int C) {
        int n = A.length;

        long sum = 0;

        // Calculate the sum of the first window of size B
        int i = 0;
        while(i < B) {
            sum += A[i];
            i++;
        }

        // Check the average of the first window
        if(sum / B <= C) {
            return 1;
        }

        // Slide the window
        int s= 1;
        int e = B;
        while(e < n) {
            // Remove the left element and add the new right element
            sum = sum - A[s - 1] + A[e];

            // Check the average of the current window
            if (sum / B <= C) {
                return 1;
            }

            s++;
            e++;
        }

        return 0;
    }
}
