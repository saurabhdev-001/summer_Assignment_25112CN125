
import java.util.Scanner;

public class longest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance");
        String a = sc.nextLine();
        System.out.println("largets word in sentance is " + longest(a));

    }

    static String longest(String s) {
        s = s + " ";
        int max = -1;
        char ch;
        int start = 0;
        int max_start = 0;
        int max_end = 0;
        for (int a = 0; a < s.length(); a++) {
            ch = s.charAt(a);
            if (ch == ' ') {
                if (max < a - start) {
                    max = a - start;
                    max_start = start;
                    max_end = a;

                }
                start = a + 1;

            }

        }
        return s.substring(max_start, max_end);

    }
}
