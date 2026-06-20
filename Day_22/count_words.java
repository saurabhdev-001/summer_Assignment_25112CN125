
import java.util.Scanner;

public class count_words {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance");
        String a = sc.nextLine();
        a = " " + a;
        System.out.println("total words in the sentance is " + count(a));
    }

    static int count(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))
                    && Character.isWhitespace(s.charAt(i - 1))) {
                count++;
            }
        }

        return count;
    }
}
