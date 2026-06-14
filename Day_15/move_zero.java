
import java.util.Scanner;

public class move_zero {

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
            move(arr);
            for (int a = 0; a < arr.length; a++) {
                System.out.println(arr[a]);

            }

        }
    }

    static void move(int[] arr) {
        int start = 0;

        for (int a = 0; a < arr.length; a++) {
            if (arr[a] != 0) {
                int temp = arr[start];
                arr[start] = arr[a];
                arr[a] = temp;
                start++;
            }
        }
    }
}
