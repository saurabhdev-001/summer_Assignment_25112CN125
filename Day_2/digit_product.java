
import java.util.Scanner;

public class digit_product {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        System.out.println("product of the digit is: " + product_digit(num));
    }

    static int product_digit(int num) {
        int prod = 1;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            prod = prod * (num % 10);
            num = num / 10;
        }
        return prod;
    }
}
