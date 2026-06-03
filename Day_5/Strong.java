
import java.util.Scanner;

public class Strong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("invalid input");
        } else {
            int num = n;
            int sum = 0;
            while (num > 0) {
                sum = sum + fact(num % 10);
                num = num / 10;
            }
            if (sum == n) {
                System.out.println("entered no is the strong no");
            } else {
                System.out.println("entered no is not the strong no");
            }
        }

    }

    static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;

    }
}
