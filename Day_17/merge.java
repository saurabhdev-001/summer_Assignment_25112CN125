
import java.util.Scanner;

public class merge {

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
            int a[] = merge(arr1, arr2);
            for (int b = 0; b < a.length; b++) {
                System.out.println(a[b]);
            }

        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int merg[] = new int[arr1.length + arr2.length];
        int b = 0;
        for (int a = 0; a < arr1.length; a++) {
            merg[b] = arr1[a];
            b++;

        }
        for (int a = 0; a < arr2.length; a++) {
            merg[b] = arr2[a];
            b++;
        }
        return merg;
    }
}
