
import java.util.Scanner;

public class factor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();
        System.out.println("factors of the no are");
        for (int a = 1; a <= n; a++) {
            if (n % a == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
