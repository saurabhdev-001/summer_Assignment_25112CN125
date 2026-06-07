
import java.util.Scanner;

public class hollow_square {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of sides of the square");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;
        for (int a = 1; a <= n; a++) {
            for (b = 1; b <= n; b++) {
                if (a == 1 || a == n) {
                    System.out.print("*");
                } else {
                    if (b == 1 || b == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }

    }

}
