package Intermediate.Topic08_Bit_Manipulation_Basics;

import java.util.*;
public class RightShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number(a): ");
        int a = sc.nextInt();

        System.out.print("Enter right shift value(b): ");
        int b = sc.nextInt();

        solve(a, b);

        sc.close();
    }

    public static void solve(int a, int b) {

        // Right shift moves all bits to the right by b positions
        // For positive numbers: a >> b = a / 2^b
        int result = a >> b;

        System.out.println("a >> b is: " + result);
    }
}
