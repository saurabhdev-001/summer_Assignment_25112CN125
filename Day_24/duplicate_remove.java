
import java.util.*;

public class duplicate_remove {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        if (!a.isEmpty()) {
            System.out.println(remove(a));
        }
    }

    static String remove(String s) {
        StringBuilder m = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        char ch;
        for (int a = 0; a < s.length(); a++) {
            ch = s.charAt(a);
            if (!set.contains(ch)) {
                m.append(ch);
                set.add(ch);
            }

        }
        return m.toString();
    }
}
