
import java.util.Scanner;

public class print_number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;
        int num;
        for (int a = 1; a <= n; a++) {
            num = a;
            for (b = 1; b <= (2 * n - a); b++) {
                System.out.print(" ");
            }
            for (b = 1; b <= 2 * a - 1; b++) {
                if (num > a) {
                    num = a;
                }
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }
}
