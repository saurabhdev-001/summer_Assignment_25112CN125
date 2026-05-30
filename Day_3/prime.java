
import java.util.Scanner;

public class prime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        prime(num);

    }

    static void prime(int num) {
        for (int a = 2; a < num; a++) {
            if (num % a == 0) {
                System.out.println("the number is not prime");
                return;
            }
        }
        System.out.println("the entered no is prime");
    }
}
