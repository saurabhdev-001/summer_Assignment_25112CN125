
import java.util.Scanner;

public class recfib {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("the no is invalid");
        }
        System.out.println(" the nth fibnaucci term of the series is " + fib(n));

    }

    static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
