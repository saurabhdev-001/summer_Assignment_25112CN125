
import java.util.Scanner;

public class sort_descending {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n <= 0) {
            System.out.println("Invalid array size");
        } else {
            System.out.println("input elements");

            int index = 0;
            while (index < n) {
                arr[index] = sc.nextInt();
                index++;
            }
            sort(arr);
            System.out.println("sorted array is ");
            for (int a = 0; a < arr.length; a++) {
                System.out.println(arr[a]);
            }
        }
    }

    static void sort(int[] arr) {
        int max;
        int pos = 0;

        for (int a = 0; a < arr.length; a++) {
            max = arr[a];
            pos = -1;
            for (int b = a + 1; b < arr.length; b++) {
                if (max < arr[b]) {
                    max = arr[b];
                    pos = b;
                }
            }
            if (pos != -1) {
                arr[pos] = arr[a];
                arr[a] = max;
            }

        }
    }
}
