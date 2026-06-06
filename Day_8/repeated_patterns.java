
import java.util.Scanner;

public class repeated_patterns {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;

        for (int a = 1; a <= n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(a);

            }

            System.out.println();
        }

    }

}
