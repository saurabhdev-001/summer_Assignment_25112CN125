
import java.util.Scanner;

public class compress {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        if (!a.isEmpty()) {
            System.out.println(compress(a));
        }
    }

    static String compress(String s) {
        StringBuilder m = new StringBuilder();
        char ch;
        char prev = s.charAt(0);
        int count = 1;
        for (int a = 1; a < s.length(); a++) {
            ch = s.charAt(a);
            if (prev == ch) {
                count++;
                continue;
            } else {
                m.append(prev);
                m.append(count);
                count = 1;
            }
            prev = ch;
        }
        m.append(prev);
        m.append(count);
        return m.toString();
    }
}
