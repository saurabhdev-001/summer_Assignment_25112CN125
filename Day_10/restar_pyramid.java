
import java.util.Scanner;

public class restar_pyramid {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;
        for (int a = n; a >= 0; a--) {
            for (b = n; b >= a + 1; b--) {
                System.out.print(" ");
            }
            for (b = 1; b <= 2 * a - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
