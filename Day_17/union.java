
import java.util.HashSet;
import java.util.Scanner;

public class union {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the two array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        if (m <= 0 && n <= 0) {
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
            int b[] = union(arr1, arr2);
            for (int c = 0; c < b.length; c++) {
                System.out.println(b[c]);
            }
        }

    }

    static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for (int a = 0; a < arr1.length; a++) {
            if (!set.contains(arr1[a])) {
                set.add(arr1[a]);
                l++;

            }
        }
        for (int a = 0; a < arr2.length; a++) {
            if (!set.contains(arr2[a])) {
                set.add(arr2[a]);
                l++;
            }
        }
        int a[] = new int[l];
        int index = 0;
        for (int ele : set) {
            a[index] = ele;
            index++;

        }
        return a;

    }
}
