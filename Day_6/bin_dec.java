
import java.util.Scanner;

public class bin_dec {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        System.out.println("the decimal form the given no is " + convert(n));

    }

    static int convert(int n) {
        int sum = 0;
        int count = 0;
        while (n > 0) {
            sum = sum + (int) Math.pow(2, count) * (n % 10);
            n = n / 10;
            count++;
        }
        return sum;

    }
}
