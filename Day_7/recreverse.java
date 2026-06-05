
import java.util.Scanner;

public class recreverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println("the reverse of the entered no is " + revnum(n, 0));

    }

    static int revnum(int n, int prev) {
        if (n == 0) {
            return prev;
        }
        prev = prev * 10 + n % 10;
        return revnum(n / 10, prev);

    }
}
