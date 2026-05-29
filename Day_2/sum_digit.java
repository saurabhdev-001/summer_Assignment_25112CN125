
import java.util.Scanner;

public class sum_digit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        System.out.println("sum of the digits of the number is " + digits_sum(num));

    }

    static int digits_sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
