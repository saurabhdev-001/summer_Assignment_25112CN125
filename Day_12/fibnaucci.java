
import java.util.Scanner;

public class fibnaucci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total term in fibnaucci series");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.print("invalid input");
        } else if (n == 1) {
            System.out.print(0);
        } else if (n == 2) {
            System.out.print("0\t1");
        } else {
            int prev = 1;
            int pprev = 0;
            int spare = 0;
            System.out.print(pprev + " ");
            System.out.print(prev + " ");
            for (int a = 3; a <= n; a++) {
                System.out.print(pprev + prev + " ");
                spare = prev;
                prev = pprev + prev;
                pprev = spare;
            }
        }
    }
}
