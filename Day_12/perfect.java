
import java.util.Scanner;

public class perfect {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();

        if (check(n)) {
            System.out.println("entered no is perfect");
        } else {
            System.out.println("entered no is not perfect");
        }
    }

    static boolean check(int n) {
        int sum = 0;
        if (n < 0) {
            return false;
        }
        for (int a = 1; a < n; a++) {
            if (n % a == 0) {
                sum = sum + a;
            }
        }
        return n == sum;
    }
}
