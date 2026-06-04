
import java.util.Scanner;

public class power {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x and n respectively");
        int x = sc.nextInt();
        int n = sc.nextInt();
        long ans = 1;
        while (n > 0) {
            ans = ans * x;
            n--;

        }
        System.out.println("ans is " + ans);
    }
}
