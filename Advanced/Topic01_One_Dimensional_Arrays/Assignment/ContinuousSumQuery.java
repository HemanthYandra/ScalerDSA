/*
	Approach

	The key idea: instead of adding P to every beggar from L to R directly
	(which is O(R - L + 1) per query), we record just two "events":

		- At index L: "start adding P from here onward."
		- At index R + 1: "stop adding P from here onward"
		  (i.e. cancel out the P we started at L).

	If we later take a running/prefix sum over these events, the P
	automatically stays "active" for every index between L and R,
	and switches off exactly after R. That's the whole trick.

	1. Create a difference array arr of size A + 1.
		- Beggars are numbered from 1 to A.
		- arr uses 1-based indexing because the queries
		  use 1-based beggar positions.

	2. For every donation query [L, R, P]:
		- arr[L] += P
		  => "turn on" a +P contribution starting at beggar L.
		- If R < A: arr[R + 1] -= P
		  => "turn off" that same +P contribution right after beggar R,
		     so it doesn't leak into beggars beyond R.
		- If R == A, there's nothing to turn off — the donation's
		  effect simply runs off the end of the array, so no
		  subtraction is needed.

	3. Create a separate prefix sum array pSum.
		- pSum[i] stores the total donation received by beggar i.
		- Calculate it using:
		  pSum[i] = pSum[i - 1] + arr[i]
		- Intuition: as i increases, pSum[i] carries forward every
		  "turn on" (+P) event that has happened so far and removes
		  every "turn off" (-P) event that has happened so far.
		  So at any index i, pSum[i] is exactly the sum of P values
		  for all queries whose range [L, R] covers i.

	4. Copy the prefix sum values into the result array.
		- Beggar 1 -> result[0]
		- Beggar 2 -> result[1]
		- ...
		- Beggar A -> result[A - 1]

	5. Return the result array.

	Example

		A = 5

		Queries:
		(1, 2, 10)
		(2, 3, 20)
		(2, 5, 25)

		After recording the range updates:
		Query 1: arr[1] += 10, arr[3] -= 10   -> +10 active for beggars 1-2
		Query 2: arr[2] += 20, arr[4] -= 20   -> +20 active for beggars 2-3
		Query 3: arr[2] += 25                 -> +25 active for beggars 2-5 (R = A, runs to the end)

		arr = [0, 10, 45, -10, -20, 0]

		Prefix sum (each step carries forward what's "on" and removes what just turned "off"):
		pSum[1] = 10                 (only query 1's +10 is on)
		pSum[2] = 10 + 45  = 55      (query 1's +10, query 2's +20, query 3's +25 all on)
		pSum[3] = 55 - 10  = 45      (query 1's +10 turns off after beggar 2)
		pSum[4] = 45 - 20  = 25      (query 2's +20 turns off after beggar 3)
		pSum[5] = 25 + 0   = 25      (only query 3's +25 still on, runs to the end)

		pSum = [0, 10, 55, 45, 25, 25]

		Final result:

		[10, 55, 45, 25, 25]

	Complexity Analysis

	Time : O(A + Q)
		- Processing Q queries takes O(Q).
		- Calculating the prefix sum takes O(A).
		- Creating the result array takes O(A).

	Space : O(A)
		- Difference array requires O(A) space.
		- Prefix sum array requires O(A) space.
		- Result array requires O(A) space.
*/

package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class ContinuousSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of beggars: ");
        int A = sc.nextInt();

        System.out.print("Enter the number of queries: ");
        int Q = sc.nextInt();

        int[][] B = new int[Q][3];

        System.out.println("Enter the queries (L R P): ");
        for (int i = 0; i < Q; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
            B[i][2] = sc.nextInt();
        }

        int[] result = solve(A, B);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int A, int[][] B) {
        // 1-indexed, so Size is A + 1
        int[] arr = new int[A + 1];

        // For each query, mark a "turn on" event at L and a
		// "turn off" event at R + 1, instead of updating every
		// index from L to R directly.
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];    // Start (s)
            int R = B[i][1];    // End (e)
            int P = B[i][2];    // Value (val)

			// Turn on +P starting from beggar L
            arr[L] += P;

			// Turn off (cancel) right after R
            if (R < A) {
                arr[R + 1] -= P;
            }
        }

        // Separate prefix sum array
        int[] pSum = new int[A + 1];

        // Calculate prefix sum
		// pSum[i] accumulates all +P/-P events from index 1 up to i,
		// so it equals the total donation received by beggar i
        for (int i = 1; i <= A; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        // Convert 1-indexed prefix sum to 0-indexed result
        int[] result = new int[A];

        for (int i = 0; i < A; i++) {
            result[i] = pSum[i + 1];
        }

        return result;
    }
}
