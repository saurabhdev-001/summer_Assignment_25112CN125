
import java.util.Scanner;

public class recfact {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println("factorial of the given no is " + fact(n));

    }

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }

}
