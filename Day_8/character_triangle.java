
import java.util.Scanner;

public class character_triangle {

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
            for (b = 1; b <= a; b++) {
                System.out.print(ch);
                ch = ++ch;

            }
            ch = 'A';
            System.out.println();
        }

    }

}
