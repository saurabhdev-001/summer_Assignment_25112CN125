
import java.util.HashMap;
import java.util.Scanner;

public class first_non_repeating {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        char ch = first(a);
        if (Character.isWhitespace(ch)) {
            System.out.println("no not repeating character exists");
        } else {
            System.out.println("the first non repeating character is " + ch);
        }

    }

    static char first(String s) {

        char ch;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int a = 0; a < s.length(); a++) {
            ch = s.charAt(a);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';

    }
}
