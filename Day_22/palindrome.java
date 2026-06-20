
import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        if (check(a)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not  palindrome");
        }

    }

    static boolean check(String s) {

        int a = 0;
        char ch;
        int l = s.length();

        while (a < l / 2) {
            ch = s.charAt(l - 1 - a);
            if (ch != s.charAt(a)) {
                return false;

            }
            a++;

        }
        return true;

    }
}
