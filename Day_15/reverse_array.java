
import java.util.Scanner;

public class reverse_array {

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
            reverse(arr);
            for (int a = 0; a < arr.length; a++) {
                System.out.println(arr[a]);

            }
        }
    }

    static void reverse(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int length = arr.length;
        int l = arr.length / 2 - 1;
        int temp;
        for (int a = 0; a <= l; a++) {
            temp = arr[a];
            arr[a] = arr[length - a - 1];
            arr[length - a - 1] = temp;

        }
    }

}
