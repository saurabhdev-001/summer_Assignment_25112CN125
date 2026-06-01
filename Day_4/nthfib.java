
import java.util.Scanner;

public class nthfib {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term of the fibnaucci series");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print(0);
        } else if (n == 1) {
            System.out.print("1");
        } else {
            int prev = 1;
            int pprev = 0;
            int spare = 0;
            for (int a = 3; a <= n; a++) {
                spare = prev;
                if (a == n) {
                    System.out.println("nth term of fibnaucci series is :" + (pprev + prev));
                }
                prev = pprev + prev;
                pprev = spare;
            }

        }
    }
}
