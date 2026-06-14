
import java.util.Scanner;

public class missing_no {

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
            int found = find(arr);
            if (found > 0) {
                System.out.println("missing element is " + found);
            }
        }
    }

    static int find(int[] arr) {
        int temp = 0;
        for (int a = 0; a < arr.length;) {
            if (arr[a] == a + 1) {
                a++;
            } else {
                if (arr[a] <= arr.length && arr[a] > 0) {

                    temp = arr[arr[a] - 1];
                    if (temp == arr[a]) {
                        a++;
                        continue;
                    }
                    arr[arr[a] - 1] = arr[a];
                    arr[a] = temp;
                } else {
                    a++;
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            if (!(arr[a] == a + 1)) {
                return a + 1;
            }
        }
        System.out.println("No element is missing");
        return -99;

    }
}
