package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.Scanner;

public class OrProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int a = sc.nextInt();

        solve(a);

        sc.close();
    }

    public static void solve(int A) {

        // OR with 0 always results in the same number
        int withZero = A | 0;
        System.out.println("A | 0 = " + withZero);

        // OR with 1 sets the least significant bit to 1
        // Even number -> Next odd number
        // Odd number -> Remains unchanged
        int withOne = A | 1;
        System.out.println("A | 1 = " + withOne);

        // OR with itself always results in the same number
        int withNumberItself = A | A;
        System.out.println("A | A = " + withNumberItself);
    }
}
