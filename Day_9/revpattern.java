
import java.util.Scanner;

public class revpattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        print(n);

    }

    static void print(int n) {
        int b;
        for (int a = n; a > 0; a--) {
            for (b = a; b > 0; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
