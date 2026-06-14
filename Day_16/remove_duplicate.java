
import java.util.HashSet;
import java.util.Scanner;

public class remove_duplicate {

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
            int b = remove(arr);
            for (int a = 0; a < b; a++) {

                System.out.println(arr[a]);

            }
        }
    }

    static int remove(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int b = 0;

        for (int a = 0; a < arr.length; a++) {
            if (!set.contains(arr[a])) {
                set.add(arr[a]);
                arr[b] = arr[a];
                b++;
            }
        }
        return b;
    }
}
