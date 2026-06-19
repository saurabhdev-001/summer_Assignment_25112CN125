
import java.util.Scanner;

public class length {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();

        System.out.println((int) length(a));

    }

    static int length(String s) {

        char[] arr = s.toCharArray();
        int count = 0;

        for (char c : arr) {
            count++;
        }
        return count;
    }
}
