
import java.util.HashMap;
import java.util.Scanner;

public class max_freq {

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
            System.out.println("max frequency element in the array is " + max(arr));

        }
    }

    static int max(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < arr.length; a++) {
            if (map.containsKey(arr[a])) {
                map.put(arr[a], map.get(arr[a]) + 1);
            } else {
                map.put(arr[a], 1);
            }

        }
        int max = 0;
        int freq = -1;
        for (int ele : map.keySet()) {
            if (map.get(ele) > freq) {
                freq = map.get(ele);
                max = ele;
            }
        }
        return max;

    }
}
