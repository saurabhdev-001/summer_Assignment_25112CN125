
import java.util.Scanner;

public class bin_search {

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

            System.out.println("enter the element you want to search");
            int a = sc.nextInt();
            sort(arr);
            System.out.println("sorted array is ");
            for (int m = 0; m < arr.length; m++) {
                System.out.println(arr[m]);
            }
            int ind = search(arr, a);
            if (ind != -1) {
                System.out.println("element found at " + ind + " index");

            } else {
                System.out.println("no such elements");
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

    static int search(int arr[], int ele) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] > ele) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
