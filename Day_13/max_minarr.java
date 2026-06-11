
import java.util.Scanner;

public class max_minarr {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n == 0) {
            System.out.println("size of the array NULL");
        } else {
            System.out.println("input elements");

            int index = 0;
            while (index < n) {
                arr[index] = sc.nextInt();
                index++;
            }
            operation(arr);

        }

    }

    static void operation(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
            if (arr[a] < min) {
                min = arr[a];
            }
        }

        System.out.println("maximum of the elements of the array is " + max);
        System.out.println("minimum of the elements of the array is " + min);

    }
}
