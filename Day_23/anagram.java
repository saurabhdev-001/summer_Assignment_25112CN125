
import java.util.HashMap;
import java.util.Scanner;

public class anagram {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the words");
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (first(a, b)) {
            System.out.println("strings are angram");

        } else {
            System.out.println("strings are not angram");

        }

    }

    static boolean first(String s, String t) {

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
        for (int a = 0; a < t.length(); a++) {
            ch = t.charAt(a);
            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }

            } else {
                return false;
            }

        }
        return map.isEmpty();

    }
}
