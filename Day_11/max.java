
import java.util.Scanner;

public class max {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -999;
        if (m > n) {
            max = m;

        } else if (m == n) {
            System.out.println("both numbers are equal");
        } else {
            max = n;
        }
        if (max != -999) {
            System.out.println("max of the two numbers is " + max);
        }

    }

}
