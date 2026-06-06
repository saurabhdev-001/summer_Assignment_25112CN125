
import java.util.Scanner;

public class halfpyramid {

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
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
