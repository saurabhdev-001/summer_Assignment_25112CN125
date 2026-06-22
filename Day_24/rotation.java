
import java.util.Scanner;

public class rotation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (rotation(b, a + a)) {
            System.out.println("String is rotational");
        } else {
            System.out.println("String is not rotational");
        }

    }

    static boolean rotation(String m, String n) {
        return n.contains(m);
    }

}
