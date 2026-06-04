
import java.util.Scanner;

public class dec_bin {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        System.out.println("binary form of the no is " + change(n));
    }

    static int change(int n) {
        if (n == 0) {
            return 0;
        }
        int a = change(n / 2);
        return a * 10 + n % 2;
    }

}
