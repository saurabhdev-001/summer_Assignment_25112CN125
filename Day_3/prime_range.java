
import java.util.Scanner;

public class prime_range {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit of range (included)");
        int lower = sc.nextInt();
        System.out.println("enter the upper limit of the range (included) ");
        int upper = sc.nextInt();
        prime(upper, lower);

    }

    static void prime(int upper, int lower) {
        boolean is_prime = true;
        if (lower <= 1) {
            lower = 2;
        }
        int n = lower;
        while (n <= upper) {
            for (int a = 2; a < n; a++) {
                if (n % a == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime == true) {
                System.out.println("The no " + n + " is prime");
            }
            is_prime = true;
            n++;
        }
    }

}
