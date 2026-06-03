
import java.util.Scanner;

public class primefact {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        int max = -1;
        if (n <= 0) {
            System.out.println("invalid input");

        } else {
            for (int a = 1; a <= n; a++) {
                if (n % a == 0) {
                    if (prime(a)) {
                        max = a;
                    }
                }
            }
            if (max == -1) {
                System.out.println("no has no prime factor ");
            } else {
                System.out.println("largest prime factor is " + max);
            }

        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int a = 2; a < n; a++) {
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }
}
