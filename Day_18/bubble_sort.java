
import java.util.Scanner;

public class bubble_sort {

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
