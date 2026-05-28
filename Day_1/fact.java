
import java.util.Scanner;

public class fact {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println((int) fact(n));
    }

    static int fact(int n) {
        int fact = 1;

        for (int a = n; a >= 1; a--) {
            fact = fact * a;
        }
        return fact;
    }
}
