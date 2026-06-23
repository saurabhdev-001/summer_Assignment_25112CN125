
import java.util.*;

public class sort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of words");
        int n = sc.nextInt();
        String[] s = new String[n];
        sc.nextLine();
        System.out.println("enter the names");
        for (int a = 0; a < s.length; a++) {
            s[a] = sc.nextLine();
        }
        System.out.println("alphabetical order of the string is ");
        sort(s);
        for (int a = 0; a < s.length; a++) {
            System.out.println(s[a]);

        }

    }

    static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
