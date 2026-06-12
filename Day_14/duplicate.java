
import java.util.HashMap;
import java.util.Scanner;

public class duplicate {

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
            check(arr);
        }
    }

    static void check(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("duplicate elements in the array is  ");
        for (int a = 0; a < arr.length; a++) {
            if (map.containsKey(arr[a])) {
                if (map.get(arr[a]) == 2) {
                    continue;
                } else {
                    System.out.print(arr[a]);
                    map.put(arr[a], 2);
                }
            } else {
                map.put(arr[a], 1);
            }
        }
    }

}
