
import java.util.Scanner;

public class count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        a.toLowerCase();
        count(a);

    }

    static void count(String s) {
        int vow_count = 0;
        int cons_count = 0;
        int a = 0;
        char ch;
        while (a < s.length()) {
            ch = s.charAt(a);
            a++;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow_count++;
            } else {
                cons_count++;

            }
        }
        System.out.println("total vowel in the string is " + vow_count);
        System.out.println("total consonants in the string is " + cons_count);

    }
}
