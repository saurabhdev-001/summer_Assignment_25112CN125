
import java.util.Scanner;

public class reverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        System.out.println(rev(a));
    }

    static String rev(String s) {
        StringBuilder a = new StringBuilder();
        int b = s.length() - 1;
        while (b >= 0) {
            a.append((char) s.charAt(b));
            b--;
        }
        return a.toString();

    }
}
