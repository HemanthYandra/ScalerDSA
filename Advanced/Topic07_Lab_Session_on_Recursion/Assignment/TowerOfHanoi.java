/*
	Approach

	1. To move N disks from Source (A) to Destination (B), we first
	   need to move the top N-1 disks from Source (A) to Helper (C).

	2. After moving N-1 disks, move the largest disk N from
	   Source (A) to Destination (B).

	3. Finally, move the N-1 disks from Helper (C) to
	   Destination (B).

	4. The base case is when N == 1. In this case, directly move
	   the disk from Source (A) to Destination (B).

	5. The same process is repeated recursively until all disks
	   are moved to the destination.

	Complexity Analysis

	Time : O(2^N)
        The total number of moves is 2^N - 1.

	Space : O(N)
	   Space complexity is O(N) because the maximum recursion depth is N.
*/

package Advanced.Topic07_Lab_Session_on_Recursion.Assignment;

import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int N = sc.nextInt();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter the source tower: ");
        String A = sc.nextLine();

        System.out.print("Enter the destination tower: ");
        String B = sc.nextLine();

        System.out.print("Enter the helper tower: ");
        String C = sc.nextLine();

        hanoi(N, A, B, C);

        sc.close();
    }

    public static void hanoi(int N, String A, String B, String C) {

       // Base case: when only one disk is left, move it directly
       if (N == 1) {
          System.out.println("Move the disk " + N + " from " + A + " to " + B);
          return;
       }

       // Move N-1 disks from Source (A) to Helper (C)
       hanoi(N - 1, A, C, B);

       // Move the largest disk from Source (A) to Destination (B)
       System.out.println("Move the disk " + N + " from " + A + " to " + B);

       // Move N-1 disks from Helper (C) to Destination (B)
       hanoi(N - 1, C, B, A);
    }
}
