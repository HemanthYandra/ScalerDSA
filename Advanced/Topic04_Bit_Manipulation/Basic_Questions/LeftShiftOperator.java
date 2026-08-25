package Advanced.Topic04_Bit_Manipulation.Basic_Questions;

import java.util.*;
public class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number(a): ");
        int a = sc.nextInt();

        System.out.print("Enter left shift value(b): ");
        int b = sc.nextInt();

        solve(a, b);

        sc.close();
    }

    public static void solve(int a, int b) {
        /*
            int a = 5; -> In binary = 101
            System.out.println(a << 0); // 5  -> In binary = 101
            System.out.println(a << 1); // 10 -> In binary = 1010
            System.out.println(a << 2); // 20 -> In binary = 10100
            System.out.println(a << 3); // 40 -> In binary = 101000
            System.out.println(a << 4); // 80 -> In binary = 1010000
         */

        // Left shift moves all bits to the left by b positions
        // For positive numbers: a << i = a * 2^i
        int result = a << b;

        System.out.println("a << b is: " + result);
    }
}
