
import java.util.Scanner;

public class remove_spaces {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance");
        String a = sc.nextLine();

        System.out.println("new word without spaces is  " + create(a));
    }

    static String create(String s) {

        char ch;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
