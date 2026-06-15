
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class common {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the two array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        if (m <= 0 || n <= 0) {
            System.out.println("Invalid array size");
        } else {
            System.out.println("input elements of array 1");

            int index = 0;
            while (index < n) {
                arr1[index] = sc.nextInt();
                index++;
            }
            index = 0;
            System.out.println("input elements of array 2");
            while (index < m) {
                arr2[index] = sc.nextInt();
                index++;
            }

            System.out.println(intersection(arr1, arr2));
        }

    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int a = 0; a < arr1.length; a++) {
            st.add(arr1[a]);
        }
        for (int b = 0; b < arr2.length; b++) {
            if (st.contains(arr2[b])) {
                list.add(arr2[b]);
            }
        }
        return list;

    }

}
