
import java.util.Scanner;

public class freq {

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
            System.out.println("enter the elemnt of which you want to find out the frequency");
            int num = sc.nextInt();
            int response = frequency(arr, num);
            if (response == 0) {
                System.out.println("element does not exists in the array");
            } else {
                System.out.println("element frequency in the array is " + response);
            }

        }
    }

    static int frequency(int[] arr, int num) {
        int freq = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == num) {
                freq++;
            }
        }
        return freq;

    }
}
