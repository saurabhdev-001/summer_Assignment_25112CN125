
import java.util.Scanner;

public class rotate_right {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

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
            rotate(arr);
            for (int a = 0; a < arr.length; a++) {
                System.out.println(arr[a]);

            }

        }

    }

    static void rotate(int[] arr) {
        System.out.println("how many times you want to rotate the array right");
        int n = sc.nextInt();
        int k = n;
        if (n >= arr.length) {
            k = n % arr.length;
        }
        int temp = 0;

        for (int a = 0; a < k; a++) {
            for (int b = arr.length - 1; b > 0; b--) {
                temp = arr[b];
                arr[b] = arr[b - 1];
                arr[b - 1] = temp;
            }
        }
    }

}
