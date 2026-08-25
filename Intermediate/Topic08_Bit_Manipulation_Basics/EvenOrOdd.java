package Intermediate.Topic08_Bit_Manipulation_Basics;

import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        int result = solve(a);

        if(result == 1) {
            System.out.println(a + " is odd number.");
        }
        else {
            System.out.println(a + " is even number.");
        }

        sc.close();
    }

    public static int solve(int a) {

        // Check the least significant bit
        // 1 -> Odd
        // 0 -> Even
        int result = a & 1;

        return result;
    }
}
