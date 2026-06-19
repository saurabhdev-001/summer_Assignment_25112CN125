
import java.util.Scanner;

public class coloumn_sum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n = sc.nextInt();

        int arr1[][] = new int[n][n];
        if (n <= 0) {
            System.out.println("Invalid array size");
        } else {
            System.out.println("input elements of matrix ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    arr1[a][b] = sc.nextInt();
                }
            }
            sum(arr1);

        }
    }

    static void sum(int arr1[][]) {
        int sum = 0;
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1.length; b++) {
                sum = sum + arr1[b][a];
            }
            System.out.println("the sum of coloumn " + (a + 1) + " is " + sum);
            sum = 0;
        }

    }
}
