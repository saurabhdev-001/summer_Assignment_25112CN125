
import java.util.HashMap;
import java.util.Scanner;

public class max_occur {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        char ch = first(a);
        System.out.println(" max occuring of the characater is " + ch);

    }

    static char first(String s) {

        char ch = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max = -1;
        for (char c : map.keySet()) {
            if (max < map.get(c)) {
                max = map.get(c);
                ch = c;
            }
        }
        return ch;

    }
}
