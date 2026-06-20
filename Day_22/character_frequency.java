
import java.util.HashMap;
import java.util.Scanner;

public class character_frequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance");
        String a = sc.nextLine();
        a = a.toLowerCase();
        HashMap<Character, Integer> map = count(a);
        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }

    }

    static HashMap<Character, Integer> count(String s) {

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

        return map;
    }
}
