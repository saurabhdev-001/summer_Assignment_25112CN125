
import java.util.Scanner;

public class recsum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println("the sum of the digits " + sum_digits(n));

    }

    static int sum_digits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum_digits(n / 10);
    }
}
