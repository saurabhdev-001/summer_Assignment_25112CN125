
import java.util.Scanner;

public class pair_sum {

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
            System.out.println("enter the target");
            int target = sc.nextInt();
            find(arr, target);
        }
    }

    static void find(int[] arr, int target) {
        for (int a = 0; a < arr.length - 1; a++) {
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[a] + arr[b] == target) {
                    System.out.println("elements are " + arr[a] + " and " + arr[b] + " found at indices " + a + " and " + b);
                    return;
                }

            }
        }
        System.out.println("no such pairs");

    }

}
