
import java.util.Scanner;

public class revnum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        System.out.println("reverse of the number is : " + revdigit(num));

    }

    static int revdigit(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
