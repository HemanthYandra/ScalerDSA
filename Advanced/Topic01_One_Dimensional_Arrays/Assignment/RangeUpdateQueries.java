package Advanced.Topic01_One_Dimensional_Arrays.Assignment;

import java.util.*;
public class RangeUpdateQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of queries: ");
        int Q = sc.nextInt();

        int[][] queries = new int[Q][3];

        System.out.println("Enter the queries (L R P): ");
        for (int i = 0; i < Q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }

        int[] result = solve(n, queries);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    public static int[] solve(int n, int[][] queries) {
        int[] arr = new int[n];

        // Store each increment at its starting index
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];

            // Add the value at the index from where
            // the increment should start
            arr[start] += value;

            if(end + 1 < n) {
                arr[end + 1] -= value;
            }
        }

        // Calculate the prefix sum in-place to propagate
        // each increment to all following indices
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        // Return the final array after applying
        // all the range increment queries
        return arr;
    }
}
