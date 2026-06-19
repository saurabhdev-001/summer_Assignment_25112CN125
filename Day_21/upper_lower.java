
import java.util.Scanner;

public class upper_lower {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();

        System.out.println((String) change(a));

    }

    static String change(String s) {

        int a = 0;
        char ch;
        StringBuilder ans = new StringBuilder();
        while (a < s.length()) {
            ch = s.charAt(a);
            a++;
            if (ch >= 97 && ch <= 122) {
                ch = (char) (ch - 'a' + 'A');
            }
            ans.append(ch);
        }
        return ans.toString();

    }
}
