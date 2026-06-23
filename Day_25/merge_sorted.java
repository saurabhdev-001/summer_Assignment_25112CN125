
import java.util.Scanner;

public class merge_sorted {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size  two arrays");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter the elemenst of the array1");
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int a = 0; a < m; a++) {
            arr1[a] = sc.nextInt();
        }
        System.out.println("enter the elemenst of the array2");
        for (int a = 0; a < n; a++) {
            arr2[a] = sc.nextInt();
        }
        sort(arr1);
        sort(arr2);
        int merged[] = new int[arr1.length + arr2.length];
        merged = merge(arr1, arr2);

        System.out.println("SORTED ARRAY IS ");

        for (int a = 0; a < merged.length; a++) {
            System.out.println(merged[a]);
        }

    }

    static int[] merge(int a1[], int a2[]) {
        int merge[] = new int[a1.length + a2.length];
        int b = 0;
        int c = 0;

        for (int a = 0; a < merge.length; a++) {
            if (b < a1.length && c < a2.length) {
                if (a1[b] > a2[c]) {
                    merge[a] = a2[c];
                    c++;
                } else {
                    merge[a] = a1[b];
                    b++;
                }
                continue;
            }
            if (c >= a2.length) {
                merge[a] = a1[b];
                b++;
                continue;

            }
            if (b >= a1.length) {
                merge[a] = a2[c];
                c++;

            }

        }
        return merge;
    }

    static void sort(int arr[]) {
        int temp;
        int a = 0;
        boolean swap = false;
        while (a < arr.length) {
            swap = false;
            for (int b = 0; b < arr.length - 1 - a; b++) {
                if (arr[b] > arr[b + 1]) {
                    temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
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
