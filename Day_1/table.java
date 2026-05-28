
import java.util.Scanner;

public class table {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which table you wanted to print");
        int n = sc.nextInt();
        generate_table(n);
    }

    static void generate_table(int n) {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a * n);
        }

    }
}
