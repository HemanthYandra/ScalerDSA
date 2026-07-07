import java.util.*;

public class CountOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(v1(A));

        sc.close();
    }

    public static int v2(int A) {
        int c = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if(i == A / i) {
                    c++;
                }
                else {
                    c += 2;
                }
            }
        }

        return c;
    }

    public static int v1(int A) {
        int c = 0;
        for(int i = 1; i <= A; i++) {
            if(A % i == 0) {
                c++;
            }
        }

        return c;
    }
}
