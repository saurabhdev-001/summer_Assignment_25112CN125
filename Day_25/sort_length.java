
import java.util.*;

public class sort_length {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of words");
        int n = sc.nextInt();
        int[] l = new int[n];
        String s[] = new String[n];
        sc.nextLine();
        System.out.println("enter the names");
        for (int a = 0; a < s.length; a++) {
            s[a] = sc.nextLine();
            l[a] = s[a].length();
        }
        sort(l, s);
        for (int a = 0; a < s.length; a++) {
            System.out.println(s[a]);

        }

    }

    static void sort(int arr[], String[] s) {
        int temp;
        int a = 0;
        boolean swap = false;
        String t;
        while (a < arr.length) {
            swap = false;
            for (int b = 0; b < arr.length - 1 - a; b++) {
                if (arr[b] > arr[b + 1]) {
                    temp = arr[b];
                    t = s[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                    s[b] = s[b + 1];
                    s[b + 1] = t;
                    swap = true;
                }

            }
            if (swap == false) {
                break;
            }
            a++;

        }

    }

}
