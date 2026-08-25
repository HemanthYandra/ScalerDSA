package Advanced.Topic04_Bit_Manipulation.Basic_Questions;

import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer(a): ");
        int a = sc.nextInt();

        System.out.print("Enter another integer(b): ");
        int b = sc.nextInt();

        System.out.print("Enter shift value(n): ");
        int n = sc.nextInt();

        solve(a, b, n);

        sc.close();
    }

    public static void solve(int a, int b, int n) {

        // Bitwise AND
        int andOperator = a & b;
        System.out.println("a & b = " + andOperator);

        // Bitwise OR
        int orOperator = a | b;
        System.out.println("a | b = " + orOperator);

        // Bitwise XOR
        int xorOperator = a ^ b;
        System.out.println("a ^ b = " + xorOperator);

        // Bitwise NOT of a
        // ~a = -(a + 1)
        int notA = ~a;
        System.out.println("~a = " + notA);

        // Bitwise NOT of b
        // ~b = -(b + 1)
        int notB = ~b;
        System.out.println("~b = " + notB);

        // Check whether a is even or odd
        // Works for both positive and negative integers
        int evenOdd = a & 1;

        if (evenOdd == 1) {
            System.out.println("a is odd");
        } else {
            System.out.println("a is even");
        }

        // Left shift
        int leftShift = a << n;
        System.out.println("a << n = " + leftShift);

        // Signed right shift
        int rightShift = a >> n;
        System.out.println("a >> n = " + rightShift);

        // Unsigned right shift
        int unsignedRightShift = a >>> n;
        System.out.println("a >>> n = " + unsignedRightShift);

        // XOR with itself
        int xorWithItself = a ^ a;
        System.out.println("a ^ a = " + xorWithItself);

        // AND with zero
        int andWithZero = a & 0;
        System.out.println("a & 0 = " + andWithZero);

        // OR with zero
        int orWithZero = a | 0;
        System.out.println("a | 0 = " + orWithZero);

        // XOR with zero
        int xorWithZero = a ^ 0;
        System.out.println("a ^ 0 = " + xorWithZero);

        // Demonstrate overflow using left shift
        int overflow = 1 << 31;
        System.out.println("1 << 31 = " + overflow);
    }
}
