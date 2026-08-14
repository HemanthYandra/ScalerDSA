package Intermediate.Topic13_Contest_1;

import java.util.*;
public class RangeDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Array elements: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the row size: ");
        int r = sc.nextInt();

        System.out.print("Enter the column size: ");
        int c = sc.nextInt();

        System.out.println("Enter the queries: ");
        int[][] B = new int[r][c];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[] res = solve(A, B);

        System.out.println(Arrays.toString(res));

        sc.close();
    }

    public static int[] solve(int[] A, int[][] B) {
        
    }
}
