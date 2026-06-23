
import java.util.*;

public class find_common {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (!a.isEmpty()) {
            common(a, b);
        }
    }

    static void common(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (int a = 0; a < s1.length(); a++) {
            set.add(s1.charAt(a));

        }
        char ch;
        System.out.println("common character in the string is ");
        for (int a = 0; a < s2.length(); a++) {
            ch = s2.charAt(a);
            if (set.contains(ch)) {
                System.out.print(ch);
            }
        }

    }
}
