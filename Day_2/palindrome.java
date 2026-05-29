
import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        check(num);

    }

    static void check(int num) {
        int rev = 0;
        int n = num;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev == num) {
            System.out.println("the no is palindrome ");
        } else {
            System.out.println("the no is not palindrome ");
        }

    }
}
