
import java.util.Scanner;

public class Lcm {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Lcm of the number is " + lcm(a, b));

    }

    static int lcm(int a, int b) {

        int n = 2;
        int common = 1;
        int min = Math.min(a, b);
        while (n <= min) {
            if (a % n == 0 && b % n == 0) {
                a = a / n;
                b = b / n;
                common = common * n;
            } else {
                n++;
            }
        }
        return a * b * common;
    }
}
