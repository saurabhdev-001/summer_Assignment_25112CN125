
import java.util.Scanner;

public class linear_search {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n <= 0) {
            System.out.println("size of the array NULL");
        } else {
            System.out.println("input elements");

            int index = 0;
            while (index < n) {
                arr[index] = sc.nextInt();
                index++;
            }
            System.out.println("enter the element you want to search");
            int num = sc.nextInt();
            int m = linear_search(num, arr);
            if (m != -1) {
                System.out.println("element found at the " + m + " index");
            } else {
                System.out.println("element deoes not exists in the array ");
            }

        }

    }

    static int linear_search(int a, int[] arr) {
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == a) {
                return b;
            }
        }
        return -1;
    }
}
