
import java.util.Scanner;

public class sum_average {

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
        int sum = 0;
        int average;
        for (int a = 0; a < arr.length; a++) {
            sum = sum + arr[a];
        }
        average = sum / arr.length;
        System.out.println("sum of the elements of thE array is " + sum);
        System.out.println("average of the elements of the array is " + average);

    }
}
