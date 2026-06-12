
import java.util.Scanner;

public class sec_largest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        } else {
            System.out.println("input elements");

            int index = 0;
            while (index < n) {
                arr[index] = sc.nextInt();
                index++;
            }
        }
        int response = search(arr);
        if (response != Integer.MIN_VALUE) {
            System.out.println("the second largest element in the array is " + response);

        }

    }

    static int search(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int a = 0; a < arr.length; a++) {

            if (arr[a] > first) {
                second = first;
                first = arr[a];
            } else if (arr[a] > second && arr[a] != first) {
                second = arr[a];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("no second largest element exists");
        }

        return second;
    }
}
