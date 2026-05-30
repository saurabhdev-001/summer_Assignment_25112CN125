
import java.util.Scanner;

public class Gcd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the gcd of the given no is : " + gcd(a, b));

    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
