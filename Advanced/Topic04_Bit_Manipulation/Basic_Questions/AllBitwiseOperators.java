package Advanced.Topic04_Bit_Manipulation.Basic_Questions;

import java.util.*;
public class AllBitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number(a): ");
        int a = sc.nextInt();

        System.out.print("Enter any positive number(b): ");
        int b = sc.nextInt();

        solve(a, b);

        sc.close();
    }

    public static void solve(int a, int b) {

        // Bitwise AND: Sets a bit to 1 only when both bits are 1
        int andOperator = a & b;
        System.out.println("a & b = " + andOperator);

        // Bitwise OR: Sets a bit to 1 when at least one bit is 1
        int orOperator = a | b;
        System.out.println("a | b = " + orOperator);

        // Bitwise XOR: Sets a bit to 1 when the two bits are different
        int xorOperator = a ^ b;
        System.out.println("a ^ b = " + xorOperator);

        // Bitwise NOT: Inverts every bit of a
        // ~a = -(a + 1)
        int notA = ~a;
        System.out.println("~a = " + notA);

        // Bitwise NOT: Inverts every bit of b
        // ~b = -(b + 1)
        int notB = ~b;
        System.out.println("~b = " + notB);
    }
}
