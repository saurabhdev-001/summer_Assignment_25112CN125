
import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to test");
        String s = sc.nextLine();
        if (check(s)) {
            System.out.println("entered string is a palindrome");

        } else {
            System.out.println("entered string is not a palindrome");
        }

    }

    static boolean check(String s) {

        int l = s.length();
        if (l == 0) {
            return true;
        }
        int mid = (l - 1) / 2;
        int a = 0;
        while (a <= mid) {
            if (s.charAt(a) == s.charAt(l - 1 - a)) {
                a++;
            } else {
                return false;
            }

        }
        return true;

    }
}
