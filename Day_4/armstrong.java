
import java.util.Scanner;

public class armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        check(n);

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
            System.out.println("entered no is armstrong");

        } else {
            System.out.println("entered no is not palindrome");
        }

    }
}
