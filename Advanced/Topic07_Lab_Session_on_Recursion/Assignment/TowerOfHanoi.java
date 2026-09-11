/*
	Approach

	1. To move N disks from Source (src) to Destination (dest), we first
	   need to move the top N-1 disks from Source (src) to Helper (helper).

	2. After moving N-1 disks, move the largest disk N from
	   Source (src) to Destination (dest).

	3. Finally, move the N-1 disks from Helper (helper) to
	   Destination (dest).

	4. The base case is when N == 1. In this case, directly move
	   the disk from Source (src) to Destination (dest).

	5. The same process is repeated recursively until all disks
	   are moved to the destination.

	Complexity Analysis

	Time : O(2^N)
	       The total number of moves is 2^N - 1.

	Space : O(N)
	        Space complexity is O(N) because the maximum recursion
	        depth is N.
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
        String src = sc.nextLine();

        System.out.print("Enter the destination tower: ");
        String dest = sc.nextLine();

        System.out.print("Enter the helper tower: ");
        String helper = sc.nextLine();

        hanoi(N, src, dest, helper);

        sc.close();
    }

    public static void hanoi(int N, String src, String dest, String helper) {

       // Base case: when only one disk is left, move it directly
       if (N == 1) {
          System.out.println("Move the disk " + N + " from " + src + " to " + dest);
          return;
       }

       // Move N-1 disks from Source to Helper
       hanoi(N - 1, src, helper, dest);

       // Move the largest disk from Source to Destination
       System.out.println("Move the disk " + N + " from " + src + " to " + dest);

       // Move N-1 disks from Helper to Destination
       hanoi(N - 1, helper, dest, src);
    }
}
