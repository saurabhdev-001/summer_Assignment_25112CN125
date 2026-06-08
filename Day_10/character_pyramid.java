
import java.util.Scanner;

public class character_pyramid {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;
        char ch = 'A';
        for (int a = 1; a <= n; a++) {
            ch = 'A';
            for (b = 1; b <= (2 * n - a); b++) {
                System.out.print(" ");
            }
            for (b = 1; b <= 2 * a - 1; b++) {
                if (ch >= 'A' + a) {
                    ch--;
                    ch--;
                }
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
