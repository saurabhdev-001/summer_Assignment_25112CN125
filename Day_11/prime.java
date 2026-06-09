
import java.util.Scanner;

public class prime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(" the no is neither prime nor composite ");
        } else {
            if (prime(n)) {
                System.out.println("the entered no is prime");

            } else {
                System.out.println("entered no is not prime");
            }
        }
    }

    static boolean prime(int n) {
        for (int a = 2; a < n; a++) {
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }
}
