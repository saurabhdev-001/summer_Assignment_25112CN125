
import java.util.Scanner;

public class range_armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range (both included)");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int a = start; a <= end; a++) {
            check(a);
        }
    }

    static int count_digits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static void check(int n) {
        int digits = count_digits(n);
        int num = n;
        int sum = 0;
        while (n > 0) {

            sum = sum + (int) Math.pow(n % 10, digits);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println(" no " + num + " is armstrong");

        }
    }
}
