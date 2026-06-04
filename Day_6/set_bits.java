
import java.util.Scanner;

public class set_bits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

}
