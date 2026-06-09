
import java.math.BigInteger;
import java.util.Scanner;

public class fact {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("invalid input");
        } else {
            System.out.println("factorial of the entered no is " + fact(n));
        }

    }

    static BigInteger fact(int n) {
        BigInteger ans = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

}
