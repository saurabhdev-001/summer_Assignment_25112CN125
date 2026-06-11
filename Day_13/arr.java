
import java.util.Scanner;

public class arr {

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
            display(arr);
        }
    }

    static void display(int[] arr) {
        System.out.println("elements of the array are");
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
