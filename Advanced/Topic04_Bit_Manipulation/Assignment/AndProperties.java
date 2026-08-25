

package Advanced.Topic04_Bit_Manipulation.Assignment;

import java.util.*;
public class AndProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int a = sc.nextInt();

        solve(a);

        sc.close();
    }

    public static void solve(int A) {

        // AND with 0 always results in 0
        int withZero = A & 0;
        System.out.println("A & 0 = " + withZero);

        // AND with 1 checks the least significant bit
        // 0 -> Even, 1 -> Odd
        int withOne = A & 1;
        System.out.println("A & 1 = " + withOne);

        // AND with itself always results in the same number
        int withNumberItself = A & A;
        System.out.println("A & A = " + withNumberItself);
    }
}
