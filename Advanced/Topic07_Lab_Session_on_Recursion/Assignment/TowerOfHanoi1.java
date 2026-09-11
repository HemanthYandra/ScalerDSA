/*
	Approach

	1. We need to move A disks from Tower 1 (source) to Tower 3
	   (destination) using Tower 2 as a helper.

	2. To move N disks:
	   - First, move the top N-1 disks from source to helper (S to H).
	   - Move the largest disk N from source to destination (S to D).
	   - Finally, move the N-1 disks from helper to destination (H to D).

	3. The base case is N == 0.
	   When there are no disks left to move, simply return.

	4. Each move is stored as:
	   
	       {disk, source, destination}

	   For example:
	       {1, 1, 3}

	   means move disk 1 from Tower 1 to Tower 3.

	5. An ArrayList is used to store all the moves because the
	   number of moves is not known beforehand.

	6. After recursion is complete, convert the ArrayList into
	   the required int[][] array.

	Complexity Analysis

	Time : O(2^N)
        The total number of moves is 2^N - 1.

	Space : O(2^N)
        The recursion stack requires O(N) space, while storing all
	    the moves requires O(2^N) space.

	
	
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Assignment;

import java.util.*;
public class TowerOfHanoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Disks: ");
        int A = sc.nextInt();

        int[][] result = towerOfHanoi(A);

        // Print every move
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        sc.close();
    }

    public static int[][] towerOfHanoi(int A) {
        // list to store each move as {disk, source, destination}
        ArrayList<int[]> moves = new ArrayList<>();

        // start: move A disks from tower 1 to tower 3, using tower 2 as helper
        // hanoi(N, S, H, D, moves)
        hanoi(A, 1, 2, 3, moves);

        // Convert ArrayList into the required 2D array
        int[][] result = new int[moves.size()][3];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(i);
        }

        return result;
    }

    private static void hanoi(int N, int S, int H, int D, ArrayList<int[]> moves) {
        // base case: no disks left to move
        if (N == 0) {
            return;
        }

        // step 1: move the top N-1 disks from S to H
        // using D as the temporary helper
        hanoi(N - 1, S, D, H, moves);

        // step 2: move the Nth (largest remaining) disk
        // directly from S to D
        moves.add(new int[] { N, S, D });

        // step 3: move the N-1 disks (now on H) from H to D
        // using S as the temporary helper
        hanoi(N - 1, H, S, D, moves);
    }
}
