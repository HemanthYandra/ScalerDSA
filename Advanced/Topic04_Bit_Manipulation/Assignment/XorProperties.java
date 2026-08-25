package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class XorProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int a = sc.nextInt();

        solve(a);

        sc.close();
    }

    public static void solve(int A) {

        // XOR with 0 always results in the same number
        int withZero = A ^ 0;
        System.out.println("A ^ 0 = " + withZero);

        // XOR with 1 toggles the least significant bit
        // Even number -> Odd number
        // Odd number -> Even number
        int withOne = A ^ 1;
        System.out.println("A ^ 1 = " + withOne);

        // XOR with itself always results in 0
        int withNumberItself = A ^ A;
        System.out.println("A ^ A = " + withNumberItself);
    }
}
