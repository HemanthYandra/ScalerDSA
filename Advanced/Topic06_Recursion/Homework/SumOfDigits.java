/*
	Approach

	1. If A becomes 0, return 0 as the base case because
	   there are no digits left to process.

	2. Extract the last digit of A using:
	   
	   lastDigit = A % 10

	3. Remove the last digit from A using:
	   
	   A / 10

	4. Recursively calculate the sum of the remaining digits
	   and add the current last digit to it.

	5. Continue until A becomes 0.

	Complexity Analysis

	Time : O(D)
	Space : O(D)

	Where D is the number of digits in A.
*/

package Advanced.Topic06_Recursion.Homework;

import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Positive Number: ");
        int A = sc.nextInt();

        System.out.println(sumOfDigits(A));

        sc.close();
    }

    public static int sumOfDigits(int A) {
        // Base case: when A becomes 0, there are no digits left
        if(A == 0) {
            return 0;
        }

        // Extract the last digit of A
        int lastDigit = A % 10;

        // Add the last digit to the sum of the remaining digits
        return lastDigit + sumOfDigits(A / 10);
    }
}
