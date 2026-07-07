/*
## Approach

- Sort the array.
- Use two pointers:
  - One pointer starts from the beginning.
  - The other starts from the end.
- Compare the current sum with `B`:
  - If equal, return `1`.
  - If smaller, move the left pointer.
  - If larger, move the right pointer.
- If no pair is found, return `0`.

- Complexity Analysis
   Time  : O(N LogN)
   Space : O(1) (excluding sorting implementation)
 */

import java.util.*;

public class GoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(solve(A, B));
        sc.close();
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;

        while (i < j) {
            long sum = (long) A[i] + A[j];

            if (sum == B) {
                return 1;
            } else if (sum < B) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }
}